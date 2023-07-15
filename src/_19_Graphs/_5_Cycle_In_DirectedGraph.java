package _19_Graphs;

import java.util.ArrayList;
import java.util.Stack;

public class _5_Cycle_In_DirectedGraph {

    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

//    public static void createGraph(ArrayList<Edge>[] graph){
//        for (int i=0; i<graph.length; i++){
//            graph[i] = new ArrayList<>();
//        }
//
//        graph[0].add(new Edge(0, 2));
//
//        graph[1].add(new Edge(1, 0));
//
//        graph[2].add(new Edge(2, 3));
//
//        graph[3].add(new Edge(3, 0));
//    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));

        graph[1].add(new Edge(0, 2));

        graph[2].add(new Edge(1, 3));

        graph[3].add(new Edge(2, 3));
    }

    public static boolean isCycle(ArrayList<Edge>[] graph){
        boolean stack[]= new boolean[graph.length];
        boolean[] vis = new boolean[graph.length];

        for (int i=0; i<graph.length; i++){
            if(!vis[i]){
                if(isCycleUtil(graph, i, vis, stack)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis, boolean[] st){
        vis[curr] = true;
        st[curr] = true;

        for (int i=0; i< graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(st[e.dest]){
                return true;
            }
            else if(!vis[e.dest] && isCycleUtil(graph, e.dest, vis, st)){
                return true;
            }
        }
        st[curr] = false;
        return false;
    }

    public static void main(String[] args) {

        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        System.out.println(isCycle(graph));
    }
}