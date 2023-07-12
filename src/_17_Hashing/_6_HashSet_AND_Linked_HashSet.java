package _17_Hashing;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _6_HashSet_AND_Linked_HashSet {


    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();

        hs.add("Delhi");
        hs.add("Mumbai");
        hs.add("Noida");
        hs.add("Bengaluru");
        System.out.println(hs);

        System.out.println(hs.contains(1));

        hs.remove(5);
        System.out.println(hs);


        LinkedHashSet<String> lhs = new LinkedHashSet<>(); // Prints in the order of the inputs made
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");

        System.out.println(lhs);
        // All operations of HashSet can be performed on likedHashSet


        TreeSet<String> ts = new TreeSet<>();   // Sorts the input in ascending order
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengaluru");

        System.out.println(ts);
    }
}
