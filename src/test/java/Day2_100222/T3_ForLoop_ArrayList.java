package Day2_100222;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class T3_ForLoop_ArrayList {
    public static void main(String[] args) {
        //declare and define the arrayList for zip code
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11218");
        zipCode.add("1001");
        zipCode.add("11219");
        zipCode.add("11377");

        //call for loop to print out all zipcode values from the array list
        for(int i =0; i < 4; i++){
            //print out each zipcode automatically
            System.out.println("Zip code: " + zipCode.get(i));

        }//end of for loop
    }//end of main
}
