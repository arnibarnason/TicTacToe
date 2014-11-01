package ttt;

import static org.junit.Assert.*;
import org.junit.Test;

public class CellTest {

	public static void main(String args[]) {
		org.junit.runner.JUnitCore.main("ttt.CellTest");
	}

	@Test
	public void isCheckedTest() {
		Cell cell = new Cell(0);
		assertFalse("Returned true, sould be false.", cell.isChecked());
	}

	@Test
	public void setCheckedTest() {
		Cell cell = new Cell(0);
		cell.setChecked();
		assertTrue("Returned false, sould be true.", cell.isChecked());
	}

	@Test
	public void getSignTest() {
		Cell cell = new Cell(0);
		assertEquals("The sign was not a whiteline!", ' ', cell.getSign());
	}

	@Test
	public void setSignTest() {
		Cell cell = new Cell(0);
		cell.setSign('X');
		assertEquals("The sign was not X.", 'X', cell.getSign());
	}

	@Test
	public void getNumberTest() {
		Cell cell = new Cell(5);
		assertEquals("Did not get the right number, 5.", 5, cell.getNumber());
	}

	@Test
	public void getPartOfWinningLineTest() {
		Cell cell = new Cell(0);
		assertFalse("Returned true, sould return false" ,cell.getPartOfWinningLine());
	}

	@Test
	public void setPartOfWinnigLineTest() {
		Cell cell = new Cell(0);
		cell.setPartOfWinningLine();
		assertTrue("Returned false, should be true." ,cell.getPartOfWinningLine());
	}
}
