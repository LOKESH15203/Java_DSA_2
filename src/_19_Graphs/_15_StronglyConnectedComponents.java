package _19_Graphs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class _15_StronglyConnectedComponents {

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

        // 0 -vertex
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        // 1 -vertex
        graph[1].add(new Edge(1, 0));

        // 2 - vertex
        graph[2].add(new Edge(2, 1));

        // 3 -vertex
        graph[3].add(new Edge(3, 4));

    }

    public static void topSort(ArrayList<Edge>[] graph, int curr, Stack<Integer> s, boolean[] vis){

        vis[curr] = true;

        for (int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                topSort(graph, e.dest, s, vis);
            }
        }
        s.push(curr);
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] vis){
        vis[curr] = true;
        System.out.print(curr+ " ");

        for (int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void kosaraju(ArrayList<Edge>[] graph, int V){  //     O(V+E)
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[V];

        // step 1 - Sorting Topological
        for (int i=0; i<V; i++){
            if(!vis[i]){
                topSort(graph, i, s, vis);
            }
        }

//        Step 2 - Make TRANSPOSE graph
        ArrayList<Edge>[] transpose = new ArrayList[V];
        for(int i=0; i<graph.length; i++){
            vis[i] = false;
            transpose[i] = new ArrayList<Edge>();      // Initializing each Node of array into an independent arrayList - Done in all createGraph functions.
        }
        for (int i=0; i<V; i++){
            for (int j=0; j<graph[i].size(); j++){
                Edge e = graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest, e.src)); //////////// Reversing the edge ////////////////////
            }
        }

//        step 3
        while (!s.isEmpty()){
            int curr = s.pop();
            if(!vis[curr]){
                System.out.print(" SCC -> ");
                dfs(transpose, curr, vis);  // scc
                System.out.println();
            }
        }
     }


    public static void main(String[] args) {
        int V = 5;

        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        kosaraju(graph, V);
    }
}
