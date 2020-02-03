import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("John", "LM273957C", 22000);
    }

    @Test
    public void canGetName(){
        assertEquals("John", developer.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("LM273957C", developer.getNi());
    }

    @Test
    public void canGetSalary(){
        assertEquals(22000, developer.getSalary(), 0);
    }

    @Test
    public void canGiveRaise(){
        developer.raiseSalary(2000);
        assertEquals(24000, developer.getSalary(), 0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(220, developer.payBonus(), 0);
    }

    @Test
    public void canSetName() {
        developer.setName("Jonathan");
        assertEquals("Jonathan", developer.getName());
    }
}
