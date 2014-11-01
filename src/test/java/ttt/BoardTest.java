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
            assertEquals('X', board.getBoard()[1][0].getSign());
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
            assertEquals("The board does not look the same!", "X |   |  \nO |   | X\n  |   |  \n", board.displayBoard());
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
            assertEquals("The board does not look the same, should be Full", 
                        "X | X | O\nX | X | X\nO | X | X\n", board.displayBoard());
        }

        @Test
        public void isFullTest() {
            final Board board = new Board();
            board.markCell(1, 'X');
            board.markCell(4, 'O');
            assertFalse("Should return False, but returns True", board.isFull());
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
            assertTrue("Should return True, but returns False", board.isFull());
        }

        @Test
        public void isWinnerTest() {
            final Board board = new Board();
            assertFalse("Should return False, but returns True", board.isWinner());
        }

        @Test
        public void isWinnerTestHorizontal() {
            final Board board = new Board();
            board.markCell(0, 'X');
            board.markCell(1, 'X');
            board.markCell(2, 'X');
            assertTrue("Should return True, but returns False", board.isWinner());
        }

        @Test
        public void isWinnerTestVertical() {
            final Board board = new Board();
            board.markCell(0, 'O');
            board.markCell(3, 'O');
            board.markCell(6, 'O');
            assertTrue("Should return True, but returns False", board.isWinner());
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
            assertEquals("The cell sign was not O", 'O', board.getCellSign(3));
        }

        @Test 
        public void testIsMarked() {
            final Board board = new Board();
            board.markCell(3, 'O');
            assertFalse("Should return False, but returns True", board.markCell(3, 'X'));
        }
}