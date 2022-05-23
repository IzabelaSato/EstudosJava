package TicTacToe;

import TicTacToeTextos.Textos;
//import br.com.softblue.commons.io.Console;

public class Board {
	private char[][] matrix = new char[Constantes.TAMANHO_TABULEIRO][Constantes.TAMANHO_TABULEIRO];
	
	public Board(){
		clear();
	}
	public void clear() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = ' ';
			}
		}
	}
	public void print() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				Textos.printTextoSemQuebra(String.valueOf(matrix[i][j]));

				if (j < matrix[i].length - 1) {
					Textos.printTextoSemQuebra(" | ");
				}
			}
			Textos.printPulaLinha();

			if (i < matrix.length - 1) {
				Textos.printTextoComQuebra("----------");
			}
		}
	}

	public boolean isfull() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(matrix [i][j] ==  ' ') {
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean play(Player player, Move move) throws InvalidMoveException {
		int i = move.getI();
		int j = move.getJ();
		
		if (i<0 || j<0 || i>= Constantes.TAMANHO_TABULEIRO || j>= Constantes.TAMANHO_TABULEIRO) {
			throw new InvalidMoveException ("O intervalo da jogada esté errado, tente novamente");
		}
		if (matrix [i][j] != ' ') {
			throw new InvalidMoveException("Esta jogada já foi realizada, tente novamente");
		}
	
		matrix[i][j]= player.getSymbol();
		return checkRows (player)|| checkCols (player)|| checkDiagonal1(player)|| checkDiagonal2 (player);
	}
	//testando linhas no checkRow e Rows
	private boolean checkRows (Player player) {
		for (int i = 0; i< Constantes.TAMANHO_TABULEIRO; i++) {
			if (checkRow (i, player)) {
				return true;
			}
		}
		return false;
	}
	
	private boolean checkRow (int i, Player player ) {
		char symbol = player.getSymbol();
		
		for (int j= 0; j < Constantes.TAMANHO_TABULEIRO; j++) {
			if (matrix [i][j]!= symbol) {
				return false;
			}
		}
			return true;
		}
	

// testando colunas
private boolean checkCols (Player player) {
	for (int j = 0; j< Constantes.TAMANHO_TABULEIRO; j++) {
		if (checkCol (j, player)) {
			return true;
		}
	}
	return false;
}
	private boolean checkCol (int j, Player player ) {
		char symbol = player.getSymbol();
	
		for (int i= 0; i < Constantes.TAMANHO_TABULEIRO; i++) {
			if (matrix [i][j]!= symbol) {
				return false;
			}
		}
			return true;
		}
	
	// TESTANDO DIAGONAL
	private boolean checkDiagonal1 (Player player) {
		char symbol = player.getSymbol();
		
		for (int i= 0; i < Constantes.TAMANHO_TABULEIRO; i++) {
			if (matrix [i][i]!= symbol) {
				return false;
			}
		}
		return true;
	}
	
	private boolean checkDiagonal2 (Player player) {
		char symbol = player.getSymbol();
		int lastLine = Constantes.TAMANHO_TABULEIRO -1;
		
		for (int i = lastLine, j=0; i>=0; j++, i--) {
			if (matrix [i][j]!= symbol) {
				return false;
			}
		}
		return true;
	}
}
	
