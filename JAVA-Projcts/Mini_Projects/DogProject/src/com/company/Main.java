package com.company;

import java.util.LinkedList;

public class Main {
    /*
    name=>"Nafis Ishtiaque
    student id=> 101206872
    coursecode=>APPLICATION DEVL.USING JAVA - COMP 2130 - 100
    COMP2130 Assignment 1
     */

    public static void main(String[] args) {
        LinkedList<Dog> dogs = new LinkedList<>(); // list will hold dogs list object
        var option = new Option(); // created promter for input
        var menu = new Menu(dogs, option); // pasing reference of dogs and promter to menu
        boolean programIsRunning = true; // will keep the program running


        // creating list of objects
        dogs.add(new Dog("Yen",1,"Affenpinscher",'f',false));
        dogs.add(new Dog("Nicki",10,"Akita",'m',false));
        dogs.add(new Dog("Kisha",5,"Alaskan Malamute",'f',false));
        dogs.add(new Dog("Dana",2,"Airedale Terrier",'f',true));
        dogs.add(new Dog("Dana",2,"puddle",'f',true));
        dogs.add(new Dog("Suk",2,"Papillon",'f',true));


        do {
            menu.showMenu();
            int optionMenu = option.option(1,5,"menu"); // ask user for opinion
            switch (optionMenu) {
                case 1 -> menu.addDogObject(); // add dog object
                case 2 -> menu.showDogs(); // show all dogs
                case 3 -> menu.showDogs(false); // show all avilable dogs
                case 4 -> menu.changeStatus(); // change dog status
                case 5 -> {
                    System.out.println("Thank you for using the Wayne DOG shelter");
                    programIsRunning = false;

                } // quit the program
                default -> throw new IllegalStateException("Unexpected value: " + optionMenu);
            }
        }while (programIsRunning);
    }
}
