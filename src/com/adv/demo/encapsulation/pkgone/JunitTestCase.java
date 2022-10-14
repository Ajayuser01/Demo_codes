package com.adv.demo.encapsulation.pkgone;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JunitTestCase {
	
	@Test
	public void testDefault() {
		EncapsulationA ea = new EncapsulationA();
		int actualResult=ea.defaultHeight(120);
		int expectedResult= 120;
		assertEquals(actualResult, expectedResult);
		
	}

}
