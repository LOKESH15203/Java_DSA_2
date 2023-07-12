package _9_ArrayList;

import java.util.ArrayList;

public class _8_Count_Following_Key {

    public static int count(ArrayList<Integer> al, int key, int target){
        int count = 0;
        for(int i=1; i< al.size(); i++){
            if(al.get(i-1)== key && al.get(i) == target ){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(1);
        al.add(100);

        System.out.println(count(al, 1, 100));
    }
}
