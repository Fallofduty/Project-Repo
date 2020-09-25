package com.company;


import java.util.LinkedList;

public class Main {
    /*
    coder -Nafis ishtiaque
    assignment 1
    id-101206872
     */

    public static void main(String[] args) {

        // creating variables
        LinkedList<Dog>dogs = new LinkedList<Dog>(); // list will hold dogs list object
        var promoter = new Promoter(); // created promter for input
        var menu = new Menu(dogs, promoter); // pasing reference of dogs and promter to menu
        boolean programIsRunning = true; // will keep the program running


        // creatong list of objects
        dogs.add(new Dog("Yen",1,"Affenpinscher",'f',false));
        dogs.add(new Dog("Nicki",10,"Akita",'m',false));
        dogs.add(new Dog("Kisha",5,"Alaskan Malamute",'f',false));
        dogs.add(new Dog("Dana",2,"Airedale Terrier",'f',true));
        dogs.add(new Dog("Dana",2,"puddle",'f',true));
        dogs.add(new Dog("Suk",2,"Papillon",'f',true));


    do {
        menu.showMenu();
        int option = promoter.option(1,5,"menu"); // ask user for opinion
        switch (option){
            case 1: {menu.addDogObject();break;} // add dog object
            case 2:{menu.showDogs();break;} // show all dogs
            case 3:{menu.showDogs(false);break;} // show all avilable dogs
            case 4:{menu.changeStatus();break;} // change dog status
            case 5:{System.out.println("thankyou for using the Wayne DOG shelter"); programIsRunning=false;break;} // quit the program
        }
    }while (programIsRunning);

    }

}
