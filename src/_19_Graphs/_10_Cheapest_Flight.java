package _19_Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _10_Cheapest_Flight {
//  Cheapest flights with maximum k stops

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

    public static void createGraph(int flights[][], ArrayList<Edge>[] graph){
        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        for (int i=0; i<graph.length; i++){
            int from = flights[i][0];
            int to = flights[i][1];
            int cost = flights[i][2];

            Edge e = new Edge(from, to, cost);     //
            graph[from].add(e);                    // adding a flight with same source(from) to the group.
        }
    }

    static class Info{
        int v;
        int cost;
        int stops;
        public Info(int v, int c, int s){
            this.v = v;
            this.cost = c;
            this.stops = s;
        }
    }

    public static int cheapestFlight(int n,int flights[][], int from, int to, int k){
        int dist[] = new int[n];
        ArrayList<Edge>[] graph = new ArrayList[n];   // Making tree here.
        createGraph(flights, graph);

        for(int i=0; i<n; i++){    // Initializing all distances to be INFINITY (except the source)
            if(i != from){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(from, 0, 0));    // Adding source to the Queue
        // BFS loop
        while (!q.isEmpty()){
            Info curr = q.remove();
            if(curr.stops > k){
                break;
            }

            for(int i=0; i<graph[curr.v].size(); i++){
                Edge e = graph[curr.v].get(i);
                int u = e.src;
                int v = e.dest;
                int wt = e.wei;

//                if(dist[u] != Integer.MAX_VALUE && dist[u]+wt<dist[v] && curr.stops <= k){  // 1. If we add anything in Infinity in java the result is a negative value.
//                    dist[v] = dist[u]+wt;
                if(curr.cost+wt<dist[v] && curr.stops <= k){  // Above condition provides the same answer - but this takes care of one more corner case
                    dist[v] = curr.cost+wt;
                    q.add(new Info(v, dist[v], curr.stops+1));
                }
            }
        }
        if(dist[to] == Integer.MAX_VALUE){    // Couldn't reach/find destination;
            return -1;
        }
        else
            return dist[to];
    }

    public static void main(String[] args) {

        int n = 4;
        int from = 0;
        int to = 3;
        int k = 1;
        int flights[][] = {{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};

        System.out.println(cheapestFlight(n, flights, from, to, k));
    }
}
