package _17_Hashing;

import java.util.HashMap;
import java.util.Set;

public class _4_Majority_Element {

    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};

        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }else
                hm.put(arr[i], 1);
        }

        Set<Integer> keySet = hm.keySet();
        for (Integer key: keySet) {                               // Just like writing key from keySet
            if(hm.get(key) > arr.length/3){
                System.out.println(key);
            }
        }
    }
}
