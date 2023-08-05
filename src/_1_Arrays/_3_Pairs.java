package _1_Arrays;

public class _3_Pairs {

    public static void printPairs(int[] arr){
        for (int i=0; i<arr.length-1; i++){
            for (int j=i+1; j<arr.length; j++){
                System.out.println(arr[i] + ", " +arr[j]);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6};
        printPairs(arr);
    }
}
