package _20_Dynamic_Programming;

public class _13_Matrix_Multiplication {

    // Recursion
    public static int mcmRec(int[] arr, int i, int j){
        if (i == j){        // Base case
            return 0;       // When only individual matrix are left to be multiplied.
        }
        int ans = Integer.MAX_VALUE;
        for (int k=i; k<j; k++){
            int cost1 = mcmRec(arr, i, k);      // start Ai....Ak
            int cost2 = mcmRec(arr, k+1, j);  // Ak+1....Aj end
            int cost3 = arr[i-1] * arr[k] * arr[j]; // = a * b * d => This is the cost to multiply the final result
            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(ans, finalCost);           // To find the minimum of all cost of multiplying the matrices in multiple ways.
        }
        return ans;
    }

    // Memoization - O(n^2)
    public static int mcmMemo(int[] arr, int i, int j, int[][] dp){
        if(i == j){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for (int k=i; k<j; k++){
            int cost1 = mcmMemo(arr, i, k, dp);
            int cost2 = mcmMemo(arr, k+1, j, dp);
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(ans, finalCost);
        }
        return dp[i][j] = ans;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 3};
        int n = arr.length;

//        System.out.println(mcmRec(arr, 1, n-1));

        int[][] dp = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(mcmMemo(arr, 1, n-1, dp));

    }

}
