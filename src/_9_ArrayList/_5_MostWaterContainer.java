package _9_ArrayList;

import java.util.ArrayList;

public class _5_MostWaterContainer {

//                                        BRUTE FORCE                        O(n^2)
//    public static void MaxWater(ArrayList<Integer> al, int i, int j){
//
//        int mainArea = 0;
//        for (i=0; i<al.size()-1; i++){
//            for(j=1; j<al.size(); j++){
//                if(al.get(i) < al.get(j)){      // Math.min(al.get(i), al.get(j))
//                    int area = al.get(i) * (j-i);
//                    if (area >= mainArea){
//                        mainArea = area;
//                        System.out.println(al.get(i) + " " + al.get(j));
//                    }
//                }
//                else if(al.get(i) > al.get(j)){
//                    int area = al.get(j) * (j-i);
//                    if (area >= mainArea){
//                        mainArea = area;
//                        System.out.println(al.get(i) + " " + al.get(j));
//                    }
//                }
//            }
//        }
//        System.out.println(mainArea);
//    }

//                                       Two Pointer Approach                        O(n)
    public static int MaxWater(ArrayList<Integer> al){

        int lp = 0;
        int rp = al.size()-1;
        int maxWater = 0;

        while(lp < rp){

            int h = Math.min(al.get(lp), al.get(rp));
            int w = rp - lp;
            int currentWater = h * w;
            maxWater = Math.max(currentWater, maxWater);

            if(al.get(lp) < al.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(8);
        al.add(6);
        al.add(2);
        al.add(5);
        al.add(4);
        al.add(8);
        al.add(3);
        al.add(7);
        System.out.println(al);

        System.out.println(MaxWater(al));

    }
}
