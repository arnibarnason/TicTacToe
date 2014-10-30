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
<<<<<<< HEAD
	//Magnus og Sindri vinna her
	@Test
	public void testSwitchPlayer() {
		assertEquals("Player 1", ttt.switchPlayer().getName());
		ttt.increaseRound();
		assertEquals("Player 2", ttt.switchPlayer().getName());
	}
=======
	//Magnús og Sindri vinna hér
>>>>>>> 6aa7fa89e7c7cabbfe24b659ead1aeecbc4b3a33

































































	@Test
	public void testIsOver(){
		
	}




}
