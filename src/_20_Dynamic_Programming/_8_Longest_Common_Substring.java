package _20_Dynamic_Programming;

public class _8_Longest_Common_Substring {
                                    // this is a variation of LC subsequence

    // O(m*n)
    public static int lcsTab(String s1, String s2, int n, int m, int[][] dp){

        // initialize first row and column as zero for base case when one of the string lengths is 0;

        // filling
        int ans = 0;
        for (int i=1; i<n+1; i++){
            for (int j=1; j<m+1; j++){
                if (s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else {
                    dp[i][j] = 0;
                }
                ans = Math.max(dp[i][j], ans);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s1 = "ABCDE";
        String s2 = "ABGCE";
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n+1][m+1];
        System.out.println(lcsTab(s1, s2, n, m, dp));
    }
}
