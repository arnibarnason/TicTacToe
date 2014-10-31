package ttt;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PlayerTest {

	public static void main(String args[]) {
		org.junit.runner.JUnitCore.main("ttt.PlayerTest");
	}

	@Test
	public void testGetName() {
		Player p = new Player("Sindri", 'X');
		assertEquals("Sindri", p.getName());
	}

	@Test
	public void testGetSign() {
		Player p = new Player("Kalli", 'X');
		assertEquals('X', p.getSign());
	}

	@Test
	public void testSetName() {
		Player p = new Player("Vignir", 'X');
		p.setName("Magnus");
		assertEquals("Magnus", p.getName());
	}
	
	@Test
	public void testGetScore() {
		Player p = new Player("Daniel", 'X');
		assertEquals(0, p.getScore());
	}

	@Test
	public void testIncreaseScore() {
		Player p = new Player("Sindri", 'X');
		p.increaseScore();
		assertEquals(1, p.getScore());
	}
}
