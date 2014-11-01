package ttt;

public class Player {

	private String _name;
	private char _sign;
	private int _score;

	public Player(final String name, final char sign) {
		_name = name;
		_sign = sign;
		_score = 0;
	}

	public String getName() {
		return _name;
	}

	public void setName(final String name) {
		_name = name;
	}

	public char getSign() {
		return _sign;
	}

	public void setSign(final char sign) {
		_sign = sign;
	}

	public int getScore() {
		return _score;
	}

	public void increaseScore() {
		_score++;
	}

}
