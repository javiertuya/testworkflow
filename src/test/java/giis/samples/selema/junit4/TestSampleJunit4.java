package giis.samples.selema.junit4;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Selenium Test Lifecycle Manager (selema) sample on the JUnit 5 framework, 
 * see usage at https://github.com/javiertuya/selema#readme
 */
public class TestSampleJunit4 {

	@Test
	public void testFailMethod() {
		assertEquals("xxx", "yyy");
	}
	@Test
	public void testPassMethod() {
		assertEquals("xxx", "xxx");
	}
	
	
}
