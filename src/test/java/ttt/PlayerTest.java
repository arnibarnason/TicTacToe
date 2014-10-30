package ttt;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PlayerTest {

	/*public static void main(String args[]) {
		org.junit.runner.JUnitcore.main("ttt.PlayerTest");
	}*/

	Player p = new Player("Sindri", 'X');


	@Test
	public void testGetName() {
		assertEquals("Sindri", p.getName());
	}

	@Test
	public void testGetSign() {
		assertEquals('X', p.getSign());
	}

	@Test
	public void testSetName() {
		p.setName("Magnús");
		assertEquals("Magnús", p.getName());
	}

	@Test
	public void testGetScore() {
		assertEquals(0, p.getScore());
	}

	@Test
	public void testIncreaseScore() {
		p.increaseScore();
		assertEquals(1, p.getScore());
	}


}
