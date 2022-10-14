package JUnitTestCase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.adv.demo.overriding.*;
import com.adv.demo.packageone.DemoClassOne;
import com.adv.demo.packageone.DemoClassTwo;

public class OverridingColorTest {

	@Test
	public void testColor() {
		Color col = new ColorRed();
		String actualValue = col.color();
		String expectedValue = "Red";
		assertEquals(actualValue, expectedValue);
	}
	
/*	@Test
	public void testOne() {
		DemoClassOne dco = new DemoClassOne();
		String actualValue = dco.oddEven(4);
		String expectedValue = "even";
		assertEquals(actualValue, expectedValue);
	}*/
}
