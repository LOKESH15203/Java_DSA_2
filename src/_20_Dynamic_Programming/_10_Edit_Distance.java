package _20_Dynamic_Programming;

public class _10_Edit_Distance {
    // The function below returns the No. of operations that are necessary to convert string s1 -> s2
    // Same as least common Subsequence
    // O(n*m)
    public static int editDist(String s1, String s2, int n, int m, int[][] dp){
        // initialization;
        for(int i=0; i<n+1; i++){
            dp[i][0] = i;
        }
        for(int i=0; i<m+1; i++){
            dp[0][i] = i;
        }

        for (int i=1; i<n+1; i++){
            for (int j=1; j<m+1; j++){
                if (s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else {
                    int add = dp[i][j-1] + 1;
                    int delete = dp[i-1][j] + 1;
                    int replace = dp[i-1][j-1] + 1;
                    dp[i][j] = Math.min(add, Math.min(delete, replace));
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {

        String s1 = "intention";
        String s2 = "execution";
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n+1][m+1];

        System.out.println(editDist(s1, s2, n, m, dp));
    }
}
