package springAnnotations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TennisCoachTest {

	 //constructor injection
	
	 private FortuneService fortuneService ;
	
	
	@Test
	public void testTennisCoach() {
		
		TennisCoach tc = new TennisCoach(fortuneService);
		
		String expected = "Practice your backhand volley";
		
		assertEquals(expected, tc.getDailyWorkout());
	} 
	
	
	// setter injection
	/* 
	@Test
	public void testTennisCoach() {
		
		TennisCoach tc = new TennisCoach();
		
		String expected = "Practice your backhand volley";
		
		assertEquals(expected, tc.getDailyWorkout());
	}*/
	
}
