package _9_ArrayList;

import java.util.ArrayList;

public class _4_MultiDimentional {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> mdal = new ArrayList<>();

        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        al.add(3);
        al.add(5);
        al2.add(7);
        al2.add(9);
        al2.add(1);
        mdal.add(al);        ////////////
        mdal.add(al2);       ////////////
        System.out.println(mdal);

        // To Print in Primitive form
        for(int i=0; i<mdal.size(); i++){
            ArrayList<Integer> currentList = mdal.get(i);
            for (int j=0; j<currentList.size(); j++){
                System.out.print(currentList.get(j)+ " ");
            }
            System.out.println();
        }

    }
}
