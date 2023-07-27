package _20_Dynamic_Programming;

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



    public static void main(String[] args) {
        int[] arr = {50, 3, 10, 7, 40, 80};
        int n = arr.length;
        System.out.println(lis(arr, n));
    }
}
