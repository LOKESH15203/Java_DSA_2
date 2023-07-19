package _19_Graphs;

public class _12_Disjoint_Sets {
    static int n = 7;
    static int par[] = new int[n];
    static int rank[] = new int[n];

    public static void init(){
        for (int i=0; i<n; i++){
            par[i] = i;
        }
    }

    public static int find(int x){
        if(par[x] == x){
            return x;
        }
        return find(par[x]);
    }

    public static void union(int a, int b){
        int parA = find(a);       // as find returns the parents of the elements
        int parB = find(b);

        if(rank[parA] == rank[parB]){
            par[parB] = parA;
            rank[parA]++;
        }else if (rank[parA] < rank[parB]){
            par[parA] = parB;      // make "b" parent of "a";
        }else {
            par[parB] = parA;      // make "a" parent of "b";
        }
    }

    public static void main(String[] args) {
        init();
        System.out.println(find(3));
        union(1, 3);
        System.out.println(find(3));
        union(2, 4);
        union(3, 6);
        union(1, 4);
        System.out.println(find(3));
        System.out.println(find(4));
        union(1, 5);
    }
}
