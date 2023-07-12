package _7_DevideConquer;

public class _2_QuickSort {

    public static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei){

        if(si>=ei){
            return;
        }
        // Below returns the index of
        int pIdx = partision(arr, si, ei);
        quickSort(arr, si, pIdx-1);   // left subArray
        quickSort(arr, pIdx+1, ei);   // right subArray
    }

    public static int partision(int arr[],int si,int ei){
        int i = si-1; // To make space for smaller elements
        int pivot = arr[ei];

        for(int j=si; j<ei; j++){
            if(arr[j] < pivot){ // here pivot represents arr[i]
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void main(String[] args) {

        int arr[] = {4, 9, 3, 8, 1, 5};

        quickSort(arr, 0, arr.length-1);
        printarr(arr);
    }
}
