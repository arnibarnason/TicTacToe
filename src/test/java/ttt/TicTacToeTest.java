package ttt;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest {
	
	@Test
	public void testIncreaseRound()
	{
		TicTacToe ttt = new TicTacToe();
		ttt.increaseRound();
		assertEquals(1, ttt.getRound());
	}
	
	@Test
	public void testGetPlayer1() {
		TicTacToe ttt = new TicTacToe();
		assertEquals("Player 1", ttt.getPlayer1().getName());
	}

	@Test
	public void testGetPlayer2() {
		TicTacToe ttt = new TicTacToe();
		assertEquals("Player 2", ttt.getPlayer2().getName());
	}
	
	@Test
	public void testSwitchPlayer() {
		TicTacToe ttt = new TicTacToe();
		assertEquals("Player 1", ttt.switchPlayer().getName());
		ttt.increaseRound();
		assertEquals("Player 2", ttt.switchPlayer().getName());
	}

	@Test
	public void testScoreMessageInBeginning() {
		TicTacToe ttt = new TicTacToe();
		assertEquals("Player 1: 0 : Player 2: 0", ttt.scoreMessage());
	}

	@Test
	public void testScoreMessageAfterSeveralGames() {
		TicTacToe ttt = new TicTacToe();
		ttt.getPlayer1().increaseScore();
		ttt.getPlayer1().increaseScore();
		ttt.getPlayer2().increaseScore();
		ttt.getPlayer2().increaseScore();
		ttt.getPlayer2().increaseScore();
		assertEquals("Player 1: 2 : Player 2: 3", ttt.scoreMessage());
	}

	@Test
	public void testIsOverFalseInBeginning() {
		TicTacToe ttt = new TicTacToe();
		assertEquals(false, ttt.isOver());
	}

	@Test
	public void testIsOverTrueAfterAllCellsMarked() {
		TicTacToe ttt = new TicTacToe();
		ttt.playCell(0);
		ttt.playCell(1);
		ttt.playCell(2);
		ttt.playCell(3);
		ttt.playCell(4);
		ttt.playCell(5);
		ttt.playCell(7);
		ttt.playCell(6);
		ttt.playCell(8);
		assertEquals(true, ttt.isOver());
	}

	@Test
	public void testReset(){
		TicTacToe ttt = new TicTacToe();
		ttt.increaseRound();
		ttt.Reset();
		assertEquals(0, ttt.getRound());
	}

}
