package _19_Graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class _8_Dijkstras_Algorithm {

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

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    static class Pair implements Comparable<Pair>{
        int node;
        int path;
        public Pair(int n, int d){
            this.node = n;
            this.path = d;
        }
        @Override
        public int compareTo(Pair p2){
            return this.path - p2.path;
        }
    }

    public static void dijkstra(ArrayList<Edge>[] graph, int src){
        // 1.  Initialize all distances to be INFINITY except the start node
        int dist[] = new int[graph.length];
        for(int i=0; i<graph.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;   // i.e. +INFINITY
            }
        }
        boolean[] vis = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        // BFS Loop
        while(!pq.isEmpty()){
             Pair curr = pq.remove();
             if(!vis[curr.node]){
                 vis[curr.node] = true;
                 // Neighbours
                 for(int i=0; i<graph[curr.node].size(); i++){
                     Edge e = graph[curr.node].get(i);
                     int u = e.src;
                     int v = e.dest;
                     int wt = e.wei;

                     if(dist[u]+wt < dist[v]){
                         dist[v] = dist[u]+wt;
                         pq.add(new Pair(v, dist[v]));
                     }
                 }
             }
             // print all source to vertices short-est dist
            for(int i=0; i<dist.length; i++){
                System.out.print(dist[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);

        int src = 0;
        dijkstra(graph, 0);
    }
}
