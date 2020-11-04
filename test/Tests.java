import okladnikov.bool.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class Tests {
	@Test
	public void testInside0() {
		ShotData shot = new ShotData(0, 0, 0);
		ShotChecker.checkShot(shot);
		assertTrue("checking point (0; 0) via R = 0", shot.getResult());
	}	

	@Test
	public void testOutside1() {
		ShotData shot = new ShotData(-0.0000000001, 0.8, 1);
		ShotChecker.checkShot(shot);
		assertFalse("checking point (-0.0000000001; 0.8) via R=1", shot.getResult());
	}

	@Test
	public void testInside2() {
		ShotData shot = new ShotData(0.0000000001, 0.8, 1);
		ShotChecker.checkShot(shot);
		assertTrue("checking point (0.0000000001; 0.8) via R=1", shot.getResult());
	}

	@Test
	public void testOutside3() {
		ShotData shot = new ShotData(1, 2.000001, 4);
		ShotChecker.checkShot(shot);
		assertFalse("checking point (1; 2.000001) via R=4", shot.getResult());
	}

	@Test
	public void testInside4() {
		ShotData shot = new ShotData(1, 1.999999, 4);
		ShotChecker.checkShot(shot);
		assertTrue("checking point (1; 1.999999) via R=4", shot.getResult());
	}

	@Test
	public void testInside5() {
		ShotData shot = new ShotData(1, 1.999999, 4);
		ShotChecker.checkShot(shot);
		assertTrue("checking point (1; 1.999999) via R=4", shot.getResult());
	}	

	@Test
	public void testOutside6() {
		ShotData shot = new ShotData(1.0000001, 0.25, 1);
		ShotChecker.checkShot(shot);
		assertFalse("checking point (1.0000001; 0.25) via R=1", shot.getResult());
	}

	@Test
	public void testInside7() {
		ShotData shot = new ShotData(0.999998, -0.25, 1);
		ShotChecker.checkShot(shot);
		assertTrue("checking point (0.999998; 0.25) via R=1", shot.getResult());
	}

	@Test
	public void testOutside8() {
		ShotData shot = new ShotData(1.6, -1.7350000001, 3.47);
		ShotChecker.checkShot(shot);
		assertFalse("checking point (1.6; -1.7350000001) via R=3.47", shot.getResult());
	}

	@Test
	public void testInside9() {
		ShotData shot = new ShotData(1.6, -1.7349999, 3.47);
		ShotChecker.checkShot(shot);
		assertTrue("checking point (1.6; -1.7349999) via R=3.47", shot.getResult());
	}

	@Test
	public void testInside10() {
		ShotData shot = new ShotData(0.5, -0.25, 1);
		ShotChecker.checkShot(shot);
		assertTrue("checking point (0.5; -0.25) via R=1", shot.getResult());
	}

	@Test
	public void testOutside11() {
		ShotData shot = new ShotData(-0.0000000001, -0.75, 3);
		ShotChecker.checkShot(shot);
		assertFalse("checking point (-0.0000000001; 0.75) via R=3", shot.getResult());
	}

	@Test
	public void testInside12() {
		ShotData shot = new ShotData(0.0000000001, -0.75, 3);
		ShotChecker.checkShot(shot);
		assertTrue("checking point (0.0000000001; 0.75) via R=3", shot.getResult());
	}

	@Test
	public void testOutside13() {
		ShotData shot = new ShotData(-0.25, -0.0000000000001, 1);
		ShotChecker.checkShot(shot);
		assertFalse("checking point (-0.25; -0.0000000000001) via R=1", shot.getResult());
	}

	@Test
	public void testInside14() {
		ShotData shot = new ShotData(-0.25, 0.0000000000001, 1);
		ShotChecker.checkShot(shot);
		assertTrue("checking point (-0.25; 0.0000000000001) via R=1", shot.getResult());
	}

	@Test
	public void testOutside15() {
		ShotData shot = new ShotData(-3.00000001, 4.0000001, 10);
		ShotChecker.checkShot(shot);
		assertFalse("checking point (-3.00000001; 4.0000001) via R=10", shot.getResult());
	}

	@Test
	public void testInside16() {
		ShotData shot = new ShotData(-2.99999999, 3.9999999, 10);
		ShotChecker.checkShot(shot);
		assertTrue("checking point (-2.99999999; 3.9999999) via R=10", shot.getResult());
	}

	@Test
	public void testInside17() {
		ShotData shot = new ShotData(-20, 99, 202);
		ShotChecker.checkShot(shot);
		assertTrue("checking point (-20; 99) via R=202", shot.getResult());
	}
}