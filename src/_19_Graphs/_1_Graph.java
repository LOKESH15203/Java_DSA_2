package _19_Graphs;

import java.util.ArrayList;

public class _1_Graph {

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

    public static void main(String[] args) {

        int V = 5;              // No. of Nodes in the graph

        ArrayList<Edge>[] graph = new ArrayList[V];     // This array stores Arraylist values.
// Similar ->       int[]   arr = new int[];            // This arr stores Integer values

        // For now the Array has Null values -> we need to make it an empty array
        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        // 0 -vertex
        graph[0].add(new Edge(0, 1, 5));

        // 1 -vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // 2 - vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // 3 -vertex
        graph[3].add(new Edge(3, 2, 1));
        graph[3].add(new Edge(3, 1, 3));

        // 4 -vertex
        graph[4].add(new Edge(4, 2, 2));


        //2s Neighbours i.e. 1, 3, 4
        for (int i=0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);     // This "e" will contain source, destination, weight.
            System.out.print(e.dest+ " ");   // The destinations of 2 will be its neighbours.
        }
    }
}
