package dependencyInjection;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SetterDemoTest {

	@Test
	public void testSetterDemo() {
		
		SetterDemoApp tc = new SetterDemoApp();
		String expected = "Practice fast bowling for 15 minutes";
		
		assertEquals(expected, tc.dailyWorkout());
	}
	
	@Test
	public void testSetterDemo1() {
		
		SetterDemoApp tc = new SetterDemoApp();
		String expected = "Today is your lucky day";
		
		assertEquals(expected, tc.dailyFortune());
	}
	
	@Test
	public void testSetterDemo3() {
		
		SetterDemoApp tc = new SetterDemoApp();
		String expected = "abc123@example.com";
		
		assertEquals(expected, tc.getMail());
	}
	
	@Test
	public void testSetterDemo4() {
		
		SetterDemoApp tc = new SetterDemoApp();
		String expected = "Royal Challengers Banglore";
		
		assertEquals(expected, tc.getTheTeam());
	}
}
