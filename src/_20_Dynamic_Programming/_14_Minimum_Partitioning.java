package _20_Dynamic_Programming;

public class _14_Minimum_Partitioning {

    public static int diff(int[] num, int[][] dp, int n, int hSum, int sum){

        for (int i=1; i<n+1; i++){
            for (int j=1; j<hSum+1; j++){
                int v = num[i-1];
                if (v <= j){
                    int inc = v + dp[i-1][j-v];
                    int exc = dp[i-1][j];
                    dp[i][j] = Math.max(inc, exc);
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        int sum1 = dp[n][hSum];
        int sum2 = sum - sum1;
        return Math.abs(sum1 - sum2);
    }

    public static void main(String[] args) {

        int[] arr = {1, 6, 11, 5};
        int n = arr.length;
        int sum = 0;
        for (int i=0; i<n; i++){
            sum += arr[i];
        }
        int hSum = sum/2;
        int[][] dp = new int[n+1][hSum+1];
        System.out.println(diff(arr, dp, n, hSum, sum));

    }
}
