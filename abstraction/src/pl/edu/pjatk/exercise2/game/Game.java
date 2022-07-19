package pl.edu.pjatk.exercise2.game;

import pl.edu.pjatk.exercise2.ConsoleType;

public abstract class Game {
    protected ConsoleType consoleType;
    protected String name;

    public ConsoleType getConsoleType() {
        return consoleType;
    }

    public String getName() {
        return name;
    }
}
