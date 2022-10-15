package JUnitTestCase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.adv.demo.packagesix.*;

public class AssociationUnitTest {
	
	private ClassA objA=new ClassA();
	private ClassB objB=new ClassB();
	
	@Test
	public void ClassATest() { 
		String actualValue = objA.getName();
		String expectedValue = "Guru";
		assertEquals(actualValue, expectedValue);
	}
	
	@Test
	public void ClassBTest() { 
		objA.setClassBObj(objB);
		ClassB classBObj=objA.getClassBObj();
		String actualValue = classBObj.showColorClassB("red");
		String expectedValue = "red";
		assertEquals(actualValue, expectedValue);
	}

	/*@Test
	public void colorAggFromClassB() { // Aggregation
		objA.setClassBObj(objB);
		ClassB obj2 = objA.getClassBObj();
		String actualValue = obj2.showColorClassB("White");
		String expectedValue = "White";
		assertEquals(actualValue, expectedValue);
	}*/
	
	@Test(expected=NullPointerException.class)
	public void compositionTest() {
		CompositionDemo comDemo = new CompositionDemo();
		comDemo=null;
		ClassB given=comDemo.getClassBObj();
	}
}