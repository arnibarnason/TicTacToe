package ttt;

public class Cell {
	private char _sign;
	private boolean _isChecked;
	private int _number;
	private boolean _partOfWinningLine;


	public Cell(int number) {
		_sign = ' ';
		_isChecked = false;
		_number = number;
		_partOfWinningLine = false;
	}

	public boolean isChecked() {
		return _isChecked;
	}

	public void setChecked() {
		_isChecked = true;
	}

	public char getSign() {
		return _sign;
	}






	

}