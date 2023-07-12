package _16_Heaps;

import java.util.ArrayList;

public class _3_HeapSort {
    public static void heapify(int i, int size, int[] arr){
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIdx = i;

        if(left < size && arr[left] > arr[maxIdx]){
            maxIdx = left; /////// This changes where "midIdx" is pointing
        }
        if (right < size && arr[right] > arr[maxIdx]){
            maxIdx = right;
        }

        if(maxIdx != i){ // if midIdx pointer changed - Bring it back.
            // swap
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(maxIdx, size, arr);// We swaped the elements but maxIdx is pointing to where the next big No was. Be it right or left.
        }
    }
    public static void heapSort(int[] arr){ // O(n * log(n))
        // Build maxHeap
        int n = arr.length;
        for(int i=n; i>=0; i--){
            heapify(i, n, arr);
        }

        // push largest at the end
        for(int i=n-1; i>0; i--){
            // swap
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(0, i, arr);
        }
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        heapSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
