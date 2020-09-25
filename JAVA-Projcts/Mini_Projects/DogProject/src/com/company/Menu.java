package com.company;

import java.util.LinkedList;

public class Menu {
    // class attributes both are based on reference
    private LinkedList<Dog> dogs = new LinkedList<Dog>();
    private Promoter promoter;


    public Menu(LinkedList<Dog> dogs, Promoter promoter) { // constructor
        this.dogs = dogs;
        this.promoter = promoter;
    }

    public  void showDogs() { // this option will show all avilable dogs
        for (int i = 0; i < dogs.size(); i++) {
            System.out.printf(dogs.get(i).toString() + "\n");
        }
    }

    // overriding method
    public void showDogs(boolean value){ // shows dog avilabity based on boolean value; this will be false it will show all dogs who do not have a home
        for (int i = 0; i <dogs.size() ; i++) {
            if(dogs.get(i).getHome() == value){ // when the match is found the option is shown
                System.out.printf(dogs.get(i).toString() + "\n");
            }
        }
    }
    public void changeStatus(){ // will change dog home status
        var dogId = promoter.option(1,dogs.size(),"DOG id"); // id will always start at 1 and max size of the dog will be based on array size also.
        for (int i = 0; i < dogs.size(); i++) {
            if(dogs.get(i).getDogId()==dogId){
                if(dogs.get(i).getHome()){
                    System.out.println("current dog with id: "+dogs.get(i).getDogId() +  "does not have a home");
                }else {
                    System.out.println("current dog with id: "+dogs.get(i).getDogId() +  "does have  a home");
                }
                dogs.get(i).SetHome(promoter.option(1,2,"change homestatus")); // set home based 1 or 2 option either will be false or true.
                System.out.printf(dogs.get(i).toString() + "\n"); // show the information of the dog that has been changed.

            }
        }
    }

    public void addDogObject(){ // add objects to class
        dogs.add(new Dog(promoter.getName("DogName"),promoter.option(1,25,"Age"),promoter.getName("breed"),promoter.getGender(),false));
        System.out.println("The following dog info has been added");
        System.out.println(dogs.get(dogs.size()-1).toString()); // getting the last item on the list.
    }

    public void showMenu(){ // a simple menu
        System.out.println("");
        System.out.println("----------------------------------------->WELCOME to Wayne Enterprise DOG SHELTER<-----------------------------------------\n");
        System.out.println("\t\t\t\t\t----------------------->HERE ARE THE OPTIONS FOR THE MENU<-----------------------\n");
        System.out.println("\t\t\t\t\t\t\t\t===========>1.Add dog<===========\n");
        System.out.println("\t\t\t\t\t\t\t\t===========>2.View all dogs<===========\n");
        System.out.println("\t\t\t\t\t\t\t\t===========>3.View all available dogs<===========\n");
        System.out.println("\t\t\t\t\t\t\t\t===========>4.Update dog  home status<===========\n");
        System.out.println("\t\t\t\t\t\t\t\t===========>5.Exit The Program<===========\n");
        System.out.println("Please Enter your options Now");
    }
}
