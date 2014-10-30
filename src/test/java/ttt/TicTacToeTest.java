package ttt;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest {
	//dummy variable to make tests on
	TicTacToe ttt = new TicTacToe();
	@Test
	public void testIncreaseRound()
	{
		ttt.increaseRound();
		assertEquals(1, ttt.getRound());
	}
	
	@Test
	public void testGetPlayer() {
		assertEquals("Player 1", ttt.getPlayer1().getName());
	}
	//Magnus og Sindri vinna her
	@Test
	public void testSwitchPlayer() {
		assertEquals("Player 1", ttt.switchPlayer().getName());
		ttt.increaseRound();
		assertEquals("Player 2", ttt.switchPlayer().getName());
	}

	@Test
	public void scoreMessage() {
		assertEquals("Player 1: 0 : Player 2: 0", ttt.scoreMessage());
	}

	@Test
	public void testIsOver() {
		assertEquals(false, ttt.isOver());
	}

	@Test
	public void testReset(){
		ttt.increaseRound();
		ttt.Reset();
		assertEquals(0, ttt.getRound());
	}
































































}
