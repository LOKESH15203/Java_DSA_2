package _7_DevideConquer;

public class _3_SearchRotatedSortedArray {

    public static int search(int arr[], int tar, int si, int ei){
        if(si>ei){
            return -1;
        }

        int mid = si+(ei - si)/2;

        if(arr[mid] == tar){
            return mid;
        }

        //  On Line 1
        if(arr[si]<arr[mid]){
            // Left of line 1
            if(arr[si]<= tar && tar <= arr[mid]){
                return search(arr, tar, si, mid-1);
            }
            // Right of line 1
            else{
                return search(arr, tar, mid+1, ei);
            }
        }

        // On line 2
        else{
            // Right if mid
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr, tar, mid+1, ei);
            }
            else{
                return search(arr, tar, si, mid-1);
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {4, 5, 6, 7, 1, 2, 3};
        int tarin = search(arr, 1, 0, arr.length-1);
        System.out.println(tarin);
    }
}
