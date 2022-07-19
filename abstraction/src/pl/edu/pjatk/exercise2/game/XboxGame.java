package pl.edu.pjatk.exercise2.game;

import pl.edu.pjatk.exercise2.ConsoleType;

public class XboxGame extends Game {
    public XboxGame(String name) {
        super.consoleType = ConsoleType.XBOX;
        super.name = name;
    }
}
