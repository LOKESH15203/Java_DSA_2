package _19_Graphs;

import java.util.ArrayList;
import java.util.Stack;

public class _6_TopologicalSorting {

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

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    // Topological Sort       ---        O(V+E)

    public static void TSort(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> st = new Stack<>();

        for (int i=0; i<graph.length; i++){
            if(!vis[i]){
                TSortUtil(graph, i, vis, st);  ///
            }
        }
        while (!st.isEmpty()) {                // Empty the stack filled in below function for Topologically sorted sequence.
            System.out.print(st.peek() + " ");
            st.pop();
        }
    }

    public static void TSortUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis, Stack<Integer> st){

        vis[curr] = true;   // Mark them as visited and

        for (int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(!vis[e.dest]){
                TSortUtil(graph, e.dest, vis, st);
            }
        }
        st.push(curr);      // Add them to the stack
    }

    public static void main(String[] args) {

        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        TSort(graph);
    }
}
