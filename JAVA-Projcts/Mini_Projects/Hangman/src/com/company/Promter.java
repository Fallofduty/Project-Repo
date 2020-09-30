package com.company;

import java.util.Scanner;

public class Promter {

    private Game game; // pass the reference to game here in promter

    public Promter(Game game){

        this.game = game;
    }

    public boolean promptforGuess(){
        boolean isHit = false;
        Scanner scanner = new Scanner(System.in);
        boolean isAcceptable = false;
        do {

            System.out.println("enter a letter:"); // asks user for input
            String guessInput = scanner.nextLine(); // goes to the next one


            try {
                isHit = game.applyGuess(guessInput); // will apply guess with char
                isAcceptable = true; // char is true program will quit now when a new letter has been guessed and not old one

            } catch (IllegalArgumentException iae) {
                System.out.printf("%s please try again",iae.getMessage());
            /*
             if( hits.indexOf(letter)!=1 || misses.indexOf(letter)!=1){
           throw new IllegalArgumentException("letter has already been guessed");
       }    .message() will be getting from here.
             */
            }


        }while (!isAcceptable);
        return isHit;



    }



    public void displayProgress(){
        System.out.printf(" You have %d tries left to solve:  Try to solve:%s%n",
                game.getRemaningTries()

                ,game.getCurrentProgress());
    }

    public void displayOutcome(){

        if(game.isWon()){

            System.out.printf("congrats you won with the tries remaining %s",game.getRemaningTries());
        }else {
            System.out.printf("sorry the right word was %s",game.getAnswer());
        }

    }

}
