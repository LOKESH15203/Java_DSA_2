package _7_DevideConquer;

public class _4_ArrangeStringsInOrder {


    public static void mergeSort(String arr[], int si, int ei){

        if(si >= ei){
            return;
        }

        int mid = si+(ei-si)/2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(String arr[], int si, int mid, int ei){

        String temp[] = new String[ei-si+1];

        int i = si;
        int j = mid+1;
        int k = 0;

        while(i<= mid && j <= ei){
            if(arr[j].compareTo(arr[i]) > 0){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        for(i=si, k=0; k<temp.length; i++, k++){
            arr[i] = temp[k];
        }

    }

    public static void pritArr(String arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {


        String arr[] = {"sun", "earth", "mars", "pluto"};

        mergeSort(arr, 0, arr.length-1);
        pritArr(arr);

//        String s1 = "name";
//        String s2 = "class";
//        int b = s1.compareTo(s2);
//        System.out.println(b);
    }
}
