package TicTacToe;

import TicTacToeTextos.Textos;
import br.com.softblue.commons.io.Console;

//  nessa parte da matrix vc criou o tamanho do tabuleiro chamando a constantes
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
	public boolean play(Player player, Move move) {
		int i = move.getI();
		int j = move.getJ();
		
		// checar se o jogador ganhou
		matrix[i][j]= player.getSymbol();
		return false;
	}

}
