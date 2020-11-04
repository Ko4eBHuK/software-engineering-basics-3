import labTpu.beans.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class Tests {
	@Test
	public void testInside() {
		InputData testInputData = new InputData(4, 1, 0.5);
		DotChecker testHitChecker = new DotChecker();
		DotsData testDostsData = testHitChecker.checkDot(testInputData);
		assertTrue("checking point (0.5; 1) via R = 4", testDostsData.isOutcome());
	}

	@Test
	public void testOutside() {
		InputData testInputData = new InputData(2, -0.5, -1);
		DotChecker testHitChecker = new DotChecker();
		DotsData testDostsData = testHitChecker.checkDot(testInputData);
		assertFalse("checking point (-1; -0.5) via R = 2", testDostsData.isOutcome());
	}
}
