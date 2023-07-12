package _7_DevideConquer;

public class _1_MergeSort {

    public static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei){

        if(si >= ei){
            return;
        }
        int mid = si+ (ei - si)/2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){  // We specify si & ei in main function

        int temp[] = new int[ei-si+1];   // for this example (5-0 + 1 = 6) as the indexing starts from 0

        int i = si;     // Left subArray start index
        int j = mid+1;  // Right subArray start index
        int k = 0;      // iterator for the tempArray

        while (i<= mid && j<= ei){
            if(arr[i] < arr[j]){  // adding 1st element from the 1st subArray if smaller than 1st element of 2nd array
                temp[k] = arr[i];
                i++;
            }
            else {                // adding 1st element from the 2nd subArray if smaller than 1st element of 1st array
                temp[k] = arr[j];
                j++;
            }
            k++; // this has to be done in both the above conditional statements, better write it outside.
        }

        while(i <= mid){    // To print the last element that remains after the final comparison in 1st arr
            temp[k++] = arr[i++];
        }

        while (j <= ei){
            temp[k++] = arr[j++];
        }

        // Copying the elements back to the original array
        for(k=0, i=si; k<temp.length; k++, i++){  // look at the "," & ";" // i = si makes a difference
            arr[i] = temp[k];
        }
    }


    public static void main(String[] args) {

        int arr[] = {5, 7, 2, 3, 1, 4};

        mergeSort(arr, 0, arr.length-1);
        printarr(arr);
    }
}
