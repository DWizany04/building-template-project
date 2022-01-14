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

    @Test
    void shallNotAddAResidentTwice()
    {
        String initialResidents = "initialResident";
        Building building = new Building(1, initialResidents);
        building.addResident("initialResident");
        try {
            assertNotEquals("initialResident", building.getResidents()[1]);
        }
        catch (Exception e)
        {
            assertTrue(true);
        }
    }

    @Test
    void shallCorrectlyRemoveAResident()
    {
        String initialResidents = "initialResident";
        Building building = new Building(1, initialResidents);
        building.addResident("second");
        building.removeResident("second");
        try {
            assertNotEquals("second", building.getResidents()[1]);
        }
        catch (Exception e)
        {
            assertTrue(true);
        }
    }

    @Test
    void shallNotRemoveAResidentThatDoesntExists()
    {
        String initialResidents = "initialResident";
        Building building = new Building(1, initialResidents);
        boolean success = building.removeResident("second");
        assertEquals(false, success);
    }


}
