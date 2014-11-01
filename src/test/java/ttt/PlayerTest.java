package ttt;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PlayerTest {

	public static void main(String args[]) {
		org.junit.runner.JUnitCore.main("ttt.PlayerTest");
	}

	@Test
	public void testGetName() {
		final Player p = new Player("Sindri", 'X');
		assertEquals("Player has the name Sindri", "Sindri", p.getName());
	}

	@Test
	public void testGetSign() {
		final Player p = new Player("Kalli", 'X');
		assertEquals("Player p has the sign X",'X', p.getSign());
	}

	@Test
	public void testSetName() {
		final Player p = new Player("Vignir", 'X');
		p.setName("Magnus");
		assertEquals("Player p should have the name Magnus", "Magnus", p.getName());
	}
	
	@Test
	public void testGetScore() {
		final Player p = new Player("Daniel", 'X');
		assertEquals("Player p should have score: 0",0, p.getScore());
	}

	@Test
	public void testIncreaseScore() {
		final Player p = new Player("Sindri", 'X');
		p.increaseScore();
		assertEquals("Score should be 1 after it is increased", 1, p.getScore());
	}
}
