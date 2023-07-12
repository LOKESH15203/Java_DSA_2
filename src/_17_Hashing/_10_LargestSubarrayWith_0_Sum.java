package _17_Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class _10_LargestSubarrayWith_0_Sum { // O(n)
    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10};

        HashMap<Integer, Integer> hm = new HashMap<>();
             // (Sum,      Idx)
        int sum = 0;
        int len = 0;

        for(int j=0; j<arr.length; j++){
            sum+= arr[j];
            if(hm.containsKey(sum)){
                len = Math.max(len, j-hm.get(sum));    // j-(index at which 15 is)
            }else {
                hm.put(sum, j); // add latest sum and its index
            }
        }
        System.out.println("Length of Largest subArray with sum zero is : " + len);
    }
}
