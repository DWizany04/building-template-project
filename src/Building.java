import java.util.LinkedList;
import java.util.List;

public class Building {
    private int id;
    List<String> residents = new LinkedList<String>();

    public Building(int id, String initalResident) {
        this.id = id;
        residents.add(initalResident);
    }

    public Building(int id, String[] residents) {
        this.id = id;
        for (String s: residents) {
            this.residents.add(s);
        }
    }

    public void addResident(String resident)
    {
        boolean exists = false;
        for (String s: this.residents) {
            if(resident.equals(s))
            {
                exists = true;
            }
        }
        if(!exists)
        {
            residents.add(resident);
        }
    }

    public boolean removeResident(String resident)
    {
        boolean exists = false;
        for (String s: this.residents) {
            if (resident.equals(s)) {
                exists = true;
            }
        }
        if(!exists)
        {
            return false;
        }
        residents.remove(resident);
        return true;
    }

    public int getNumberOfResidents()
    {
        return this.residents.size();
    }

    public int getId() {
        return id;
    }

    public String[] getResidents() {
        String[] rString = new String[this.residents.size()];
        for(int i = 0; i < this.residents.size(); i++)
        {
            rString[i] = this.residents.get(i);
        }
        return  rString;
    }
}
