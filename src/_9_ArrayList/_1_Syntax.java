package _9_ArrayList;
//import java.util.ArrayList; // To Import arrayList
import java.util.*; // To import Every necessary library and class

public class _1_Syntax {

    public static void main(String[] args) {

        // Array List is a part of JAVA COLLECTION FRAMEWORK

        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<String> al2 = new ArrayList<>();
        ArrayList<Boolean> al3 = new ArrayList<>();

        // Add elements
        al.add(5);
        al.add(3);
        al.add(7);
        al.add(1);
        System.out.println(al);

        // TO PRINT ARRAY LIST AS A SET OF NO.s
//        for(int i=0; i<al.size(); i++){
//            System.out.print(al.get(i) + " ");
//        }

        // Get Element
//        int elem = al.get(1);
//        System.out.println(elem);

        // Remove Elements
//        al.remove(1);
//        System.out.println(al);

        // Set Element at Index
//        al.set(2, 10);
//        System.out.println(al);

        // Contains Element
//        System.out.println(al.contains(2));


        // SIZE
        System.out.println(al.size());

        // Print Reverse
//        for(int i=al.size()-1; i>=0; i--){
//            System.out.print(al.get(i) + " ");
//        }



    }
}
