package Repository;

import Model.Medication;
import com.ps.assignment3.MedicationOuterClass;
import com.ps.assignment3.medicationGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.ArrayList;
import java.util.List;

public class MedicationRepository {
    ManagedChannel channel =
            ManagedChannelBuilder.forAddress("localhost",9090).usePlaintext().build();

    medicationGrpc.medicationBlockingStub medicationStub = medicationGrpc.newBlockingStub(channel);
    MedicationOuterClass.Empty emptyRequest = MedicationOuterClass.Empty.getDefaultInstance();

    public List<MedicationOuterClass.Medication> getAll(){
        MedicationOuterClass.MedicationList medicationListResponse =
                medicationStub.getAll(emptyRequest);
        List<MedicationOuterClass.Medication> medicationList = medicationListResponse.getMedsList();
        return medicationList;

    }

    public void DeleteById(int id){
        MedicationOuterClass.IdMessage request = MedicationOuterClass.IdMessage.newBuilder().setMedicationId(id).build();
        medicationStub.deleteById(request);
    }
}
