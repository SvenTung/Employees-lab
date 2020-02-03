import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Jaden", "YG825681B", 28000, "IT", 15000);
    }

    @Test
    public void canGetName(){ assertEquals("Jaden", director.getName()); }

    @Test
    public void canGetNINumber(){
        assertEquals("YG825681B", director.getNi());
    }

    @Test
    public void canGetSalary(){
        assertEquals(28000, director.getSalary(), 0);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("IT", director.getDeptName());
    }

    @Test
    public void canGiveRaise(){
        director.raiseSalary(2000);
        assertEquals(30000, director.getSalary(), 0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(560, director.payBonus(), 0);
    }

    @Test
    public void canGetBudget(){ assertEquals(15000, director.getBudget(), 0); }

    @Test
    public void canSetName() {
        director.setName("Shinra");
        assertEquals("Shinra", director.getName());
    }
}
