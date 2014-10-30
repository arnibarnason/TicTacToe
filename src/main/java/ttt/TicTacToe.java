package ttt;

public class TicTacToe {
	private Board _board;
	private Player _player1;
	private Player _player2;
	private int _round;
	
	public TicTacToe() {
		_board = new Board();
		_player1 = new Player("Player 1", 'X');		
		_player2 = new Player("Player 2", 'O');
		_round = 0;
	}	

	public void increaseRound() {
		_round++;
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




















































































}	

