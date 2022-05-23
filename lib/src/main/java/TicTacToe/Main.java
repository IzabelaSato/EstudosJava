package TicTacToe;

import java.io.IOException;

import TicTacToeTextos.Textos;

public class Main {

	public static void main(String[] args) throws IOException {
		Game g = new Game();
		g.play();
		
		Textos.printPulaLinha();
		Textos.printTextoSemQuebra("Game over!");
	}

}
