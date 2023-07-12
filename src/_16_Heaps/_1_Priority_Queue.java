package _16_Heaps;
import java.util.*;
import java.util.concurrent.ConcurrentNavigableMap;

public class _1_Priority_Queue {

    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        public int compareTo(Student s2){
            return this.rank - s2.rank; // Returns negative if this.rank < s2.rank
        }
    }

    public static void main(String[] args) {

//        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());  // this prints in descending order
        PriorityQueue<Student> pq = new PriorityQueue<>(); // this prints in ascending order
        pq.add(new Student("Savita",10));
        pq.add(new Student("Pradeep",11));
        pq.add(new Student("Lokesh",1));
        pq.add(new Student("Gadha",50));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + " -> "+ pq.peek().rank);
            pq.remove();

        }
    }
}
