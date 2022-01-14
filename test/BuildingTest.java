import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BuildingTest {
    @Test
    void shallInitializeWithCorrectValuesWhenGivenAString()
    {
        Building building = new Building( 1, "initialResident");
        assertEquals(1, building.getId());
        assertEquals("initialResident" , building.getResidents()[0]);
    }

    @Test
    void shallInitializeWithCorrectValuesWhenGivenAStringArray()
    {
        String[] initialResidents = {"initialResident", "secondResident"};
        Building building = new Building(1, initialResidents);
        assertEquals(1, building.getId());
        assertEquals("initialResident" , building.getResidents()[0]);
        assertEquals("secondResident" , building.getResidents()[1]);
    }

    @Test
    void shallCorrectlyAddAResident()
    {
        String initialResidents = "initialResident";
        Building building = new Building(1, initialResidents);
        building.addResident("second");
        assertEquals("second", building.getResidents()[1]);
    }
}
