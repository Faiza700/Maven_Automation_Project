package Day3_100322;

import java.util.ArrayList;

public class T3_Array_list_loop_condition {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Canada");
        countries.add("India");
        countries.add("Australia");

        //using for loop to iterate through countries list and print out ONLY if the country is USA or Australia
        for(int i=0; i < countries.size(); i++){
           if(countries.get(i)== "USA") {
               System.out.println(("country is USA. And index is " + i));
           }else if(countries.get(i)== "Australia") {
               System.out.println("country is Australia. And index is " +i);

           }//end of main
        }//end of class



    }


}
