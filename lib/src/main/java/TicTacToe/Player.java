package TicTacToe;

public class Player {

	
	private String name;
	private char symbol;
	private Board board;
	
	// fazer os construtores das classes
	//clica botao direito/ source/ Generate construtor using fields
	public Player(String name, char symbol, Board board) {
		this.name = name;
		this.symbol = symbol;
		this.board = board;
	}
	
	public String getName() {
		return name;
	}

	public char getSymbol() {
		return symbol;
	}

	public Board getBoard() {
		return board;
	}
	
	public Move inputMove() {
	return null;
	}
	public void play () {
		
	}
			
}

