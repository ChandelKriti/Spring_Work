package dependencyInjection;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class BaseballCoachTest {

	private FortuneService fortuneService ;
	
	@Test
	public void testBaseball() {
		
		BaseballCoach b = new BaseballCoach(fortuneService);
		String expected = "Spend 30 minutes on the ground.";
		
		assertEquals(expected, b.getDailyWorkout());
	}
	
	
	@Test
	public void testHappyFortuneService() {
		
		HappyFortuneService tc = new HappyFortuneService();
		String expected = "Today is your lucky day";
		
		assertEquals(expected, tc.getFortune());
	}
	
	
}
