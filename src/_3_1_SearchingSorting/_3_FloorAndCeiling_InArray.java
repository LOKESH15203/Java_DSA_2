package _3_1_SearchingSorting;

public class _3_FloorAndCeiling_InArray {

    public static void position(int[] arr, int x){
        int floor;
        int ceiling;
        if (x < arr[0]){
            System.out.println("Floor Doesn't exist");
            System.out.println("Ceiling is : " + arr[0]);
        }
        if (x > arr[arr.length-1]){
            System.out.println("Floor is : " + arr[arr.length-1]);
            System.out.println("Ceiling Doesn't exist");
        }
        for (int i=1; i<arr.length; i++){
            if (x < arr[i]){
                System.out.println("Floor is : " + arr[i-1]);
                System.out.println("Ceiling is : " + arr[i]);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        position(arr, 11);
    }
}
