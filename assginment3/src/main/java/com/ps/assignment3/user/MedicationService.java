package com.ps.assignment3.user;

import com.ps.assignment3.MedicationOuterClass;
import com.ps.assignment3.User;
import com.ps.assignment3.medicationGrpc;
import com.ps.assignment3.models.Medication;
import com.ps.assignment3.sql.MedicationConnection;
import com.ps.assignment3.utils.Converters;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;

public class MedicationService extends medicationGrpc.medicationImplBase {
    MedicationConnection medicationConnection = new MedicationConnection();
    @Override
    public void getAll(MedicationOuterClass.Empty request, StreamObserver<MedicationOuterClass.MedicationList> responseObserver) {
        System.out.println("get all");
        MedicationOuterClass.MedicationList.Builder response = MedicationOuterClass.MedicationList.newBuilder();
        ArrayList<Medication> medicationList = medicationConnection.getAll();
        for (Medication m:medicationList){
            MedicationOuterClass.Medication.Builder med = MedicationOuterClass.Medication.newBuilder();
            med.setMedicationId(m.getId());
            med.setDescription(m.getDescription());
            med.setStart(Converters.DateToString(m.getStart()));
            med.setEnd(Converters.DateToString(m.getEnd()));
            response.addMeds(med);
        }
        response.build();
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getById(MedicationOuterClass.IdMessage request, StreamObserver<MedicationOuterClass.Medication> responseObserver) {
        MedicationOuterClass.Medication.Builder response = MedicationOuterClass.Medication.newBuilder();
        Medication medication = medicationConnection.getById(request.getMedicationId());
        response.setMedicationId(medication.getId());
        response.setDescription(medication.getDescription());
        response.setStart(Converters.DateToString(medication.getStart()));
        response.setEnd(Converters.DateToString(medication.getEnd()));
        response.build();
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void deleteById(MedicationOuterClass.IdMessage request, StreamObserver<MedicationOuterClass.Empty> responseObserver) {
        medicationConnection.deleteById(request.getMedicationId());
        MedicationOuterClass.Empty.Builder response = MedicationOuterClass.Empty.newBuilder();
        response.build();
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
