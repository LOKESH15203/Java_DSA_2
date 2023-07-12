package _9_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class _7_Lonely_Num {

    public static void aloneNos(ArrayList<Integer> al){

        if(al.get(0+1) != al.get(0)+1 && al.get(0+1) != al.get(0)-1){
            System.out.println(al.get(0));
        }
        for(int i = 1; i < al.size()-1; i++){
            if(al.get(i-1) != al.get(i)-1 && al.get(i+1) != al.get(i)+1 && al.get(i-1) != al.get(i)+1 && al.get(i+1) != al.get(i)-1 ){
                System.out.println(al.get(i));
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(6);
        al.add(5);
        al.add(12);
        al.add(90);
        al.add(8);
//        al.add(5);
//        al.add(4);

        aloneNos(al);
        Collections.sort(al);
        System.out.println(al);
    }
}
