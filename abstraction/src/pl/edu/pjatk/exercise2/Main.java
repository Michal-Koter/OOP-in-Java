package pl.edu.pjatk.exercise2;

import pl.edu.pjatk.exercise2.console.Playstation;
import pl.edu.pjatk.exercise2.console.Xbox;
import pl.edu.pjatk.exercise2.game.PlaystationGame;
import pl.edu.pjatk.exercise2.game.XboxGame;

public class Main {
    public static void main(String[] args) {
        Xbox xbox = new Xbox();
        Playstation playstation = new Playstation();

        XboxGame xboxGame = new XboxGame("HALO");
        PlaystationGame playstationGame = new PlaystationGame("Uncharted");

        xbox.playGame(xboxGame);
        xbox.playGame(playstationGame);
        playstation.playGame(xboxGame);
        playstation.playGame(playstationGame);
    }
}
