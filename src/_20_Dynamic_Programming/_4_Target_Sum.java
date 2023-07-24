package _20_Dynamic_Programming;

public class _4_Target_Sum {
    // Similar to 0-1 Knapsack

    public static boolean tarSum(int[] nums, int tarSum){
        int n = nums.length;
        boolean dp[][] = new boolean[n+1][tarSum+1];

        for (int i=0; i<n+1; i++){
            dp[i][0] = true;
        }
        // Here the first row is already initialised as False byDefault in java. False -> as if n=0 and sum>0 this condition is always false.

        for (int i=1; i<n+1; i++){
            for (int j=1; j<tarSum+1; j++){
                int v = nums[i-1];
                if (v <= j && dp[i-1][j-v] == true){   // 2nd Cond => can the first i-1 elements in nums array achive the sum j-v.
                    dp[i][j] = true;                   //
                }else if(dp[i-1][j] == true){
                    dp[i][j] = true;
                }
            }
        }
        return dp[n][tarSum];
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 7, 1, 3};
        int tarSum = 10;

        System.out.println(tarSum(nums, tarSum));

    }
}
