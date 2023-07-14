package _19_Graphs;

import java.util.ArrayList;

public class _3_Cycle_In_UnDirected_Graph {

    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        // This is an un-weighted graph, but we take weight = 1; for standardization
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    public static boolean hasCycle(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean [graph.length];
        for (int i=0; i<graph.length; i++){
            if(!vis[i]){
                if (hasCycleUtil(graph, i, -1, vis)) {  // starting node doesn't have a parent so paced -1.
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasCycleUtil(ArrayList<Edge>[] graph, int curr, int par, boolean[] vis){

        vis[curr] = true;

        for (int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
//            Case 3
            if(!vis[e.dest]){// Neighbour was not visited -> visit and then check if cycle exists
                if(hasCycleUtil(graph, e.dest, curr, vis)){
                return true;
                }
            }
//            Case 1
            else if(vis[e.dest] && e.dest != par) {
                return true;
            }
//            Case 2 -> Do nothing -> Continue
        }
        return false;
    }

    public static void main(String[] args) {
        int V= 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        System.out.println(hasCycle(graph));
    }
}
