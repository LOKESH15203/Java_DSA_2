package _3_1_SearchingSorting;

import java.util.ArrayList;
import java.util.Arrays;

public class _4_Pair_of_difference {

    public static void findPair(int arr[], int diff) {
        // Nested loop to compare all possible
        // pairs of elements
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                if(i == j)
                    continue;

                // If the difference between the
                // two elements is n, print them
                if((arr[j] - arr[i]) == diff) {
                    System.out.println("Pair Found: (" + arr[i] + ", " +  arr[j] + ")");
                    return;
                }
            }
        }

        System.out.println("No such pair");
    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 30, 40, 100 };
        int diff = 60;

        findPair(arr, diff);
    }
}
