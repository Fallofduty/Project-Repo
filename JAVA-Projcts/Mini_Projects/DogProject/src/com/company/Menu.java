package com.company;

import java.util.LinkedList;

public class Menu {

    private LinkedList<Dog> dogs = new LinkedList<Dog>();
    private Option promoter;


    public Menu(LinkedList<Dog> dogs, Option promoter) { // constructor
        this.dogs = dogs;
        this.promoter = promoter;
    }

    public void showDogs() { // this option will show all avilable dogs
        for (int i = 0; i < dogs.size(); i++) {
            System.out.printf(dogs.get(i).toString() + "\n");
        }
    }

    // overriding method
    public void showDogs(boolean value) { // shows dog avilabity based on boolean value; this will be false it will show all dogs who do not have a home
        for (int i = 0; i < dogs.size(); i++) {
            if (dogs.get(i).getHome() == value) { // when the match is found the option is shown
                System.out.printf(dogs.get(i).toString() + "\n");
            }
        }

    }

    public void changeStatus() { // will change dog home status
        // id will always start at 1 and max size of the dog will be based on array size also.
        for (int i = 0; i < dogs.size(); i++) {
            System.out.printf("Please enter an id between %s and %s for dog id to change home status",1,dogs.size());
            var dogId = promoter.option();
            if (dogs.get(i).getDogId() == dogId) {
                if (dogs.get(i).getHome()) {
                    System.out.printf("Current dog with ID: %s does not have a home\n",dogs.get(i).getDogId());
                } else {
                    System.out.printf("Current dog with ID: %s does  have a home\n",dogs.get(i).getDogId());
                }
                dogs.get(i).SetHome(promoter.option(1, 2, "change home status")); // set home based 1 or 2 option either will be false or true.
                System.out.println(dogs.get(i).toString() + "\n"); // show the information of the dog that has been changed.

            } else {
                System.out.println("There is no dog with id:" + dogId);
                System.out.println("Do you want to search again");
                char input = Character.toLowerCase(promoter.charOption('y','n'));
                if (input == 'y') {
                    continue;
                } else if (input == 'n') {
                    System.out.println("Thank you for the search");
                    break;
                }

            }
        }
    }

    public void addDogObject() { // create instance of object
        dogs.add(new Dog(promoter.getName("DogName"),
                promoter.option(1, 25, "Age"),
                promoter.getName("breed"), promoter.charOption('m','f'),
                false));
        System.out.println("The following dog info has been added");
        System.out.println(dogs.get(dogs.size() - 1).toString()); // getting the last item on the list.
    }

    public void showMenu() { // a simple menu
        System.out.println("");
        System.out.println("----------------------------------------->WELCOME to Wayne Enterprise DOG SHELTER<-----------------------------------------\n");
        System.out.println("\t\t\t\t\t----------------------->HERE ARE THE OPTIONS FOR THE MENU<-----------------------\n");
        System.out.println("\t\t\t\t\t\t\t\t===========>1.Add dog<===========\n");
        System.out.println("\t\t\t\t\t\t\t\t===========>2.View all dogs<===========\n");
        System.out.println("\t\t\t\t\t\t\t\t===========>3.View all available dogs<===========\n");
        System.out.println("\t\t\t\t\t\t\t\t===========>4.Update dog  home status<===========\n");
        System.out.println("\t\t\t\t\t\t\t\t===========>5.Exit The Program<===========\n");

    }
}
