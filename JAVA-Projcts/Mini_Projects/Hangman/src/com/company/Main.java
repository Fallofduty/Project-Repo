package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Game game = new Game("treehouse"); //
        Promter promter = new Promter(game);


        while (game.getRemaningTries()>0 && !game.isWon()){
            promter.displayProgress();
            promter.promptforGuess();

        }
        promter.displayOutcome();
        









    }
}
