package _19_Graphs;

import java.util.*;

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

    // Topological Sort       ---        O(V+E)           using DFS

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

//    Topological sorting                         using BFS

    public static void calInDeg(ArrayList<Edge>[] graph, int indeg[]){
        for(int i=0; i<graph.length; i++){
            int v = i;
            for(int j=0; j<graph[v].size(); j++){
                Edge e = graph[v].get(j);
                indeg[e.dest]++;
            }
        }
    }

    public static void topSort(ArrayList<Edge>[] graph){
        int[] indeg = new int[graph.length];
        calInDeg(graph, indeg);
        Queue<Integer> q = new LinkedList<>();

        for (int i=0; i<indeg.length; i++){     // As the inDegrees are already found,
            if(indeg[i] == 0){                  // add the elements whose inDegrees are 0
                q.add(i);
            }
        }

        while (!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr+ " ");        // Printing the Topological sort i.e. the Queue

            for(int i=0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;                 // Reduce the inDegree of the Neighbours of the curr node that is removed.
                if (indeg[e.dest] == 0){         // Then if the inDegree of the Neighbour is 0 after being reduced,
                    q.add(e.dest);                     // Add it into the queue
                }
            }
        }
    }

    public static void main(String[] args) {

        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

//        TSort(graph);
        System.out.println();
        topSort(graph);

    }
}
