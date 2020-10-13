package dependencyInjection;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TrackCoachTest {

	private FortuneService fortuneService;
	
	@Test
	public void testTrackCoach() {
		
		TrackCoach tc = new TrackCoach(fortuneService);
		String expected = "Run a hard 5k";
		
		assertEquals(expected, tc.getDailyWorkout());
	}
}
