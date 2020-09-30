package com.company;
public class Game {
    public static final int MAX_MISSES = 7;
    private String answer;
    private String hits;
    private String misses;

    public Game(String answer) {
        this.answer = answer.toLowerCase(); // will always make it lower.
        this.hits = "";
        this.misses="";
        // both are empty cause both are hits and misses starts at nothing guess


    }
    public String getAnswer(){
        return this.answer;
    }

    public boolean applyGuess(char letter){


         letter = normalizeGuess(letter); // letter is passed on to normalizeGuess and being stored in a variable.

        boolean isHit = answer.indexOf(letter) != -1;
        if(isHit){
            hits += letter; // guessed added to hits
        }
        else{
            misses+=letter; // ad to miss if not a letter.
        }

        return isHit;
    }

    public boolean applyGuess(String letters){
        if(letters.length()==0){
            throw new IllegalArgumentException("bo letter found");
        }

       return applyGuess(letters.charAt(0));
    }

    public String getCurrentProgress(){

        String progress  = ""; // this will hold the progress  of the game
        for(char letter :answer.toCharArray()){  // break the answer into char
            char display = '-';// make a new variable called display char with -
            if(hits.indexOf(letter)!= -1){ // if hits.indexof(letter) is not -1
               display = letter; // change letter to display;
            }
            progress +=display; // at the end of the loop change progress to display.
        }
        return progress;
    }

    public int getRemaningTries(){
        return MAX_MISSES - misses.length(); // minus MAX_MISSES - misses.length() check for length.
    }


    private char normalizeGuess(char letter){

        if(!Character.isLetter(letter)){ // if it is not a letter
            throw new IllegalArgumentException("A letter is required");
        }
        letter = Character.toLowerCase(letter); // passed the test
        if( hits.indexOf(letter)!=-1 || misses.indexOf(letter)!=-1){
            throw new IllegalArgumentException(letter  + " has already been guessed");
        }
      return letter;

    }

    public boolean isWon(){
             return getCurrentProgress().indexOf('-') ==-1;
                     // if(hits.indexOf(letter)!=-1) is acessing this method
    }




}