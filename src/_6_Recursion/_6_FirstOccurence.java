package _6_Recursion;

public class _6_FirstOccurence {

    public static void firstOccurence(int arr[], int i, int key){
        if(i == arr.length-1){
            return;
        }
        else if(arr[i] == key){
            System.out.println("Element found at index " + i);
            return;
        }
        firstOccurence(arr, i+1, key);
    }

    public static void main(String[] args) {

        int ar[] = {3, 6, 2, 7, 5, 8, 2, 9, 5};

        firstOccurence(ar, 0, 5);

    }
}
