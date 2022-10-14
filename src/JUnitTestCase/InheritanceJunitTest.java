package JUnitTestCase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.adv.demo.sample.one.*;

public class InheritanceJunitTest {

	@Test
	public void testSingle() {
		SampleClassB sa = new SampleClassB();
		String actualResult = sa.name("Mike");
		String expectedResult = "Mike";
		assertEquals(actualResult, expectedResult);
	}

	@Test
	public void testMultilevel() {
		SampleClassC sc = new SampleClassC();
		int actualResult = sc.addValues();
		int expectedResult = 50;
		assertEquals(actualResult, expectedResult);
	}

	@Test
	public void testHierarchialChildOne() {
		SampleClassD sd = new SampleClassD();
		int actualResult = sd.hierDerivedOne(5);
		int expectedResult = 50;
		assertEquals(actualResult, expectedResult);
	}

	@Test
	public void testHierarchialChildTwo() {
		SampleClassD sd = new SampleClassD();
		int actualResult = sd.hierDerivedOne(15);
		int expectedResult = 150;
		assertEquals(actualResult, expectedResult);
	}

}
