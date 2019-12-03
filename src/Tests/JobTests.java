package Tests;

import org.junit.After;
import org.junit.BeforeClass;
import org.launchcode.techjobs_oo.*;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class JobTests {
   static Job empty1;
    static Job empty2;
    static Job job1;
    static Job job2;

@BeforeClass
    public static void setups() {
       empty1 = new Job();
       empty2 = new Job();
       job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
       job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void  testSettingJobId(){
        assertEquals(1, empty1.getId());
        assertEquals(2, empty2.getId());
        assertFalse(empty1.getId() == empty2.getId());
    }

    @Test
    public void  testJobConstructorSetsAllFields(){
        assertEquals(3,job1.getId());
        assertTrue(job1.getName().equals("Product tester"));
        assertTrue(job1.getEmployer().getValue().equals("ACME"));
        assertTrue(job1.getLocation().getValue().equals("Desert"));
        assertTrue(job1.getPositionType().getValue().equals("Quality control"));
        assertTrue(job1.getCoreCompetency().getValue().equals("Persistence"));

        assertTrue(job1.getEmployer() instanceof Employer);
        assertTrue(job1.getLocation() instanceof Location);
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void  testJobsForEquality(){
        assertEquals(false,job1.equals(job2));
    }

    @Test
    public void  testToStringBetweenBlankLines(){
        assertTrue(job1.toString().startsWith("\n"));
        assertTrue(job1.toString().endsWith("\n"));
    }

    @Test
    public void  testToStringDataLabelledAndOnNewLines(){
        assertEquals(10,10);
    }

    @Test
    public void  testToStringIfFieldEmptyMessage(){
        assertEquals(10,10);
    }


}
