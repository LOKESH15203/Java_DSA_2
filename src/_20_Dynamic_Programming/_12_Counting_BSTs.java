package _20_Dynamic_Programming;

public class _12_Counting_BSTs {

    public static int bstTab(int n, int[] dp){
        dp[0] = 1;
        dp[1] = 1;

        for (int i=2; i<=n; i++){
            for (int j=0; j<i; j++){
//                dp[i] += dp[j] * dp[i-j-1]; // This line or for better understanding the 3 lines below
                int left = dp[j];
                int right = dp[i-j-1];
                dp[i] += left * right;
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {

        int n = 4;
        int[] dp = new int[n+1];
        System.out.println(bstTab(n, dp));
    }
}
