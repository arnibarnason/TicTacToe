package ttt;
import java.util.Scanner;

public class TicTacToe {
	private Board _board;
	private Player _player1;
	private Player _player2;
	private int _round;
	private int _ties;
	
	public TicTacToe() {
		_board = new Board();
		_player1 = new Player("Player 1", 'X');		
		_player2 = new Player("Player 2", 'O');
		_round = 0;
		_ties = 0;
	}	

	public String greeting() {
		return "Hello World";
	}

	public void increaseRound() {
		_round++;
	}

	public void increaseTies() {
		_ties++;
	}

	public int getRound() {
		return _round;
	}	
	
	public Player getPlayer1() {
		return _player1;
	}		
	
	public Player getPlayer2() {
		return _player2;
	}
	
	public Player switchPlayer(){

		if(_round % 2 == 0) {
			return getPlayer1();
		}
		else {
			return getPlayer2();
		}
	} 

	public boolean isOver() {
		return _board.isFull() || _board.isWinner();

	}

	public void playCell(int number) {
		Player currPlayer = switchPlayer();
		_board.markCell(number, currPlayer.getSign());
		increaseRound();
	}
	
	/*
	public void play() {

		Player currPlayer = _player1;

		while(!isOver()) {

			//_board.displayBoard();

			currPlayer = switchPlayer();

			_board.markCell(number, currPlayer.getSign());

			increaseRound();
		}

		if(_board.isWinner()) {
			currPlayer.increaseScore();
		}

		if(_board.isFull() && !_board.isWinner()) {
			increaseTies();
		}
	}
	*/
















































































	/*
	public boolean isOver() {

	}
	*/


}	

