import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Sven", "HK294628D", 23500, "IT");
    }

    @Test
    public void canGetName(){
        assertEquals("Sven", manager.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("HK294628D", manager.getNi());
    }

    @Test
    public void canGetSalary(){
        assertEquals(23500, manager.getSalary(), 0);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("IT", manager.getDeptName());
    }

    @Test
    public void canGiveRaise(){
        manager.raiseSalary(1500);
        assertEquals(25000, manager.getSalary(), 0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(235, manager.payBonus(), 0);
    }

    @Test
    public void canSetName() {
        manager.setName("Peter");
        assertEquals("Peter", manager.getName());
    }
}
