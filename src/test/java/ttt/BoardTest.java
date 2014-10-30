package ttt;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BoardTest {

		public static void main(String[] args) {
			org.junit.runner.JUnitCore.main("ttt.BoardTest");
		}

		@Test
        public void testSignIsCorrect () {
        	Board board = new Board();
        	board.markCell(3, 'X');
            assertEquals('X', board.getBoard()[1][0].getSign());
        }
}