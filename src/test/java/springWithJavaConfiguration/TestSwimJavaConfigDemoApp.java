package springWithJavaConfiguration;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestSwimJavaConfigDemoApp {

	@Test
	public void testJavaConfigDemoApp() {
		
		SwimJavaConfigDemoApp tc = new SwimJavaConfigDemoApp();
		
		String expected = "Swim 1000 meters";
		
		assertEquals(expected, tc.dailyWorkout());
	}
	
	@Test
	public void testJavaConfigDemoApp1() {
		
		SwimJavaConfigDemoApp tc = new SwimJavaConfigDemoApp();
		
		String expected = "Today is the sad day";
		
		assertEquals(expected, tc.dailyFortune());
	}
}
