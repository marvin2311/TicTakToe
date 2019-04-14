package MainPack;

import java.util.Timer;
import java.util.TimerTask;

public class WinnerRoutine {

	Timer zeit;
	public WinnerRoutine() {
		
		zeit = new Timer();
		zeit.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				
				if(GUI.state[0] == 1 && GUI.state[1] == 1 && GUI.state[2] == 1) {
					GUI.winner = 1;
					
				} else if (GUI.state[0] == 1 && GUI.state[4] == 1 && GUI.state[8] == 1) {
					GUI.winner = 1;
					
				} else if (GUI.state[0] == 1 && GUI.state[3] == 1 && GUI.state[6] == 1) {
					GUI.winner = 1;
					
				} else if (GUI.state[1] == 1 && GUI.state[4] == 1 && GUI.state[7] == 1) {
					GUI.winner = 1;
					
				} else if (GUI.state[2] == 1 && GUI.state[4] == 1 && GUI.state[6] == 1) {
					GUI.winner = 1;
					
				} else if (GUI.state[3] == 1 && GUI.state[4] == 1 && GUI.state[5] == 1) {
					GUI.winner = 1;
					
				} else if (GUI.state[6] == 1 && GUI.state[7] == 1 && GUI.state[8] == 1) {
					GUI.winner = 1;
					
				} else if (GUI.state[2] == 1 && GUI.state[5] == 1 && GUI.state[8] == 1) {
					GUI.winner = 1;
					
				}
				
				if(GUI.state[0] == 2 && GUI.state[1] == 2 && GUI.state[2] == 2) {
					GUI.winner = 2;
					
				} else if (GUI.state[0] == 2 && GUI.state[4] == 2 && GUI.state[8] == 2) {
					GUI.winner = 2;
					
				} else if (GUI.state[0] == 2 && GUI.state[3] == 2 && GUI.state[6] == 2) {
					GUI.winner = 2;
					
				} else if (GUI.state[1] == 2 && GUI.state[4] == 2 && GUI.state[7] == 2) {
					GUI.winner = 2;
					
				} else if (GUI.state[2] == 2 && GUI.state[4] == 2 && GUI.state[6] == 2) {
					GUI.winner = 2;
					
				} else if (GUI.state[3] == 2 && GUI.state[4] == 2 && GUI.state[5] == 2) {
					GUI.winner = 2;
					
				} else if (GUI.state[6] == 2 && GUI.state[7] == 2 && GUI.state[8] == 2) {
					GUI.winner = 2;
					
				} else if (GUI.state[2] == 2 && GUI.state[5] == 2 && GUI.state[8] == 2) {
					GUI.winner = 2;
					
				}
				
			}
		}, 0, 150);
	}

}
