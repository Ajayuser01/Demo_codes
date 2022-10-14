package JUnitTestCase;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.adv.demo.encapsulation.pkgone.EncapsulationA;
import com.adv.demo.encapsulation.pkgtwo.EncapsulationD;

public class EncapsulationJunitTest {

	@Test
	public void testProtcted() {
		EncapsulationD encapsulationD = new EncapsulationD();
		String actualResult = encapsulationD.ProtectName("Guru");
		String expectedResult = "Guru";
		assertEquals(actualResult, expectedResult);
	}

	@Test
	public void testPublic() {
		EncapsulationA encapsulationA = new EncapsulationA();
		String actualResult = encapsulationA.publicDept("cs");
		String expectedResult = "cs";
		assertEquals(actualResult, expectedResult);
	}

}
