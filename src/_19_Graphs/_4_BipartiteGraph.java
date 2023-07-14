package _19_Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _4_BipartiteGraph {

    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph){
        int col[] = new int[graph.length];         // Array to maintain color
        for (int i=0; i<col.length; i++){
            col[i] = -1; // no color              // No color in any of the array blocks
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<graph.length; i++){
            if(col[i] == -1){    // B F S starts from here
                q.add(i);
                col[i] = 0; // yellow

                while (!q.isEmpty()){
                    int curr = q.remove();
                    for(int j=0; j<graph[curr].size(); j++){           // outer for loop is of "i" sp use "j" here.
                        Edge e = graph[curr].get(j);
                        if (col[e.dest] == -1){                          // if curr color is yellow give neighbour e.dest = 1 or else give 0;
                            int nextCol = col[curr] == 0 ? 1 : 0;        // Ternary operator
                            col[e.dest] = nextCol;                       // To store color in array created
                            q.add(e.dest);
                        }else if(col[e.dest] == col[curr]){  // If neighbours have same color Not a Bipartite graph
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void createGraph(ArrayList<Edge>[] graph){

        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        // 0 -vertex
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        // 1 -vertex
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        // 2 - vertex
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        // 3 -vertex
        graph[3].add(new Edge(3, 1));
//        graph[3].add(new Edge(3, 4));

        // 4 -vertex
        graph[4].add(new Edge(4, 2));
//        graph[4].add(new Edge(4, 3));
    }

    public static void main(String[] args) {
     // If graph doest have cycles -->> it is by default a Bipartite Graph
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        System.out.println(isBipartite(graph));
     }
}
