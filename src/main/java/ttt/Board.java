package ttt;

public class Board {
	private Cell[][] _board;

	private final int _maxRows = 3;
	private final int _maxColumns = 3;

	public Board() {
		_board = new Cell[3][3];
		int count = 0;
		for (int i = 0; i < _maxRows; i++) {
			for (int j = 0; j < _maxColumns; j++) {
				Cell newCell = new Cell(count);
				_board[i][j] = newCell;
				count++;
			}
		}
	}

	public Cell[][] getBoard() {
		return _board;
	}

	public void markCell(int number, char sign) {
		int count = 0;

		for (int i = 0; i < _maxRows; i++) {
			for (int j = 0; j < _maxColumns; j++) {
				if (count == number) {
					this._board[i][j].setSign(sign);
					return;
				}
				count++;
			}
		}
	}





























	public boolean isWinner() {
		for(int i = 0; i < _maxRows; i++) {
			// vertical
			if(_board[0][i].isChecked() && _board[0][i].getSign() == _board[1][i].getSign() &&
				_board[1][i].getSign() == _board[2][i].getSign()) {
				return true;
			}
			// horizontal
			if(_board[i][0].isChecked() && _board[i][0].getSign() == _board[i][1].getSign() &&
				_board[i][1].getSign() == _board[i][2].getSign()) {
				return true;
			}
		}

		// diagonal line
		if(_board[0][0].isChecked() && _board[0][0].getSign() == _board[1][1].getSign() &&
			_board[1][1].getSign() == _board[2][2].getSign()) {
			return true;
		}
		if(_board[2][0].isChecked() && _board[2][0].getSign() == _board[1][1].getSign() &&
			_board[1][1].getSign() == _board[0][2].getSign()) {
			return true;
		}
		return false;
	}
}
