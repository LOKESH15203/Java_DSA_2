package _1_Arrays;

public class _3_Reverce {

    public static void reverce(int arr[]){

        int first = 0; 
        int last = arr.length-1; 

        while (first<last){

            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
        }
    }

    public static void main(String[] args) {

        _3_Reverce r = new _3_Reverce();
        int arr[] = {2, 3, 4, 5, 6, 7};

        reverce(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
        
    }
    
}
