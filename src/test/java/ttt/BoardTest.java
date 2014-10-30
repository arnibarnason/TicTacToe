package ttt;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

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

        @Rule
        public ExpectedException thrown = ExpectedException.none();

        @Test
        public void testNumberIsInCorrectRange () {
        	Board board = new Board();

        	thrown.expect(IllegalArgumentException.class);
        	thrown.expectMessage(equalTo("Number must be from 0 to 8"));

        	board.markCell(9, 'X');
        }














        @Test
        public void displayBoardTest() {
            Board board = new Board();
            board.markCell(0, 'X');
            board.markCell(3, 'O');
            board.markCell(5, 'X');
            assertEquals("X |   |  \nO |   | X\n  |   |  \n", board.displayBoard());
        }

        @Test
        public void displayBoardTest2() {
            Board board = new Board();
            board.markCell(0, 'X');
            board.markCell(1, 'X');
            board.markCell(2, 'O');
            board.markCell(3, 'X');
            board.markCell(4, 'X');
            board.markCell(5, 'X');
            board.markCell(6, 'O');
            board.markCell(7, 'X');
            board.markCell(8, 'X');
            assertEquals("X | X | O\nX | X | X\nO | X | X\n", board.displayBoard());
        }

        @Test
        public void isFullTest() {
            Board board = new Board();
            board.markCell(1, 'X');
            board.markCell(4, 'O');
            assertEquals(false, board.isFull());
        }

        @Test
        public void isFullTest2() {
            Board board = new Board();
            board.markCell(0, 'X');
            board.markCell(1, 'X');
            board.markCell(2, 'O');
            board.markCell(3, 'X');
            board.markCell(4, 'X');
            board.markCell(5, 'X');
            board.markCell(6, 'O');
            board.markCell(7, 'X');
            board.markCell(8, 'X');
            assertEquals(true, board.isFull());
        }

        @Test
        public void isWinnerTest() {
            Board board = new Board();
            assertEquals(false, board.isWinner());
        }

        @Test
        public void isWinnerTestHorizontal() {
            Board board = new Board();
            board.markCell(0, 'X');
            board.markCell(1, 'X');
            board.markCell(2, 'X');
            assertEquals(true, board.isWinner());
        }

        @Test
        public void isWinnerTestVertical() {
            Board board = new Board();
            board.markCell(0, 'O');
            board.markCell(3, 'O');
            board.markCell(6, 'O');
            assertEquals(true, board.isWinner());
        }

        @Test
        public void isWinnerDiagonal() {
            Board board = new Board();
            board.markCell(2, 'X');
            board.markCell(4, 'X');
            board.markCell(6, 'X');
        }
}