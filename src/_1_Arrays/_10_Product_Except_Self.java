package _1_Arrays;

import java.util.Arrays;

public class _10_Product_Except_Self {

    /*
    Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.
     */

    /*
    Similar to finding Prefix Sum Array, here we would intend to find the Prefix Product Array and Suffix Product Array for our original array, i.e. pre[i] = pre[i - 1] * a[i - 1] (yes, we multiply with a[i - 1] and not with a[i] on purpose) and similarly suff[i] = suff[i + 1] * a[i + 1].
Now, at any index i our final answer ans[i] would be given by ans[i] = pre[i] * suff[i]. Why? Because the pre[i] * suff[i] contains product of every element before i and every element after i but not the element at index i (and that is the reson why we excluded a[i] in our prefix and suffix product).
The Time Complexity would be O(n), but we are now using Auxilary Space of O(n) (excluding the final answer array).
     */

    // Not Optimised
//    public static int[] productExceptSelf(int[] nums) {
//        int n= nums.length;
//        int[] ans = new int[n];
//        Arrays.fill(ans, 1);
//        for (int i=0; i<n; i++){
//            for (int j=0; j<n; j++){
//                if (j != i){
//                    ans[i] *= nums[j];
//                }
//            }
//        }
//        return ans;
//    }

    public static int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] pre = new int[n];
        int[] suff = new int[n];
        // Base case
        pre[0] = 1;
        suff[n-1] = 1;

        for (int i=1; i<n; i++){
            pre[i] = pre[i-1] * nums[i-1];     // gives [1, 1, 2, 6]
        }
        for (int i=n-2; i>=0; i--){
            suff[i] = suff[i+1] * nums[i+1];   // gives [24, 12, 8, 6]
        }

        int[] ans = new int[n];
        for (int i=0; i<n; i++){
            ans[i] = pre[i]*suff[i];
        }

        return ans;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(productExceptSelf(nums));
    }
}
