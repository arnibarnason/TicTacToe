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
		assertEquals(false, cell.isChecked());
	}

	@Test
	public void setCheckedTest() {
		Cell cell = new Cell(0);
		cell.setChecked();
		assertEquals(true, cell.isChecked());
	}

	@Test
	public void getSignTest() {
		Cell cell = new Cell(0);
		assertEquals(' ', cell.getSign());
	}

	@Test
	public void setSignTest() {
		Cell cell = new Cell(0);
		cell.setSign('X');
		assertEquals('X', cell.getSign());
	}

	@Test
	public void getNumberTest() {
		Cell cell = new Cell(5);
		assertEquals(5, cell.getNumber());
	}
	/*
	@Test
	public void getPartOfWinningLineTest() {
		Cell cell = new Cell(0);
		assertEquals(false, cell.getPartOfWinningLine());
	}

	@Test
	public void setPartOfWinnigLineTest() {
		Cell cell = new Cell(0);
		cell.setPartOfWinningLine();
		assertEquals(true, cell.getPartOfWinningLine());
	}
	*/
}
