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
	//Magnús og Sindri vinna hér






































































}
