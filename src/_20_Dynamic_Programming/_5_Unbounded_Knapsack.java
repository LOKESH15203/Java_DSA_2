package _20_Dynamic_Programming;

public class _5_Unbounded_Knapsack {
    // same as 0-1 knapsack just a minute change on line No. 18

    // O(n * w)
    public static int knapsackUnbound(int[] val, int[] wt, int maxWt){
        int n = val.length;
        int dp[][] = new int[n+1][maxWt+1];

        // initialize first row and column to 0.
        // But that is byDefault done in java, so need to explicitly do it.

        for (int i=1; i<n+1; i++){
            for (int j=1; j<maxWt+1; j++){
                int v = val[i-1];
                int w = wt[i-1];
                if (w <= j){
                    dp[i][j] = Math.max(v+dp[i][j-w], dp[i-1][j]); // i-1 is replaced by i
                    // but i-1 remains in the 2D array which means that i-1 items can be added multiple time to fill j weight.
                }else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][maxWt];
    }

    public static void main(String[] args) {

        int[] wt = {2, 5, 1, 3, 4};
        int[] val = {15, 14, 10, 45, 30};
        int maxWt = 7;
        System.out.println(knapsackUnbound(val, wt, maxWt));

    }
}
