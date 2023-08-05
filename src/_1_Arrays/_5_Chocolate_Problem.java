package _1_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _5_Chocolate_Problem {

    public static int minDiff(int[] arr, int m){
        int n = arr.length;
        if(n==0 || m==0){
            return 0;
        }
        if(n<m){
            return -1;
        }

        Arrays.sort(arr);
        int minDif = Integer.MAX_VALUE;

        for (int i=0; i<=n-m; i++){
            int diff = arr[i+m-1] - arr[i];
            minDif = Math.min(minDif, diff);
        }
        return minDif;
    }

    public static void main(String[] args) {

        int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        int m = 5;
        System.out.println(minDiff(arr, m));

    }
}
