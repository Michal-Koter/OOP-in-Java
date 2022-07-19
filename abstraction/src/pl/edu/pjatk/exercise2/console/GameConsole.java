package pl.edu.pjatk.exercise2.console;

import pl.edu.pjatk.exercise2.ConsoleType;
import pl.edu.pjatk.exercise2.game.Game;

public abstract class GameConsole {
    protected ConsoleType consoleType;

    public abstract void playGame(Game game);

    public ConsoleType getConsoleType() {
        return consoleType;
    }
}
