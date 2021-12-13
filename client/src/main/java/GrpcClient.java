import Gui.MedicationGui;

import java.text.ParseException;
import java.util.Timer;
import java.util.TimerTask;

public class GrpcClient {
    public static void main(String[] args) throws ParseException {
        int dayInMilliseconds = 86400000;
        MedicationGui medicationGui = new MedicationGui();
        //medicationGui.open();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Getting medication plan");
                try {
                    medicationGui.open();
                }
                catch (java.text.ParseException e){
                    System.out.println("Incorect date format");
                }
            }
        },1000,dayInMilliseconds );
    }
}
