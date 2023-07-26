package _20_Dynamic_Programming;

public class _6_Rod_Length {
    // Same logic as unbounded knapsack

    public static int maxLen(int[] lens, int[] price, int L){    // L -> total allowed length
        int n = price.length;
        int[][] dp = new int[n+1][L+1];

        // the array is already initialized as 0;
        // So no need to make 1st row and column as zero for base case;

        for (int i=1; i<n+1; i++){
            for (int j=1; j<L+1; j++){
                if(lens[i-1] <= j){
                    dp[i][j] = Math.max(price[i-1]+dp[i][j-lens[i-1]], dp[i-1][j]);
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][L];
    }

    public static void main(String[] args) {

        int[] lens = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] price = {1, 5, 8, 9, 10, 17, 17, 20};
        int rodLen = 8;

        System.out.println(maxLen(lens, price, rodLen));
    }
}
