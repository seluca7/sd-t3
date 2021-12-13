package com.ps.assignment3.sql;

import com.ps.assignment3.models.Medication;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MedicationConnection {
    private static final String DB_URL= "jdbc:mysql://localhost:3306/Test";
    private static final String USER = "root";
    private static final String PASS = "root";
    private static final int TIMEOUT = 5;
    private Connection connection;

    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + "tema3" + "?useSSL=false&allowPublicKeyRetrieval=true", USER, PASS);
        } catch (SQLException | ClassNotFoundException var3) {
            var3.printStackTrace();
        }
        return this.connection;
    }
    public Medication getById(int id) {
        Connection connection = this.getConnection();
        Medication medication = new Medication();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM medication WHERE medication_id =?");
            preparedStatement.setString(1,Integer.toString(id));
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                medication.setId(resultSet.getInt(1));
                medication.setDescription(resultSet.getString(2));
                medication.setStart(resultSet.getTimestamp(3));
                medication.setEnd(resultSet.getTimestamp(4));
            }
        } catch (SQLException var3) {
            var3.printStackTrace();
        }
        return medication;
    }

    public void deleteById(int id){
        Connection connection = this.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM medication WHERE medication_id =?");
            preparedStatement.setString(1,Integer.toString(id));
            preparedStatement.executeUpdate();
        } catch (SQLException var3) {
            var3.printStackTrace();
        }
    }

    public ArrayList<Medication> getAll(){
        Connection connection = this.getConnection();
        ArrayList<Medication> medicationList = new ArrayList<>();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM medication");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Medication medication = new Medication();
                medication.setId(resultSet.getInt(1));
                medication.setDescription(resultSet.getString(2));
                medication.setStart(resultSet.getTimestamp(3));
                medication.setEnd(resultSet.getTimestamp(4));
                medicationList.add(medication);
            }
        }
        catch (SQLException var6){
            var6.printStackTrace();
        }
        return medicationList;
    }
}
