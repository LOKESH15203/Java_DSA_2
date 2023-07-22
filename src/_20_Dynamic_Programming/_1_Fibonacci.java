package _20_Dynamic_Programming;

import java.lang.reflect.Array;

public class _1_Fibonacci {

//    public static int fibonacci(int n){
//
//        if (n == 0 || n==1){
//            return n;
//        }
//        return fibonacci(n-1) + fibonacci(n-2);
//    }

//    Fibonacci Using Dynamic Programming   --  ###   MEMOIZATION   ###

    public static int fibonacci(int n, int[] dp){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n] != 0){
            return dp[n];    // This returns the value from the array so that it doesn't have to be calculated again.
        }

        dp[n] = fibonacci(n-1, dp) + fibonacci(n-2, dp);
        return fibonacci(n, dp);
    }

//    Fibonacci Using Dynamic Programming   --  ###   TABULATION   ###
    public static int fibo(int n, int[] dp){
        dp[0] = 0;
        dp[1] = 1;

        for (int i=2; i<n+1; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }


    public static void main(String[] args) {
    int n = 6;

//    System.out.println(fibonacci(n));  // Without DP

//        int[] dp = new int[n+1];                // With Memoization
//        System.out.println(fibonacci(n, dp));

        int[] dp = new int[n+1];                // With Tabulation
        System.out.println(fibo(n, dp));
    }
}
