package com.ps.assignment3.server;

import com.ps.assignment3.models.Medication;
import com.ps.assignment3.sql.MedicationConnection;
import com.ps.assignment3.user.MedicationService;
import com.ps.assignment3.user.UserService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.ArrayList;

public class GRPCServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(9090).addService(new MedicationService()).build();
       /* MedicationConnection medicationConnection = new MedicationConnection();
        ArrayList<Medication> medications = medicationConnection.getAll();
        for (Medication m:medications){
            System.out.println(m.getId());
            System.out.println(m.getDescription());
            System.out.println(m.getStart());
            System.out.println(m.getEnd());
        }*/
        server.start();
        System.out.println("--- SERVER STARTED ---");
        server.awaitTermination();
    }
}
