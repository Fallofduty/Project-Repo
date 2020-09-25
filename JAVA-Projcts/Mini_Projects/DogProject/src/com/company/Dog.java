package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Dog {

    private static int idGenerator = 0; //  class specific will work as a id generator

    // class attributes
    private int dogId;
    private String name;
    private int age;
    private  String breed;
    private  Character sex;
    private boolean foundHome;

    public Dog(String name, int age, String breed, Character sex, boolean foundHome) {
        idGenerator++; // each time id is icremented
        this.dogId = idGenerator; // id geos to 1 first time then 2 and so on each time an object is created
        this.name = setName(name); // will make the first word capital
        this.age = age;
        this.breed = breed;
        this.sex = Character.toUpperCase(sex);
        this.foundHome = foundHome;
    }
   // getters
    public boolean getHome(){ // simple getter to getHome() value
        return  this.foundHome;
    }
    public int getDogId(){ // gets dog id
        return this.dogId;
    }

    // setters
    public void SetHome(int option){ // simple setter to change the home status
        if(option==1){ // change the option
            foundHome = true;
        }
        else if(option ==2){
            foundHome = false;
        }
    }

    private String  setName (String name){
        return name.substring(0,1).toUpperCase() + name.substring(1);
    }


    @Override
    public String toString() { // this will show all the infommation on simple line
        String home;
        if(foundHome) {
            home = "Yes";

        }else {
            home = "NO";
        }
        return "|" +
                "dogId=>" + dogId +
                ", name=>'" + name + '\'' +
                ", age=>" + age +
                ", breed=>'" + breed + '\'' +
                ", sex=>" + sex +
                ", foundHome=>" + home +
                '|';
    }


}
