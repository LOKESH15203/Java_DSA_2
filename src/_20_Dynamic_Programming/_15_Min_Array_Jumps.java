package _20_Dynamic_Programming;

import java.util.Arrays;

public class _15_Min_Array_Jumps {

    public static int minDis(int[] arr, int n){
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        dp[n-1] = 0;

        // initialize first row and column to be zero
        for (int i=n-2; i>=0; i--){  // From second last index to 1st.
            int steps = arr[i];
            int ans = Integer.MAX_VALUE;
            for (int j=i+1; j<=i+steps && j<n; j++){    //
                if(dp[j] != -1){
                    ans = Math.min(ans, dp[j]+1);
                }
            }
            if (ans != Integer.MAX_VALUE){
                dp[i] = ans;
            }
        }
        return dp[0];  // This, returns total jumps from zero to n-1th Index;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 1, 4};
        int n = arr.length;
        System.out.println(minDis(arr, n));
    }
}
