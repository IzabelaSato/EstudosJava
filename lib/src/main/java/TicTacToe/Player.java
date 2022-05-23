package TicTacToe;

import TicTacToeTextos.Textos;

public class Player {
	private String name;
	private char symbol;
	private Board board;			
	// fazer os construtores das classes
	//clica botao direito/ source/ Generate construtor using fields
	
	public Player(String name, Board board, char symbol) {
		this.name = name;
		this.symbol = symbol;
		this.board = board;
	}
	public Move inputMove() throws InvalidMoveException{
		String moveStr = Textos.readInput("Jogador " + name + ":");
		return new Move (moveStr);
		}
		public boolean play ()throws InvalidMoveException {
			Move move = inputMove();
			return board.play(this, move);
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
	
}

