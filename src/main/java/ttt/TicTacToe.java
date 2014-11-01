package ttt;

public class TicTacToe {
	private Board _board;
	private final Player _player1;
	private final Player _player2;
	private int _round;
	private int _ties;
	private int _games;
	
	public TicTacToe() {
		_board = new Board();
		_player1 = new Player("Player 1", 'X');		
		_player2 = new Player("Player 2", 'O');
		_round = 0;
		_ties = 0;
		_games = 0;
	}	

	public void Reset() {
		_board = new Board();
		_round = 0;
	}

	public String scoreMessage() {
		return "Player 1: " + _player1.getScore() 
		+ " | Player 2: " + _player2.getScore()
		+ " | Ties: " + getTies();
	}

	public void increaseRound() {
		_round++;
	}

	public int getRound() {
		return _round;
	}	

	public void increaseGames() {
		_games++;
	}

	public int getGames() {
		return _games;
	}

	public void increaseTies() {
		_ties++;
	}

	public int getTies() {
		return _ties;
	}	
	
	public Player getPlayer1() {
		return _player1;
	}		
	
	public Player getPlayer2() {
		return _player2;
	}
	
	public Player switchPlayer(){
		if(_games % 2 == 0 ) {
			if(_round % 2 == 0) {
				return getPlayer1();
			} else {
				return getPlayer2();
			}
		} else {
			if(_round % 2 == 0) {
				return getPlayer2();
			} else {
				return getPlayer1();
			}	
		}
	} 

	public boolean isOver() {
		if(_board.isWinner()) {
			_round--;
			switchPlayer().increaseScore();
			_games++;
			Reset();
			return true;
		} else if(_board.isFull()) {
			Reset();
			_games++;
			increaseTies();
			return true;
		} else {
			return false;
		}

	}

	public String playCell(int number) {
		Player currPlayer = switchPlayer();
		boolean marked = _board.markCell(number, currPlayer.getSign());
		if(marked) {
			increaseRound();
			return Character.toString(currPlayer.getSign());
		}
		else {
			return Character.toString(_board.getCellSign(number));			
		}
		
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

}	

