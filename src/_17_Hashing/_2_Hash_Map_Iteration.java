package _17_Hashing;

import java.util.HashMap;
import java.util.Set;

public class _2_Hash_Map_Iteration {

    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        // Insert
        hm.put("Pune", 140);
        hm.put("Mumbai", 300);
        hm.put("Bengaluru", 230);
        hm.put("Delhi", 150);
        hm.put("Noida", 140);
        hm.put("Ahmedabad", 230);

        Set<String> keys = hm.keySet();

        for (String k: keys) {             // FOREACH loop
            System.out.println("key = "+ k+ ", values = " + hm.get(k));
        }
    }
}
