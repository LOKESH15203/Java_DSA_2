package _17_Hashing;

import java.util.HashSet;
import java.util.Iterator;

public interface _7_Iteration_HashSet {

    public static void main(String[] args) {

        HashSet<String> cities = new HashSet<>();
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Noida");
        cities.add("Bengaluru");

//        Iterator it = cities.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

        for(String city : cities){       //   ####################           Just like writing city from cities
            System.out.println(city);
        }
    }
}
