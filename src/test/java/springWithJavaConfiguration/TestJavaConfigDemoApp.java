package springWithJavaConfiguration;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestJavaConfigDemoApp {

	@Test
	public void testJavaConfigDemoApp() {
		
		JavaConfigDemoApp tc = new JavaConfigDemoApp();
		
		String expected = "Practice your backhand volley";
		
		assertEquals(expected, tc.dailyWorkout());
	}
	
	@Test
	public void testJavaConfigDemoApp1() {
		
		JavaConfigDemoApp tc = new JavaConfigDemoApp();
		
		String expected = "Today is your lucky day";
		
		assertEquals(expected, tc.dailyFortune());
	}
}
