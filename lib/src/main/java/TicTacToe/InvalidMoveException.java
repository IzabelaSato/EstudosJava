package TicTacToe;

public class InvalidMoveException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidMoveException() {
	}

	public InvalidMoveException(String message) {
		super(message);
	}
}
