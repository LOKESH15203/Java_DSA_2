package _19_Graphs;
import java.util.*;

public class _11_Connecting_Cites {

    static class City implements Comparable<City>{
        int dest;
        int cost;
        public City(int d, int c) {
            this.dest = d;
            this.cost = c;
        }

        @Override
        public int compareTo(City c2){
            return this.cost - c2.cost; // ascending
        }
    }

    public static void connectCities(int cities[][]){
        PriorityQueue<City> pq = new PriorityQueue<>();
        boolean[] vis = new boolean[cities.length];

        pq.add(new City(0, 0));
        int finalCost = 0;

        while(!pq.isEmpty()){
            City curr = pq.remove();
            if(!vis[curr.dest]){
                vis[curr.dest] = true;
                finalCost += curr.cost;

                for (int i=0; i<cities[curr.dest].length; i++){      // this is traveling the 2d array -> cities[0] gives the destinations connected to that city 1.
                    if(cities[curr.dest][i] != 0){
                        pq.add(new City(i, cities[curr.dest][i]));
                    }
                }
            }
        }
        System.out.println("The final cost of connecting all the cities is : " + finalCost);
    }

    public static void main(String[] args) {

        int cities[][] = {{0, 1, 2, 3, 4},   // From Node(0) to these nodes the No.s written are distances i.e. 0-1->1; 0-3->3
                        {1, 0, 5, 0, 7},     // From Node(1) to other nodes                1-1 -> 5, 1-4 -> 7;
                        {2, 5, 0, 6, 0},
                        {3, 0, 6, 0, 0},
                        {4, 7, 0, 0, 0}};

        connectCities(cities);
    }
}
