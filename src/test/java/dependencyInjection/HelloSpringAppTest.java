package dependencyInjection;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloSpringAppTest {

	@Test
	public void testHelloSpringApp() {
		
		HelloSpringApp tc = new HelloSpringApp();
		String expected = "Spend 30 minutes on the ground.";
		
		assertEquals(expected, tc.dailyWorkout());
	}
	
	@Test
	public void testHelloSpringApp1() {
		
		HelloSpringApp tc = new HelloSpringApp();
		String expected = "Today is your lucky day";
		
		assertEquals(expected, tc.dailyFortune());
	}
}
