package _17_Hashing;

import java.util.HashSet;

public class _9_Union_AND_Intersection {

    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        // Union
        HashSet<Integer> uhs = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            uhs.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            uhs.add(arr2[i]);
        }

        System.out.println("Union of the 2 given arrays is : " + uhs);
        System.out.println("No. of elements in the union are : " + uhs.size());

        // Intersection
        HashSet<Integer> ihs = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            ihs.add(arr1[i]);
        }
        int count = 0;
        for(int i=0; i<arr2.length; i++){
            if(ihs.contains(arr2[i])){
                count++;
                ihs.remove(arr2[i]);
            }
        }

        System.out.println("No. of elements in the intersection are : " + count);
    }
}
