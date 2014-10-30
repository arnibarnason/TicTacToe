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


}
