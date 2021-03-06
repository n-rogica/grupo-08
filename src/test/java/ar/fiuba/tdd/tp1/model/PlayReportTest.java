package ar.fiuba.tdd.tp1.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class PlayReportTest {
    private PlayReport playReport;
    private PlayReport identicalPlayReport;
    private PlayReport differentPlayReport;

    @Before
    public void setUp() throws Exception {
        this.playReport = new PlayReport(1,true);
        this.identicalPlayReport = new PlayReport(1,true);
        this.differentPlayReport = new PlayReport(1,false);

    }

    @Test
    public void getPlayNumber() throws Exception {
        assertEquals(1,playReport.getPlayNumber());
    }

    @Test
    public void getBoardStatusTestValid() throws Exception {
        assertEquals("valid",playReport.getBoardStatus());
    }

    @Test
    public void getBoardStatusTestInValid() throws Exception {
        this.playReport = new PlayReport(2,false);
        assertEquals("invalid",playReport.getBoardStatus());
    }

    @Test
    public void comparingTwoIdenticalReportsReturnsTrue() {
        assertTrue(playReport.areEquals(identicalPlayReport));
    }

    @Test
    public void comparingTwoDifferentReportsReturnsFalse() {
        assertFalse(playReport.areEquals(differentPlayReport));
    }

}