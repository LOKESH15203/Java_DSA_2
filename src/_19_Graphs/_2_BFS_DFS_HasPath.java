package _19_Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _2_BFS_DFS_HasPath {

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

        // This is an un-weighted graph, but we take weight = 1; for standardization
        graph[0].add(new Edge (0, 1, 1));
        graph[0].add(new Edge (0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));
    }

    public static void BFS(ArrayList<Edge>[] graph){  // O(V+E) i.e. Vertexes+Edges
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[graph.length];
        q.add(0);                 // source = 0; or Root in Level Oder Traversal

        while(!q.isEmpty()){
            int curr = q.remove();

            if(!vis[curr]){    // if curr is not visited -> visit it now
                System.out.print(curr + " ");
                vis[curr] = true;       // Now visited
                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void DFS(ArrayList<Edge>[] graph, int curr, boolean[] vis){
        // visit
        System.out.print(curr + " ");  // Visit the current Node i.e. 0 in this case and print it.
        vis[curr] = true;

        for (int i=0; i<graph[curr].size(); i++){     // This returns the size of arrayList in the array
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                DFS(graph, e.dest, vis);       // calls DFS for the next neighbour / First Destination
            }
        }
    }

    // O(V+E)
    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] vis){
        if(src== dest){
            return true;
        }
        vis[src] = true;
        for (int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        System.out.println("BFS");
        BFS(graph);
        System.out.println("\n");

        boolean[] vis = new boolean[graph.length];
        System.out.println("DFS");
        DFS(graph, 0, vis);
        System.out.println();

        boolean[] vis1 = new boolean[graph.length];
        System.out.println(hasPath(graph, 0, 5, vis1));
    }
}
