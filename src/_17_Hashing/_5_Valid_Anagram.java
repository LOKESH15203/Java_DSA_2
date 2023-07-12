package _17_Hashing;

import java.util.HashMap;

public class _5_Valid_Anagram {
    // Anagram -> New word made from rearranging letters of other word
    // Ex. -> "ab <-> ba" ,  "race <-> care"

    public static Boolean isAnagram(String s, String r){
        if(s.length() != r.length()){
            return false;
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i=0; i<s.length(); i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
            }else
                hm.put(s.charAt(i), 1);
        }

        // To remove items from the HashMap using 2nd String. If it results in Emptying the entire Hashmap Then return true

        for (int i=0; i<r.length(); i++) {
            if (hm.containsKey(r.charAt(i))) {
                if (hm.get(r.charAt(i)) == 1) {
                    hm.remove(r.charAt(i));
                }else
                    hm.put(r.charAt(i), hm.get(r.charAt(i))-1);
            }else
                return false;
        }

            if (hm.isEmpty()) {
                return true;
            } else
                return false;

    }

    public static void main(String[] args) {

        String s = "race";
        String r = "care";

        System.out.println(isAnagram(s, r));

    }
}
