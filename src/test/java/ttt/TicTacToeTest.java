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
	
	@Test
	public void testSwitchPlayer() {
		assertEquals("Player 1", ttt.switchPlayer().getName());
		ttt.increaseRound();
		assertEquals("Player 2", ttt.switchPlayer().getName());
	}

	@Test
	public void scoreMessageTest() {
		TicTacToe ttt = new TicTacToe();
		assertEquals("Player 1: 0 : Player 2: 0", ttt.scoreMessage());
	}

	@Test
	public void scoreMessageTest2() {
		TicTacToe ttt = new TicTacToe();
		ttt.getPlayer1().increaseScore();
		ttt.getPlayer1().increaseScore();
		ttt.getPlayer2().increaseScore();
		ttt.getPlayer2().increaseScore();
		ttt.getPlayer2().increaseScore();
		assertEquals("Player 1: 2 : Player 2: 3", ttt.scoreMessage());
	}

	@Test
	public void testIsOver() {
		assertEquals(false, ttt.isOver());
	}

	@Test
	public void testReset(){
		TicTacToe ttt = new TicTacToe();
		ttt.increaseRound();
		ttt.Reset();
		assertEquals(0, ttt.getRound());
	}

}
