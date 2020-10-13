package dependencyInjection;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class CoachTest {

	private FortuneService fortuneService ;
	
	@Test
	public void testBaseball() {
		
		BaseballCoach b = new BaseballCoach(fortuneService);
		String expected = "Spend 30 minutes on the ground.";
		
		assertEquals(expected, b.getDailyWorkout());
	}
	
	@Test
	public void testTrackCoach() {
		
		TrackCoach tc = new TrackCoach(fortuneService);
		String expected = "Run a hard 5k";
		
		assertEquals(expected, tc.getDailyWorkout());
	}
	
	@Test
	public void testHappyFortuneService() {
		
		HappyFortuneService tc = new HappyFortuneService();
		String expected = "Today is your lucky day";
		
		assertEquals(expected, tc.getFortune());
	}
	
	@Test
	public void testHelloSpringApp() {
		
		HelloSpringApp tc = new HelloSpringApp();
		String expected = "Run a hard 5k";
		
		assertEquals(expected, tc.dailyWorkout());
	}
	
	@Test
	public void testHelloSpringApp1() {
		
		HelloSpringApp tc = new HelloSpringApp();
		String expected = "Just do it Today is your lucky day";
		
		assertEquals(expected, tc.dailyFortune());
	}
}
