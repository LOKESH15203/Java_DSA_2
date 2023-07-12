package _17_Hashing;

import java.util.HashMap;

public class _11_Count_Subarray_Sum_k {

    public static void main(String[] args) {

        int arr[] = {10, 2, -2, -20, 10};
        int k = -10;

        int sum = 0;
        int ans = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();
        // (Sum, Count)
        hm.put(0, 1);

        for(int j=0; j<arr.length; j++){
            sum += arr[j];
            if(hm.containsKey(sum-k)){
               ans += hm.get(sum-k);
            }
            hm.put(sum, hm.getOrDefault(sum, 0)+1);        // If already exists then add 1 else add default value i.e. 0
        }
        System.out.println(ans);
    }
}
