package _9_ArrayList;

import java.util.ArrayList;

public class _2_Maximum {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(5);
        al.add(7);
        al.add(9);
        al.add(1);
        System.out.println(al);

        int max = Integer.MIN_VALUE;

        for(int i=0; i<al.size(); i++){
            if(al.get(i) > max){
                max = al.get(i);
            }
        }
        System.out.println(max);
    }
}
