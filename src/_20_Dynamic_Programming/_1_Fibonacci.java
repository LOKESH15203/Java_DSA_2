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

//    Fibonacci Using Dynamic Programming

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

    public static void main(String[] args) {
    int n = 5;

//    System.out.println(fibonacci(n));

//        int[] dp = new int[n+1];
//        System.out.println(fibonacci(n, dp));
    }
}
