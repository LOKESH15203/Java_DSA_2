package _3_1_SearchingSorting;

public class _2_SearchingInStepArray {

    public static int occurence(int[] arr, int x){

        for (int i=0; i<arr.length; i++){
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 6};
        System.out.println(occurence(arr, 6));
    }
}
