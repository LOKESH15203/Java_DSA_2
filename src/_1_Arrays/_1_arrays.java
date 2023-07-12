package _1_Arrays;
public class _1_arrays {
    public static void main(String[] args) {
        
        int arr[] = new int[15];

        for(int i = 0; i <= 14; i++){
            arr[i] = i;
        }

        arr[0] = 90;
        for(int i= 0; i < arr.length; i++){ // as using "<" sign it means arr.length - 1;
            System.out.print(arr[i]+ " ");
        }

        int array[] = {2, 5, 7};
        System.out.println(array.length);

    }
    
}
