package _20_Dynamic_Programming;

import java.lang.reflect.Array;

public class _2_Climbing_Stairs {

    // Normal RECURSION - O(2^n)
    public static int countStairs(int n){
        if(n==0){           // For not climbing there is "1" way i.e. not to do anything 🤣
            return 1;
        }
        if(n < 0){          // Function is recursively called for lower values which can go below 0;
            return 0;
        }

        return countStairs(n-1) + countStairs(n-2);
    }

    //      MEMOIZATION   -    O(n)
    public static int memoStairs(int n){
        int[] dp = new int[n+1];
        if (n == 0){
            return 1;
        }
        if (n < 0){
            return 0;
        }
        dp[n] = memoStairs(n-1) + memoStairs(n-2);

        return dp[n];
    }

    //  TABULATION
    public static int tabStairs(int n, int[] dp){
        dp[0] = 1;
        dp[1] = 1;

        for (int i=2; i<=n; i++){  // we want it till n so <n+1 OR <=n
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    public static void main(String[] args) {

        int n = 5;
//        System.out.println(countStairs(n));


//        System.out.println(memoStairs(n));    // MEMOIZATION

        int[] dp = new int[n+1];
        System.out.println(tabStairs(n, dp));    // TABULATION

    }
}
