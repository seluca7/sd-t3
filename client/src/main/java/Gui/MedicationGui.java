package Gui;

import Repository.MedicationRepository;
import Utils.Converters;
import com.ps.assignment3.MedicationOuterClass;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class MedicationGui implements ActionListener {
    JFrame frame = new JFrame("Assignment 3");
    JButton button = new JButton("Take medication");
    JTextField idInput = new JTextField("medication id");
    MedicationRepository medicationRepository = new MedicationRepository();
    List<String> columns = new ArrayList<String>();
    List<String[]> values = new ArrayList<String[]>();
    public void open() throws ParseException {
        List<MedicationOuterClass.Medication> medicationList = medicationRepository.getAll();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 510);
        button.addActionListener(this);
        columns.add("id");
        columns.add("description");
        columns.add("start date");
        columns.add("end date");
        for (MedicationOuterClass.Medication m: medicationList) {
            values.add(new String[]{Integer.toString(m.getMedicationId()), m.getDescription(), Converters
                    .stringToDate(m.getStart()).toString(), Converters.stringToDate(m.getEnd()).toString()});
        }
        TableModel tableModel = new DefaultTableModel(values.toArray(new Object[][] {}), columns.toArray());
        JTable table = new JTable(tableModel);
        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(table), BorderLayout.PAGE_START);
        frame.add(table.getTableHeader(), BorderLayout.NORTH);
        frame.add(idInput, BorderLayout.CENTER);
        frame.add(button, BorderLayout.PAGE_END);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        medicationRepository.DeleteById(Integer.parseInt(idInput.getText()));
        this.close();
    }

    public void close(){
        frame.dispose();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            this.open();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
