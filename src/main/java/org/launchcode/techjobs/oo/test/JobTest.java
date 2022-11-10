package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId() {
        org.launchcode.techjobs.oo.Job testJobEmpty1 = new org.launchcode.techjobs.oo.Job();
        org.launchcode.techjobs.oo.Job testJobEmpty2 = new org.launchcode.techjobs.oo.Job();
        assertNotEquals(testJobEmpty1, testJobEmpty2);
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        org.launchcode.techjobs.oo.Job testJob = new org.launchcode.techjobs.oo.Job("Product tester", new org.launchcode.techjobs.oo.Employer("ACME"), new org.launchcode.techjobs.oo.Location("Desert"), new org.launchcode.techjobs.oo.PositionType("Quality control"), new org.launchcode.techjobs.oo.CoreCompetency("Persistence"));
        assertEquals("Product tester", testJob.getName());
        assertEquals("ACME", testJob.getEmployer().getValue());
        assertEquals("Desert", testJob.getLocation().getValue());
        assertEquals("Quality control", testJob.getPositionType().getValue());
        assertEquals("Persistence", testJob.getCoreCompetency().getValue());

        assertTrue(testJob instanceof org.launchcode.techjobs.oo.Job);
        assertTrue(testJob.getEmployer() instanceof org.launchcode.techjobs.oo.Employer);
        assertTrue(testJob.getLocation() instanceof org.launchcode.techjobs.oo.Location);
        assertTrue(testJob.getPositionType() instanceof org.launchcode.techjobs.oo.PositionType);
        assertTrue(testJob.getCoreCompetency() instanceof org.launchcode.techjobs.oo.CoreCompetency);



    }

    @Test
    public void testJobsForEquality() {
        org.launchcode.techjobs.oo.Job job1 = new org.launchcode.techjobs.oo.Job("Barista", new org.launchcode.techjobs.oo.Employer("Comet Coffee"), new org.launchcode.techjobs.oo.Location("Saint Louis"), new org.launchcode.techjobs.oo.PositionType("Staff"), new org.launchcode.techjobs.oo.CoreCompetency("Food Service"));
        org.launchcode.techjobs.oo.Job job2 = new org.launchcode.techjobs.oo.Job("Barista", new org.launchcode.techjobs.oo.Employer("Comet Coffee"), new org.launchcode.techjobs.oo.Location("Saint Louis"), new org.launchcode.techjobs.oo.PositionType("Staff"), new org.launchcode.techjobs.oo.CoreCompetency("Food Service"));
        assertFalse(job1.equals(job2));
    }


    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        org.launchcode.techjobs.oo.Job testJob = new org.launchcode.techjobs.oo.Job("Product tester", new org.launchcode.techjobs.oo.Employer("ACME"), new org.launchcode.techjobs.oo.Location("Desert"), new org.launchcode.techjobs.oo.PositionType("Quality control"), new org.launchcode.techjobs.oo.CoreCompetency("Persistence"));
        assertEquals(testJob.toString().charAt(0), '\n');
        assertEquals(testJob.toString().charAt(testJob.toString().length() -1), '\n');
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        org.launchcode.techjobs.oo.Job testJob = new org.launchcode.techjobs.oo.Job("Barista", new org.launchcode.techjobs.oo.Employer("Comet Coffee"), new org.launchcode.techjobs.oo.Location("Saint Louis"), new org.launchcode.techjobs.oo.PositionType("Staff"), new org.launchcode.techjobs.oo.CoreCompetency("Food Service"));
        assertEquals("\nID: " + testJob.getId() + "\nName: Barista" + "\nEmployer: Comet Coffee" + "\nLocation: Saint Louis"  + "\nPosition Type: Staff" + "\nCore Competency: Food Service" + "\n", testJob.toString());
    }
    @Test
    public void testToStringHandlesEmptyField(){
        org.launchcode.techjobs.oo.Job testJob = new org.launchcode.techjobs.oo.Job("Barista", new org.launchcode.techjobs.oo.Employer("Comet Coffee"), new org.launchcode.techjobs.oo.Location("Saint Louis"), new org.launchcode.techjobs.oo.PositionType("Staff"), new org.launchcode.techjobs.oo.CoreCompetency("Food Service"));
        assertEquals("\nID: " + testJob.getId() + "\nName: Barista" + "\nEmployer: Comet Coffee" + "\nLocation: Saint Louis"  + "\nPosition Type: Staff" + "\nCore Competency: Food Service" + "\n", testJob.toString());
    }

}