package JUnitTestCase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.adv.demo.interfacesample.*;

public class InterfaceTest {

	CodeC codeC = new CodeC();

	@Test
	public void colorMethodTest() {
		String actualResult = codeC.printColor("Green");
		String expectedResult = "Green";
		assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void nameMethodTest() {
		InterfaceCodeA codeA = new CodeC();
		String actualResult = codeA.printName("Ganesh");
		String expectedResult = "Ganesh";
		assertEquals(actualResult, expectedResult);
	}

	@Test
	public void addMethodFromCodeATest() {
		int actualResult = InterfaceCodeA.add(5, 10);
		int expectedResult = 15;
		assertEquals(actualResult, expectedResult);
	}

	@Test
	public void interfaceVariableFromCodeATest() {
		int actualResult = InterfaceCodeA.NUM;
		int expectedResult = 20;
		assertEquals(actualResult, expectedResult);
	}

	@Test
	public void interfaceVariableFromCodeBTest() {
		int actualResult = InterfaceCodeB.NUM;
		int expectedResult = 10;
		assertEquals(actualResult, expectedResult);
	}
}
