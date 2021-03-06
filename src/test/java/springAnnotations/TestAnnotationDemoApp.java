package springAnnotations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestAnnotationDemoApp {

	@Test
	public void testAnnotationDemoApp() {
		
		AnnotationDemoApp tc = new AnnotationDemoApp();
		
		String expected = "Practice your backhand volley";
		
		assertEquals(expected, tc.dailyWorkout());
	}
	
	@Test
	public void testAnnotationDemoApp1() {
		
		AnnotationDemoApp tc = new AnnotationDemoApp();
		
		String expected = "Today is your lucky day";
		
		assertEquals(expected, tc.dailyFortune());
	}
}
