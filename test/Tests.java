import okladnikov.bool.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class Tests {
	@Test
	public void testInside() {
		ShotData shot = new ShotData(1, 1, 4);
		ShotChecker.checkShot(shot);
		assertTrue("checking point (1; 1) via R = 4", shot.getResult());
	}

	@Test
	public void testInside() {
		ShotData shot = new ShotData(1, 1, 4);
		ShotChecker.checkShot(shot);
		assertTrue("checking point (1; 1) via R = 4", shot.getResult());
	}

	@Test
	public void testOutside() {
		ShotData shot = new ShotData(-1, -1, 2);
		ShotChecker.checkShot(shot);
		assertFalse("checking point (-1; --1) via R = 2", shot.getResult());
	}
}