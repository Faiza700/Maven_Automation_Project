package Homework_Action_items;

import java.util.ArrayList;

//Create a list of words and combine them with a space in between.
//Example: if you had: "Hello","my","name","is" we want it to be
//"Hello my name is"
//and use a loop
//for your solution
public class practice_2 {
    public static void main(String[] args) {
        ArrayList<String> Pets= new ArrayList<>();
        Pets.add("Cat");
        Pets.add("Dog");
        Pets.add("Hamster");
        Pets.add("Bunny");

        for(int i=0; i < 4;i++ ){
            // display for loop for pet name
            System.out.println("Pets: " + Pets.get(i));

        }//end of main

    }

}//end of java class
