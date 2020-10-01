package com.company;

import java.util.Scanner;

public class Option {
    final private Scanner INPUT = new Scanner(System.in); // attribute for class to get input


    //public methods
    public int option(int min, int max,String message){
        // used min and max so this method can be used easily.
        // use message to show message based on the method
        String stringInput;
        var number = 0;
        while (true){
            if(max == 2 && min == 1) { // this is specially for to change dog status
                System.out.printf("Type %s to change for dog to have a " +
                        "home %s to keep the dog in the shelter",min,max);
            }else{ // for any other options
                System.out.printf("Please choose your options for: %s  between min:%s and max:%s\n",message,min,max);
            }
            stringInput = INPUT.nextLine();
            if(isNumber(stringInput) && stringInput != null){ // will avoid null options or empty spaces
                number = Integer.parseInt(stringInput);
                if(number >= min && number <= (max)){ // number must be between min and max to get input
                    return number;
                }else{
                    System.out.printf("Must enter between %s and %s for %s",min,max,message);
                }
            }else  {
                System.out.printf("There is no option for that %s with your input \n",message);// if any other options show up beside num

            }

        }

    }

    //overwritting
    public int option(){
        String stringInput;

        while (true){
            stringInput = INPUT.nextLine();
            if(isNumber(stringInput) && stringInput != null){
                return  Integer.parseInt(stringInput);
            }
            System.out.println("Please Enter A Number\n");
        }
    }

    public String getName(String message){ //get string input
        String nameInput;
        while (true){
            System.out.printf("Please Enter option For %s\n ",message);
            nameInput = INPUT.nextLine();
            if(isString(nameInput) && !nameInput.equals("")){
                return nameInput;
            }
            System.out.println("Your input for the is not valid");

        }
    }

    public char charOption(char optionOne, char optionTwo){
        char option;
        while (true){

            String message = (optionOne == 'y' || optionTwo == 'n')?
                    "y for Yes or n for no":"m for Male or f for female "; // set the message based on user option

            option = Character.toLowerCase(getName(message).charAt(0));

            if((option == optionOne || option == optionTwo)
                && Character.isLetter(option)){
                return option;
            }
            System.out.printf("Must enter %s",message);

        }
    }



    //private methods

    private boolean isString(String input){  // check whether the menu contains all string.

        for (int i = 0; i <input.length() ; i++)
        {
            if(!Character.isLetter(input.charAt(i))){
                return false;
            }
        }
        return true;
    }

    private  boolean isNumber(String input){ // check if the number is static or not.
        try {
            Integer.parseInt(input);
        } catch(NumberFormatException ex) {
            return false;
        }
        return true;
    }
}
