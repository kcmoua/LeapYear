package LeapYear;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LeapYearTest {
    
    @Test
    public void leapYearsDivisibleBy4() {
        LeapYear leapY = new LeapYear();
        assertEquals(true, leapY.isLeapYear(1996));
        assertEquals(false, leapY.isLeapYear(2001));
        assertEquals(true, leapY.isLeapYear(2000));
        assertEquals(false, leapY.isLeapYear(1900));
    }

    @Test
    public void leapYearsDivisibleBy100And400() {
        LeapYear leapY = new LeapYear();
        assertEquals(true, leapY.isLeapYear(1600));
        assertEquals(false, leapY.isLeapYear(1100));
        assertEquals(true, leapY.isLeapYear(1200));
        assertEquals(false, leapY.isLeapYear(1300));

    }

}