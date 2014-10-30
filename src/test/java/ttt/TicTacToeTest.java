package ttt;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest {
	TicTacToe ttt = new TicTacToe();
	@Test
	public void testIncreaseRound()
	{
		ttt.increaseRound();
		assertEquals(1, ttt.getRound());
	}
}
