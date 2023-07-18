package _19_Graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class _9_Prims_Algorithm {

    static class Edge{
        int src;
        int dest;
        int wei;
        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wei = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    static class Ver implements Comparable<Ver>{
        int v;
        int cost;
        public Ver(int v, int c){
            this.v = v;
            this.cost = c;
        }

        @Override
        public int compareTo(Ver v2){
            return this.cost - v2.cost;   // Ascending
        }
    }

    public static void primsMST(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        PriorityQueue<Ver> pq = new PriorityQueue<>();
        pq.add(new Ver(0, 0));
        int finalCost = 0;

        while (!pq.isEmpty()){
            Ver curr = pq.remove();
            if(!vis[curr.v]) {
                vis[curr.v] = true;
                finalCost += curr.cost;
                // Neighbours
                for (int i = 0; i < graph[curr.v].size(); i++) {
                    Edge e = graph[curr.v].get(i);
                    pq.add(new Ver(e.dest, e.wei));
                }
            }
        }
        System.out.println("The minimum cost of this spanning tree is : " + finalCost);
    }

    public static void main(String[] args) {

        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        primsMST(graph);
    }
}
