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

    // MEMOIZATION      O(n * maxWt)
    public static int memoKnapsack(int[] wt, int[] val, int maxWt, int n, int[][] dp){
        if(n==0 || maxWt == 0){
            return 0;
        }
        if(dp[n][maxWt] != -1){
            return dp[n][maxWt];
        }

        if(wt[n-1] <= maxWt){      // n-1 gives us the index of the element as -> item 2 is on 1st idx; item 1 is on 0th index
            // include
            int ans1 = val[n-1] + memoKnapsack(wt, val, maxWt-wt[n-1], n-1, dp);
            // exclude
            int ans2 = memoKnapsack(wt, val, maxWt, n-1, dp);
            dp[n][maxWt] = Math.max(ans1, ans2);
            return dp[n][maxWt];
        }
        else
            return memoKnapsack(wt, val, maxWt, n-1, dp);

    }

    // TABULATION
    public static int tabKnapsack(int[] val, int[] wt, int maxWt){
        int n = val.length;
        int[][] dp = new int[n+1][maxWt+1];

        for (int i=0; i<n+1; i++){ // initializing the 0th column to 0;
            dp[i][0] = 0;          // java does initialize the array with 0, but still we did it for understanding
        }
        for (int j=0; j<maxWt+1; j++){     // initializing the 0th row to zero;
            dp[0][j] = 0;
        }

        for (int i=1; i<n+1; i++){
            for (int j=1; j<maxWt+1; j++){
                int v = val[i-1];          // i-1 because we added an extra index in the 2D array
                int w = wt[i-1];

                if(w <= j){      // as maxWt is decreasing we need to write "j"
                    int incProfit = v + dp[i-1][j-w];   // adds the value of current index and the valur at the index with less values and subtracted weight that must be calculated in previous iterations
                    int excProfit = dp[i-1][w];     // no value add no decrease in weight
                    dp[i][j] = Math.max(incProfit, excProfit);
                }else {
                    int excProfit = dp[i - 1][w];
                    dp[i][j] = excProfit;
                }
            }
        }
        return dp[n][maxWt];
    }

    public static void main(String[] args) {

        int[] wt = {2, 5, 1, 3, 4};
        int[] val = {15, 14, 10, 45, 30};
        int maxWt = 7;

        int[][] dp = new int[val.length+1][maxWt+1];
        for (int i=0; i<dp.length; i++){
            for (int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(memoKnapsack(wt, val, maxWt, wt.length, dp));

        System.out.println(tabKnapsack(val, wt, maxWt));
    }
}
