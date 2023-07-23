package _20_Dynamic_Programming;

import java.util.Arrays;
import java.util.Comparator;

public class _3_01_Knapsack {

    public static void knapsack(int[] wt, int[] val, int maxWt, int rIdx){    // As we are using recursion we need to increment the index when we call for next.......

        int[][] info = new int[wt.length][2];

        for (int i=0; i<info.length; i++){
            info[i][0] = i;
            info[i][1] = (val[i] / wt[i]);
        }

        Arrays.sort(info, Comparator.comparing(o -> o[1]));     // Sorts in Ascending order.

        int capacity = maxWt;
        int fianlVal = 0;
        for (int i= info.length-1; i>=0; i--){                  // As we need descending order, we use reverse loop
            int idx = info[i][0];
            if(capacity >= wt[idx]){
                fianlVal += val[idx];
                capacity -= wt[idx];

            }
        }
        System.out.println(fianlVal);
    }

    public static void main(String[] args) {

        int[] wt = {2, 5, 1, 3, 4};
        int[] val = {15, 14, 10, 45, 30};
        int maxWt = 7;

        knapsack(wt, val, maxWt, 0);
    }
}
