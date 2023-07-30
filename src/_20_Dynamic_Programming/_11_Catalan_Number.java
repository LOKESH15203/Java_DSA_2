package _20_Dynamic_Programming;

public class _11_Catalan_Number {

    public static int catRec(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int ans = 0;
        for (int i=0; i<n; i++){
            ans += catRec(i) * catRec(n-i-1);
        }
        return ans;
    }

    // Memoization
    public static int catMemo(int n, int[] dp){
        if(n == 0 || n == 1){
            return 1;
        }
        int ans = 0;
        if (dp[n] != -1){
            return dp[n];
        }

        for (int i=0; i<n; i++){
            ans += catMemo(i, dp) * catMemo(n-i-1, dp);
        }

        return dp[n] = ans;
    }

//  Tabulation - O(n^2) - this is still far better than the recursion code.
    public static int catTab(int n, int[] dp){
        dp[0] = 1;
        dp[1] = 1;
        for (int i=2; i<=n; i++){
            for (int j=0; j<i; j++){         // this calculates Ci for above loop;
                dp[i] += dp[j] * dp[i-j-1];   // Ci = Cj * Ci-j-1
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {

        int n = 4;
//        int[] dp = new int[n+1];             // For.
//        for (int i=0; i<dp.length; i++){     // Memoization.
//            dp[i] = -1;
//        }
//        System.out.println(catMemo(n, dp));

        int[] dp = new int[n+1];
        System.out.println(catTab(n, dp));
    }
}
