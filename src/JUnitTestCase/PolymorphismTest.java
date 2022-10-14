package JUnitTestCase;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.adv.demo.sample.one.*;

public class PolymorphismTest {

	@Test
	public void testOverloading() {
		SampleClassG sg = new SampleClassG();
		int actualValue = sg.add(100, 20);
		int expectedValue = 120;
		assertEquals(actualValue, expectedValue);
	}
	
	@Test
	public void testOverloadingFromSubClass() {
		SampleClassH sg = new SampleClassH();
		int actualValue = sg.add(100, 100 ,100 );
		int expectedValue = 300;
		assertEquals(actualValue, expectedValue);
	}
	
	@Test
	public void testOverriding() {
		SampleClassG sg = new SampleClassH();
		int actualValue = sg.add(100, 20);
		int expectedValue = 80;
		assertEquals(actualValue, expectedValue);
	}

}
