package _20_Dynamic_Programming;

import java.util.Arrays;
import java.util.HashSet;

public class _9_Longest_Increasing_Subsequence {

    // LIS using Recursion - Written by me.
    public static int lis(int[] arr, int n){
        if(n==0){
            return 1;
        }
        if(arr[n-2] < arr[n-1]){
            return lis(arr, n-1)+1;
        }
        else {
            return lis(arr, n-2);
        }
    }


    public static int lisTab(int[] arr, int n, int m, int[][] dp){
        HashSet<Integer> hs = new HashSet<>(); // To remove duplicate entries. in arr
        for (int i=0; i<arr.length; i++){
            hs.add(arr[i]);
        }

        int[] arr2 = new int[arr.length];
        int p=0;                            // here p is just a variable to replace i;
        for (int num : hs) {       // This is a foreach loop
            arr2[p] = num;
            p++;
        }
        Arrays.sort(arr2);

        //  Now     ###    LCS     ###
        // initializing first row and col to zero;

        for (int i=1; i<n+1; i++){
            for (int j=1; j<m+1; j++){
                if(arr[i-1] == arr2[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else {
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }



    public static void main(String[] args) {
        int[] arr = {50, 3, 10, 7, 40, 80};
//        int n = arr.length;                      // For
//        System.out.println(lis(arr, n));         // Recursion
        int n = arr.length, m = arr.length;
        int dp[][] = new int[n+1][m+1];
        System.out.println(lisTab(arr, n, m, dp));
    }
}
