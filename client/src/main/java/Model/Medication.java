package Model;

import java.sql.Timestamp;

public class Medication {
    private int id;
    private String description;
    private Timestamp start;
    private Timestamp end;

    public Medication() {
    }

    public Medication(int id, String description, Timestamp start, Timestamp end) {
        this.id = id;
        this.description = description;
        this.start = start;
        this.end = end;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getStart() {
        return start;
    }

    public void setStart(Timestamp start) {
        this.start = start;
    }

    public Timestamp getEnd() {
        return end;
    }

    public void setEnd(Timestamp end) {
        this.end = end;
    }
}
