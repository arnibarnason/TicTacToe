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

































}
