import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyTests {

	@Test
	void test() {
		  LeapYear tester = new LeapYear(); 
	        assertEquals(true, tester.CheckLeapYear(2012), "2012 is a leap year");
	        assertEquals(false, tester.CheckLeapYear(1800), "1800 is not a leap year");
	        assertEquals(false, tester.CheckLeapYear(2001), "2001 is not a leap year");
	}

}
