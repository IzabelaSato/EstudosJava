package TicTacToe;
import java.io.IOException;

import TicTacToe.Player;

public interface ScoreManager {
	
	public Integer getScore (Player player);
	
	public void saveScore (Player player) throws IOException;
	
}

