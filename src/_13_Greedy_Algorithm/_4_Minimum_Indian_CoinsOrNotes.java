package _13_Greedy_Algorithm;

import java.util.ArrayList;
import java.util.SortedMap;

public class _4_Minimum_Indian_CoinsOrNotes {


    public static void main(String[] args) {

        int curr[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        int toPay = 590;
        int count = 0;
        ArrayList<Integer> needed = new ArrayList<>();

        for(int i=curr.length-1; i>=0; i--){

            while (toPay >= curr[i]){
                toPay = toPay-curr[i];
                count++;
                needed.add(curr[i]);
            }
        }
        System.out.println("No. of notes needed are "+ count);
        System.out.println("The notes used are " + needed);
    }
}
