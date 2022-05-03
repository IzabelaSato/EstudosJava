package TicTacToe;

import TicTacToeTextos.Textos;

public class Game {

	private Board board = new Board(); 
	private Player [] players = new Player[Constantes.QUANTIDADE_JOGADORES_SIMBOLO.length]; 
	
	public void play() {
		Textos.printTitulo();
		
		board.print();
	}
}
