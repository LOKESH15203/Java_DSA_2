package _8_Backtracking;

public class _1_In_Array {

    public static void changeArr(int arr[], int i, int v){  // i = index; v = value

        if(i == arr.length){
            printArr(arr);
            return;
        }  // When the base case is hit the array
           // with values just added by recursion are displayed

        // Filling the array
        arr[i] = v;
        changeArr(arr, i+1, v+1);

        // replacing the values
        arr[i] = arr[i]-2;
    }

    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = new int[5];
        changeArr(arr, 0, 1);  // When the base case is hit the array
                                    // with values just added by recursion are displayed
        printArr(arr);

    }
}
