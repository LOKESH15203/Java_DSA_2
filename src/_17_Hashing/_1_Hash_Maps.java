package _17_Hashing;
import java.util.*;
public class _1_Hash_Maps {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert
        hm.put("Pune", 140);
        hm.put("Mumbai", 300);
        hm.put("Banglore", 230);
        System.out.println(hm);

        // Retrieve
        int popu = hm.get("Pune");
        System.out.println(popu);

        // Contains Yes/No
        System.out.println(hm.containsKey("Mumbai"));

        // Deleting
        System.out.println(hm.remove("Banglore"));
        System.out.println(hm);

        // size
        System.out.println(hm.size());

        // isEmpty
        System.out.println(hm.isEmpty());

        // CLEAR - to delete entire hash map
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
