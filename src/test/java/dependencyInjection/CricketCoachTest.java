package dependencyInjection;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CricketCoachTest {

	@Test
	public void testCricketCoach() {
		
		CricketCoach tc = new CricketCoach();
		String expected = "Practice fast bowling for 15 minutes";
		
		assertEquals(expected, tc.getDailyWorkout());
	}
	
	@Test
	public void testCricketCoach1() {
		
		CricketCoach tc = new CricketCoach();
		String expected = "abc@123.com";
		tc.setEmailAddress("abc@123.com");
		assertEquals(expected, tc.getEmailAddress());
	}
	
	@Test
	public void testCricketCoach2() {
		
		CricketCoach tc = new CricketCoach();
		String expected = "India";
		tc.setTeam("India");
		assertEquals(expected, tc.getTeam());
	}
}
