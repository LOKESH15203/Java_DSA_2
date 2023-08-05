package _1_Arrays;

public class _3_Reverce {

    public static void reverse(int arr[]){

        int first = 0; 
        int last = arr.length-1; 

        while (first < last){

            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {

        int arr[] = {2, 3, 4, 5, 6, 7};

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        reverse(arr);

        System.out.println();
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        
    }
    
}
