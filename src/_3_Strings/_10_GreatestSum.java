package _3_Strings;

import java.util.Arrays;
import java.util.Collections;

public class _10_GreatestSum {

    /*
    Given two arrays of equal size n and an integer k. The task is to permute both arrays such that
    sum of their corresponding element is greater than or equal to k i.e a[i] + b[i] >= k. The task is
    to print “Yes” if any such permutation exists, otherwise print “No”.
     */

    // By me - Easy problem.
    public static boolean get(int[] arr1, Integer[] arr2, int k){
        Arrays.sort(arr1);
        Arrays.sort(arr2, Collections.reverseOrder());

        for (int i=0; i<arr1.length; i++){
            if (!(arr1[i]+arr2[i] >= k)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 2, 1};
        Integer[] b = { 3, 3, 3, 4 };
        int k = 10;
        System.out.println(get(a, b, k));
    }
}
