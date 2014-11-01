package ttt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import static org.hamcrest.core.IsEqual.equalTo;

public class BoardTest {

        @Rule
        public ExpectedException thrown = ExpectedException.none();

		public static void main(String[] args) {
			org.junit.runner.JUnitCore.main("ttt.BoardTest");
		}

		@Test
        public void testSignIsCorrect () {
        	final Board board = new Board();
        	board.markCell(3, 'X');
            assertEquals("X does not equal cell 3",'X', board.getBoard()[1][0].getSign());
        }

        @Test
        public void testNumberIsInCorrectRange () {
        	final Board board = new Board();

        	thrown.expect(IllegalArgumentException.class);
        	thrown.expectMessage(equalTo("Number must be from 0 to 8"));

        	board.markCell(9, 'X');
        }

        @Test
        public void testThatSignIsEitherXorO () {
            final Board board = new Board();
            thrown.expect(IllegalArgumentException.class);
            thrown.expectMessage(equalTo("Sign must be either X or O"));

            board.markCell(5, 'Z');
        }

        @Test
        public void displayBoardTest() {
            final Board board = new Board();
            board.markCell(0, 'X');
            board.markCell(3, 'O');
            board.markCell(5, 'X');
            assertEquals("X |   |  \nO |   | X\n  |   |  \n", board.displayBoard());
        }

        @Test
        public void displayBoardTest2() {
            final Board board = new Board();
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
            final Board board = new Board();
            board.markCell(1, 'X');
            board.markCell(4, 'O');
            assertFalse(board.isFull());
        }

        @Test
        public void isFullTest2() {
            final Board board = new Board();
            board.markCell(0, 'X');
            board.markCell(1, 'X');
            board.markCell(2, 'O');
            board.markCell(3, 'X');
            board.markCell(4, 'X');
            board.markCell(5, 'X');
            board.markCell(6, 'O');
            board.markCell(7, 'X');
            board.markCell(8, 'X');
            assertTrue(board.isFull());
        }

        @Test
        public void isWinnerTest() {
            final Board board = new Board();
            assertFalse(board.isWinner());
        }

        @Test
        public void isWinnerTestHorizontal() {
            final Board board = new Board();
            board.markCell(0, 'X');
            board.markCell(1, 'X');
            board.markCell(2, 'X');
            assertTrue(board.isWinner());
        }

        @Test
        public void isWinnerTestVertical() {
            final Board board = new Board();
            board.markCell(0, 'O');
            board.markCell(3, 'O');
            board.markCell(6, 'O');
            assertTrue(board.isWinner());
        }

        @Test
        public void isWinnerDiagonal() {
            final Board board = new Board();
            board.markCell(2, 'X');
            board.markCell(4, 'X');
            board.markCell(6, 'X');
        }

        @Test 
        public void testGetCellSign() {
            final Board board = new Board();
            board.markCell(3, 'O');
            assertEquals('O', board.getCellSign(3));
        }

        @Test 
        public void testIsMarked() {
            final Board board = new Board();
            board.markCell(3, 'O');
            assertFalse(board.markCell(3, 'X'));
        }
}