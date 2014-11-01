package ttt;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class TicTacToeTest {
	
	@Test
	public void testIncreaseRound()
	{
		final TicTacToe ttt = new TicTacToe();
		ttt.increaseRound();
		assertEquals("Returned wrong number, sould be 1", 1, ttt.getRound());
	}
	
	@Test
	public void testGetPlayer1() {
		final TicTacToe ttt = new TicTacToe();
		assertEquals("The name wa not Player 1", "Player 1", ttt.getPlayer1().getName());
	}

	@Test
	public void testGetPlayer2() {
		final TicTacToe ttt = new TicTacToe();
		assertEquals("The name was not Player 2", "Player 2", ttt.getPlayer2().getName());
	}
	
	@Test
	public void testSwitchPlayer() {
		final TicTacToe ttt = new TicTacToe();
		assertEquals("Should return Player 1 but dit not", "Player 1", ttt.switchPlayer().getName());
	}

	@Test
	public void testSwitchPlayerAfterIncreaseRound() {
		final TicTacToe ttt = new TicTacToe();
		ttt.increaseRound();
		assertEquals("Should return Player 2 but dit not", "Player 2", ttt.switchPlayer().getName());
	}

	@Test
	public void testScoreMessageInBeginning() {
		final TicTacToe ttt = new TicTacToe();
		assertEquals("The score message did not return the right message.", "Player 1: 0 | Player 2: 0 | Ties: 0", ttt.scoreMessage());
	}

	@Test
	public void testIncreaseTies() {
		final TicTacToe ttt = new TicTacToe();
		ttt.increaseTies();
		assertEquals("Did not return right number of ties", 1, ttt.getTies());
	}

	@Test
	public void testScoreMessageAfterSeveralGames() {
		final TicTacToe ttt = new TicTacToe();
		ttt.getPlayer1().increaseScore();
		ttt.getPlayer1().increaseScore();
		ttt.getPlayer2().increaseScore();
		ttt.increaseTies();
		ttt.getPlayer2().increaseScore();
		ttt.getPlayer2().increaseScore();
		assertEquals("The score message did not return the right message.", "Player 1: 2 | Player 2: 3 | Ties: 1", ttt.scoreMessage());
	}

	@Test
	public void testIsOverFalseInBeginning() {
		final TicTacToe ttt = new TicTacToe();
		assertFalse("Did not return false.", ttt.isOver());
	}

	@Test
	public void testIsOverTrueAfterPlayerWins() {
		final TicTacToe ttt = new TicTacToe();
		ttt.playCell(0);
		ttt.playCell(3);
		ttt.playCell(1);
		ttt.playCell(4);
		ttt.playCell(2);
		assertTrue("Did not return true", ttt.isOver());
	}

	@Test
	public void testIsOverTrueAfterAllCellsMarked() {
		final TicTacToe ttt = new TicTacToe();
		ttt.playCell(0);
		ttt.playCell(1);
		ttt.playCell(2);
		ttt.playCell(3);
		ttt.playCell(4);
		ttt.playCell(5);
		ttt.playCell(6);
		ttt.playCell(7);
		ttt.playCell(8);
		assertTrue("Did not return true", ttt.isOver());
	}

	@Test
	public void testReset(){
		final TicTacToe ttt = new TicTacToe();
		ttt.increaseRound();
		ttt.Reset();
		assertEquals("Reset did not reset the rounds", 0, ttt.getRound());
	}

}
