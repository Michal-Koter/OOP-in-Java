package pl.edu.pjatk.exercise2.console;

import pl.edu.pjatk.exercise2.ConsoleType;
import pl.edu.pjatk.exercise2.game.Game;

public class Playstation extends GameConsole {
    public Playstation() {
        super.consoleType = ConsoleType.PLAYSTATION;
    }

    @Override
    public void playGame(Game game){
        if(game.getConsoleType()==this.consoleType){
            System.out.println(game.getName() + " is started on " + this.getConsoleType());
        } else {
            System.out.println(game.getName() + " can not be started on " + this.getConsoleType());
        }
    }
}
