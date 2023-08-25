package _3_1_SearchingSorting;

import java.util.ArrayList;
import java.util.List;

public class _1_CommonIn3Arrays {

    public static List comIn3(int[] a1, int[] a2, int[] a3){
        List<Integer> comEle = new ArrayList<>();

        int i=0, j=0, k=0;

        while (i<a1.length && j<a2.length && k<a3.length){
            if (a1[i] == a2[j] && a1[i] == a3[k]){
                comEle.add(a1[i]);
                i++;
                j++;
                k++;
            }
            else if (a1[i] < a2[j]){
                i++;
            }
            else if (a2[j] < a3[k]){
                j++;
            }
            else {
                k++;
            }
        }
        return comEle;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 10, 20, 40, 80};
        int[] arr2 = {6, 7, 20, 80, 100};
        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};

        System.out.println(comIn3(arr1, arr2, arr3));

    }
}
