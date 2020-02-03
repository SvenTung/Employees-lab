import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Lisa", "CX739163A", 20000);
    }

    @Test
    public void canGetName(){
        assertEquals("Lisa", databaseAdmin.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("CX739163A", databaseAdmin.getNi());
    }

    @Test
    public void canGetSalary(){
        assertEquals(20000, databaseAdmin.getSalary(), 0);
    }

    @Test
    public void canGiveRaise(){
        databaseAdmin.raiseSalary(4375);
        assertEquals(24375, databaseAdmin.getSalary(), 0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(200, databaseAdmin.payBonus(), 0);
    }

    @Test
    public void canSetName() {
        databaseAdmin.setName("Rebecca");
        assertEquals("Rebecca", databaseAdmin.getName());
    }
}
