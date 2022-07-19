package pl.edu.pjatk.exercise2.game;

import pl.edu.pjatk.exercise2.ConsoleType;

public class PlaystationGame extends Game {
    public PlaystationGame(String name) {
        super.consoleType = ConsoleType.PLAYSTATION;
        super.name = name;
    }
}
