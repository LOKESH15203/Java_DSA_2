package _6_Recursion;

public class _5_IsArraySorted {

    public static Boolean isSorted(int arr[], int i){

        if(i == arr.length - 1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static void main(String[] args) {

        int arr[] = {1, 3, 5, 14, 9};
        System.out.println(isSorted(arr, 0));
    }
}
