package _3_Strings;

import javax.swing.text.AttributeSet;
import java.util.HashMap;
import java.util.Map;

public class _7_Duplicate_Char_Frequency {
    // Return and what frequency have the characters repeated in a String.

    public static void dcf(String s){
        HashMap<Character, Integer> hm = new HashMap<>();
        int n = s.length();
        for (int i=0; i<n; i++){
            if (hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
            }
            else {
                hm.put(s.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> mapElem : hm.entrySet()){
            if (mapElem.getValue() > 1){
                System.out.println(mapElem.getKey() + ", count = " + mapElem.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        dcf(s);
    }
}
