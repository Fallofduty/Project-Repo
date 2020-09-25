package com.company;

import java.security.PublicKey;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Promoter {
   private Scanner input = new Scanner(System.in); // attreibute for class to get input


//public methods
   public int option(int min, int max,String message){
       // used min and max so this method can be used easily.
       // use message to show message based on the method
        String stringInput="";
        var number = 0;
       while (true){
           if(max == 2 && min == 1) { // this is specially for to change dog status
               System.out.println("press 1 to change for the dog to have a home 2 to keep the dog in the pound");
           }else { // for any other options
               System.out.println("please choose your options for: " + message + " between minmum " + min + " and max: "  + (max)+"\t");
           }
            stringInput = input.nextLine();
            if(isNumber(stringInput) && !stringInput.equals(null) ){ // will avoid null options or empty spaces
                number = Integer.parseInt(stringInput);
                if(number>=min && number<=(max)){ // number must be between min and max to get input
                    return number;
                }else {
                    System.out.println("must enter between "+ min + " and "+ (max) + "for " + message +'\t' );
                    continue;
                }
            }else  {
                System.out.println("there is no option for that " + message); // if any other options show up beside num
                continue;
            }

       }

   }

   public String getName(String message){ //get string input
       String nameInput = "";
       while (true){
           System.out.println("Please enter option for " + message);
           nameInput = input.nextLine();
         if(isString(nameInput) && !nameInput.equals("")){
             return nameInput;
         }
         else {
             System.out.println("your input for the text is not valid please enter all text");
             continue;
         }

       }
   }

  public char getGender(){ // specfically made for gender
       char gender;
       while (true){
           System.out.println(" m for male f for female: ");
           gender = Character.toLowerCase(getName("Gender").charAt(0));
           if(gender=='m' || gender == 'f' && Character.isLetter(gender) ){
               return gender;
           }
           System.out.println("must enter m or f for female");
           continue;
       }
  }

  //private methods

   private boolean isString(String input){  // check whether the menu contains all string.

       for (int i = 0; i <input.length() ; i++) {
           if(!Character.isLetter(input.charAt(i))){
               return false;
           }
       }
       return true;
   }

    private  boolean isNumber(String input){ // check if the number is static or not.
        try
        {
            Integer.parseInt(input);
        }
        catch(NumberFormatException ex)
        {
            return false;
        }
        return true;
    }



    }


