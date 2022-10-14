package JUnitTestCase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.adv.inheritance.*;

public class InheritanceJunitTestCase {

	@Test
	public void testSingle() {
		SingleDerived derivedObj = new SingleDerived();
		String actualResult = derivedObj.name("Mike");
		String expectedResult = "Mike";
		assertEquals(actualResult, expectedResult);
	}

	@Test
	public void testMultilevel() {
		MultilevelGrandChild grandChild = new MultilevelGrandChild();
		int actualResult = grandChild.addValues();
		int expectedResult = 50;
		assertEquals(actualResult, expectedResult);
	}

	@Test
	public void testHierarchialChildOne() {
		HierarchicalInheritanceChild1 child1 = new HierarchicalInheritanceChild1();
		int actualResult = child1.hierDerivedOne(5);
		int expectedResult = 50;
		assertEquals(actualResult, expectedResult);
	}

	@Test
	public void testHierarchialChildTwo() {
		HierarchicalInheritanceChild2 child2 = new HierarchicalInheritanceChild2();
		int actualResult = child2.hierDerivedTwo(15);
		int expectedResult = 150;
		assertEquals(actualResult, expectedResult);
	}
}
