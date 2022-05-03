package TicTacToeTextos;

import br.com.softblue.commons.io.Console;

public class Textos {
	public static void printTextoSemQuebra(String textosemquebra) {
		System.out.print(textosemquebra);
	}
	public static void printTextoComQuebra (String textocomquebra) {
		System.out.println (textocomquebra);
	}
	public static void printPulaLinha () {
		System.out.println();
	}
	public static void printTitulo () {
		printTextoComQuebra("----------------------");
		printTextoComQuebra("|   JOGO DA VELHA    |");
		printTextoComQuebra("----------------------");
		printPulaLinha ();
	}
	public static void readInput(String textocomquebra) {
		printTextoComQuebra (textocomquebra + " ");
		Console.readString();
	}
}
