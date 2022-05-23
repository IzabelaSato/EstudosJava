package TicTacToeTextos;

import br.com.softblue.commons.io.Console;

public class Textos {
	public static void printTextoSemQuebra(String textosemquebra) {
		System.out.print(textosemquebra);
	}
	public static void printTextoComQuebra (String textocomquebra) {
		System.out.println(textocomquebra);
	}
	public static void printPulaLinha() {
		System.out.println();
	}
	public static void printTitulo() {
		printTextoComQuebra("----------------------");
		printTextoComQuebra("|   JOGO DA VELHA    |");
		printTextoComQuebra("----------------------");
		printPulaLinha();
		
		printTextoComQuebra("Use esse tabuleiro para orientação das posições:");
		printTextoComQuebra ("0,0 | 0,1 | 0,2");
		printTextoComQuebra ("---------------");
		printTextoComQuebra ("1,0 | 1,1 | 1,2");
		printTextoComQuebra ("---------------");
		printTextoComQuebra ("2,0 | 2,1 | 2,2");
		printPulaLinha(); 
		
		
	}
	public static String readInput(String textocomquebra) {
		printTextoSemQuebra (textocomquebra + " ");
		return Console.readString();
	}
}
