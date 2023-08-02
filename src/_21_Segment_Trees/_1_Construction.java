package _21_Segment_Trees;

public class _1_Construction {

    static int[] tree;

    public static void init(int n){
        tree = new int[n*4];
    }

    // Building Segment tree - O(n) -> This seems like a lot of time but this helps reduce the time of updating and running queries.
    public static int buildSt(int[] arr, int i, int start, int end){ // here we need "i" to exactly know where we want to store the value in the TREE array

        if (start == end){
            tree[i] = arr[start];
            return arr[start];
        }

        int mid = (start + end)/2;
        buildSt(arr, 2*i+1, start, mid);        // left of root is 2i+1
        buildSt(arr, 2*i+2, mid+1, end);  // Right of root is 2i+2
        tree[i] = tree[2*i+1] + tree[2*i+2];
        return tree[i];
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        init(n);
        buildSt(arr, 0, 0, 7);

        for (int i=0; i<tree.length; i++){
            System.out.print(tree[i] + " ");
        }
    }
}
