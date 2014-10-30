package ttt;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

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
/*
        @Test
        public void testNumberIsInCorrectRange () {
        	Board board = new Board();

        	thrown.expect(IllegalArgumentException.class);
        	thrown.expectMessage(equalTo("Number must be from 0 to 8"));

        	board.markCell(9, 'X');
        }*/






















        @Test
        public void isWinnerTest() {
            Board board = new Board();
            assertEquals(false, board.isWinner());
        }

        @Test
        public void isWinnerTest2() {
            Board board = new Board();
            board.markCell(0, 'X');
            board.markCell(1, 'X');
            board.markCell(2, 'X');
            assertEquals(true, board.isWinner());
        }




}