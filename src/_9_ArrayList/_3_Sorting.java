package _9_ArrayList;

//import java.util.ArrayList;
//import java.util.Collections;

import java.util.*;

public class _3_Sorting {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(5);
        al.add(7);
        al.add(9);
        al.add(1);
        System.out.println(al);

        Collections.sort(al);
        System.out.println(al); // Ascending

        Collections.sort(al, Collections.reverseOrder()); // Descending
        System.out.println(al);
    }
}
