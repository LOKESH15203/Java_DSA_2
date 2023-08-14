package _0_TP;

import java.util.ArrayList;

public class ArrayListTrial {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(4);
        al.add(5);
        al.add(2);
        al.add(3);
        System.out.println(al.contains(1));
        System.out.println(al);
        int a = al.size();
        al.clear();
        System.out.println(al);

    }
}
