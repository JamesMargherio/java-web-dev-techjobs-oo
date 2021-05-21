package org.launchcode.techjobs_oo.tests;

import org.junit.Test;
import org.junit.Before;

import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job testJob1;
    Job testJob2;
    Job testJob3;
    Job testJob4;
    Job testJob5;
    Job testJob6;

    @Before
    public void jobObject() {
        testJob1 = new Job();
        testJob2 = new Job();
        testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJob5 = new Job("Console Cowboy", new Employer("Wintermute"), new Location("Cyberspace"), new PositionType(), new CoreCompetency("Desperation"));
        testJob6 = new Job();

    }

    @Test
    public void testSettingJobId() {
        assertEquals(testJob1.getId() + 1, testJob2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(testJob3.getEmployer() instanceof Employer);
        assertTrue(testJob3.getLocation() instanceof Location);
        assertTrue(testJob3.getPositionType() instanceof PositionType);
        assertTrue(testJob3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(testJob3.getName(), "Product tester");
        assertEquals(testJob3.getEmployer().getValue(), "ACME");
        assertEquals(testJob3.getLocation().getValue(), "Desert");
        assertEquals(testJob3.getPositionType().getValue(), "Quality control");
        assertEquals(testJob3.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(testJob3.equals(testJob4));
    }

//    @Test
//    public void toStringMethodStartsAndEndsWithBlankLine() {
//        assert
//    }

    @Test
    public void toStringMethodPrintsFieldLabelsAndData() {
        assertTrue(testJob3.toString().contains("ID: " + testJob3.getId()));
        assertTrue(testJob3.toString().contains("Name: " + testJob3.getName()));
        assertTrue(testJob3.toString().contains("Employer: " + testJob3.getEmployer()));
        assertTrue(testJob3.toString().contains("Location: " + testJob3.getLocation()));
        assertTrue(testJob3.toString().contains("Position Type: " + testJob3.getPositionType()));
        assertTrue(testJob3.toString().contains("Core Competency: " + testJob3.getCoreCompetency()));
    }

    @Test
    public void toStringMethodHandlesEmptyFields() {
        assertTrue(testJob5.toString().contains("Data not available"));
    }

    @Test
    public void toStringMethodRespondsIfJobContainsOnlyID() {
        assertEquals(testJob6.toString(), "OOPS! This job does not seem to exist!");
    }

}

