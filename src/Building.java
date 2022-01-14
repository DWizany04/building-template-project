import java.util.LinkedList;
import java.util.List;

public class Building {
    private int id;
    private String initialResident;
    private String[] residents;

    public Building(int id, String initalResident) {
        this.id = id;
        this.initialResident = initalResident;
    }

    public Building(int id, String[] residents) {
        this.id = id;
        this.initialResident = residents[0];
        this.residents = residents;
    }

    public int getId() {
        return id;
    }

    public String getInitialResident() {
        return initialResident;
    }

    public String[] getResidents() {
        return residents;
    }
}
