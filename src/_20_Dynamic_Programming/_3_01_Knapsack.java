package _20_Dynamic_Programming;

import java.util.Arrays;
import java.util.Comparator;

public class _3_01_Knapsack {

//    public static void knapsack(int[] wt, int[] val, int maxWt){    // Greedy Approach
//
//        int[][] info = new int[wt.length][2];
//
//        for (int i=0; i<info.length; i++){
//            info[i][0] = i;
//            info[i][1] = (val[i] / wt[i]);
//        }
//
//        Arrays.sort(info, Comparator.comparing(o -> o[1]));     // Sorts in Ascending order.
//
//        int capacity = maxWt;
//        int fianlVal = 0;
//        for (int i= info.length-1; i>=0; i--){                  // As we need descending order, we use reverse loop
//            int idx = info[i][0];
//            if(capacity >= wt[idx]){
//                fianlVal += val[idx];
//                capacity -= wt[idx];
//
//            }
//        }
//        System.out.println(fianlVal);
//    }

    public static int recurKnapsack(int[] wt, int[] val, int maxWt, int n){    // As we are using recursion we need to increment the index when we call for next.......

        // Base case
        if(maxWt == 0 || n == 0){
            return 0;
        }

        // Recursion
        if(wt[n-1] <= maxWt){      // n-1 gives us the index of the element as -> item 2 is on 1st idx; item 1 is on 0th index
            // include
            int ans1 = val[n-1] + recurKnapsack(wt, val, maxWt-wt[n-1], n-1);
            // exclude
            int ans2 = recurKnapsack(wt, val, maxWt, n-1);
            return Math.max(ans1, ans2);
        }
        else
            return recurKnapsack(wt, val, maxWt, n-1);

    }


    public static void main(String[] args) {

        int[] wt = {2, 5, 1, 3, 4};
        int[] val = {15, 14, 10, 45, 30};
        int maxWt = 7;

        System.out.println(recurKnapsack(wt, val, maxWt, wt.length));
    }
}
