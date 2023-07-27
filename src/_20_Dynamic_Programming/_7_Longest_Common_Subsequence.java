package _20_Dynamic_Programming;

public class _7_Longest_Common_Subsequence {

    // Recursion
//    public static int lcs(String s1, String s2, int n, int m){
//        if(n == 0 || m == 0){
//            return 0;
//        }
//
//        if (s1.charAt(n-1) == s2.charAt(m-1)){
//            return lcs(s1, s2, n-1, m-1) + 1;
//        }
//        else{
//            int ans1 = lcs(s1, s2, n-1, m);
//            int ans2 = lcs(s1, s2, n, m-1);
//            return Math.max(ans1, ans2);
//        }
//    }

    //  Memoization - O(n*m)
    public static int lcs2(String s1, String s2, int n, int m, int[][] dp){
        if(n == 0 || m == 0){
            return 0;
        }

        if (dp[n][m] != -1){
            return dp[n][m];        // this avoids the recalculation for the same values of n amd m if already calculated
        }

        if (s1.charAt(n-1) == s2.charAt(m-1)){  // if last character same
            return dp[n][m] = lcs2(s1, s2, n-1, m-1, dp) + 1;
        }
        else{
            int ans1 = lcs2(s1, s2, n-1, m, dp);
            int ans2 = lcs2(s1, s2, n, m-1, dp);
            return dp[n][m] = Math.max(ans1, ans2);
        }
    }
 // Tabulation
    public static int lcs3(String s1, String s2, int n, int m, int[][] dp){

        // initializing first row and column with 0; This is when  n = 0 || m = 0
        // Already Initialised

        for (int i=1; i<n+1; i++){
            for (int j=1; j<m+1; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else {
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {

        String str1 = "abcde";
        String str2 = "ace";
        int n = str1.length();
        int m = str2.length();

//        System.out.println(lcs(str1, str2, n, m));


//        int[][] dp = new int[n+1][m+1];
//        for (int i=0; i<n+1; i++){
//            for (int j=0; j<m+1; j++){
//                dp[i][j] = -1;
//            }
//        }
//        System.out.println(lcs2(str1, str2, n, m, dp));


        int[][] dp = new int[n+1][m+1];
        System.out.println(lcs3(str1, str2, n, m, dp));
    }
}
