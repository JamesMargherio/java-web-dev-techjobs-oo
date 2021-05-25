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
    Job testJob7;

    @Before
    public void jobObject() {
        testJob1 = new Job();
        testJob2 = new Job();
        testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJob5 = new Job("", new Employer(""), new Location(""), new PositionType("Hacker"), new CoreCompetency("Desperation"));
        testJob6 = new Job("Console Cowboy", new Employer("Wintermute"), new Location("Cyberspace"), new PositionType(""), new CoreCompetency(""));
        testJob7 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

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

    @Test
    public void toStringMethodStartsAndEndsWithBlankLine() {
        assertTrue(testJob3.toString().startsWith("\n"));
        assertTrue(testJob3.toString().endsWith("\n"));
    }

    @Test
    public void toStringMethodPrintsFieldLabelsAndData() {
        assertTrue(testJob3.toString().contains("\nID: " + testJob3.getId()));
        assertTrue(testJob3.toString().contains("\nName: " + testJob3.getName()));
        assertTrue(testJob3.toString().contains("\nEmployer: " + testJob3.getEmployer()));
        assertTrue(testJob3.toString().contains("\nLocation: " + testJob3.getLocation()));
        assertTrue(testJob3.toString().contains("\nPosition Type: " + testJob3.getPositionType()));
        assertTrue(testJob3.toString().contains("\nCore Competency: " + testJob3.getCoreCompetency()));
    }

    @Test
    public void toStringMethodHandlesEmptyFields() {
        assertTrue(testJob5.toString().contains("Name: Data not available"));
        assertTrue(testJob5.toString().contains("Employer: Data not available"));
        assertTrue(testJob5.toString().contains("Location: Data not available"));
        assertTrue(testJob6.toString().contains("Position Type: Data not available"));
        assertTrue(testJob6.toString().contains("Core Competency: Data not available"));
    }

    @Test
    public void toStringMethodRespondsIfJobContainsOnlyID() {
        assertEquals(testJob7.toString(), "\nOOPS! This job does not seem to exist!");
    }

}

