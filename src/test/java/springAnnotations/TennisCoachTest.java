package springAnnotations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TennisCoachTest {

	@Test
	public void testTennisCoach() {
		
		TennisCoach tc = new TennisCoach();
		
		String expected = "Practice your backhand volley";
		
		assertEquals(expected, tc.getDailyWorkout());
	}
	
	@Test
	public void testBadmintonCoach() {
		
		BadmintonCoach tc = new BadmintonCoach();
		
		String expected = "Practice with exact net position";
		
		assertEquals(expected, tc.getDailyWorkout());
	}
}
