package beansScope;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BeanScopeDemoTest {

	@Test
	public void testBeanScopeDemo() {
		
		BeanScopeDemoApp tc = new BeanScopeDemoApp();
		
		boolean expected = false;
		
		assertEquals(expected, tc.comparison());
	}
	
}
