import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BuildingTest {
    @Test
    void shallInitializeWithCorrectValuesWhenGivenAString()
    {
        Building building = new Building( 1, "initialResident");
        assertEquals(1, building.getId());
        assertEquals("initialResident" , building.getInitialResident());
    }
}
