import java.util.LinkedList;
import java.util.List;

public class Building {
    private int id;
    private String initialResident;


    public Building(int id, String initalResident) {
        this.id = id;
        this.initialResident = initalResident;
    }

    public int getId() {
        return id;
    }

    public String getInitialResident() {
        return initialResident;
    }
}
