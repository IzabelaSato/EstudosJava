package TicTacToe;

import java.io.IOException;

import TicTacToeTextos.Textos;
//import TicTacToe.ScoreManager;
//import TicTacToe.Constantes;

public class Game {

	private Board board = new Board();
	private Player[] players = new Player[Constantes.QUANTIDADE_JOGADORES_SIMBOLO.length];
	private int currentPlayerIndex = -1;
	private ScoreManager scoreManager;
	
	public void play() throws IOException {
		scoreManager = createScoreManager();
		
		Textos.printTitulo();

		for (int i = 0; i < players.length; i++) {
			players[i] = createPlayer(i);

		}
		boolean gameEnded = false;
		Player currentPlayer = nextPlayer();
		Player winner = null;

		while (!gameEnded) {
			board.print();
			
			boolean sequenceFound;
			try {
				sequenceFound = currentPlayer.play();
			}catch (InvalidMoveException e) {
				Textos.printTextoComQuebra("ERRO: " + e.getMessage());
				continue;
			}

			if (sequenceFound) {
				gameEnded = true;
				winner = currentPlayer;

			} else if (board.isfull()) {
				gameEnded = true;
			} else {
				currentPlayer = nextPlayer();
			}
		}
		if (winner == null) {
			Textos.printTextoSemQuebra("O jogo terminou empatado\n");
			
		} else {
			Textos.printTextoSemQuebra("O jogador(a)'" + winner.getName() + "' é o vencedor (a)\n");
			
			scoreManager.saveScore(winner);
		}
		board.print();
	}

	private Player createPlayer(int index) {
		String name = Textos.readInput("Jogador " + (index + 1) + " ->");
		char symbol = Constantes.QUANTIDADE_JOGADORES_SIMBOLO[index];
		Player player = new Player(name, board, symbol);
		
		Integer score = scoreManager.getScore(player);
		

		if (score != null) {
			Textos.printTextoComQuebra("O jogador '" + player.getName()+ "' já possui '"+ score + " vitória(s)!");
			
		}
		
		Textos.printTextoComQuebra("\nO jogador " + name + " vai usar o símbolo: " + symbol + "\n");

		return player;
	}

	private Player nextPlayer() {
		currentPlayerIndex = (currentPlayerIndex + 1) % players.length;
		return players[currentPlayerIndex];
	}
	
	private ScoreManager createScoreManager() throws IOException {
		return new FileScoreManager();
		
	}
}


