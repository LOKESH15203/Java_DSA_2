package _21_Segment_Trees;

public class _1_Construction {

    static int[] tree;

    public static void init(int n){
        tree = new int[n*4];
    }

    // Building Segment tree - O(n) -> This seems like a lot of time but this helps reduce the time of updating and running queries.
    public static int buildSt(int[] arr, int i, int start, int end){ // here we need "i" to exactly know where we want to store the value in the TREE array

        if (start == end){           // When the construction array has only one element.
            tree[i] = arr[start];
            return arr[start];
        }

        int mid = (start + end)/2;
        buildSt(arr, 2*i+1, start, mid);        // left of root is 2i+1 = index at which the value of root is stored.
        buildSt(arr, 2*i+2, mid+1, end);  // Right of root is 2i+2
        tree[i] = tree[2*i+1] + tree[2*i+2];
        return tree[i];
    }

    // Queries
    // GET SUM
    public static int getSumUtil(int i, int si, int sj, int qi, int qj){
        if(qj <= si || qi >= sj){       // si-sj is outside qi-qj        // Not overlapping
            return 0;
        }
        else if(si >= qi && sj <= qj){  // si-sj is totally inside qi-qj // Completely Overlapping
            return tree[i];             // tree[i] = sum of all the elements in the range si-sj. As si-sj is completely under the required range.
        }
        else {                          // Not Overlapping
            int mid = (si+sj)/2;
            int left = getSumUtil(2*i+1, si, mid, qi, qj);
            int right = getSumUtil(2*i+2, mid+1, sj, qi, qj);
            return left+right;
        }
    }
    public static int getSum(int arr[], int qi, int qj){
        int n = arr.length;
        return getSumUtil(0, 0, n-1, qi, qj);
    }

//    UPDATE Operations - O(log n)
    public static void updateStUtil(int i, int si, int sj, int idx, int diff){

        if(idx < si || idx > sj){
            return;
        }
        tree[i] += diff; // Here tree[i] = sum of elements that include the No. just updated. // We are subtracting the difference from The sum of elements that include the updated No.
        if (si != sj){    // if not a leaf node i.e. if the current node is a parent. To traverse the entire tree and update the value til the leaf elements.
            int mid = (si+sj)/2;
            updateStUtil(2*i+1, si, mid, idx, diff);
            updateStUtil(2*i+2, mid+1, sj, idx, diff);
        }
    }
    public static void updateSt(int[] arr, int nVal, int idx){
        int n = arr.length;
        int diff = nVal - arr[idx];
        arr[idx] = nVal;
        updateStUtil(0, 0, n-1, idx, diff);  // Here starting form i=0 means starting from the root node of the Segment tree.
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        init(n);
        buildSt(arr, 0, 0, 7);

        for (int i=0; i<tree.length; i++){
            System.out.print(tree[i] + " ");
        }

//        System.out.println();
//        System.out.println(getSum(arr, 2, 5));

        System.out.println();
        updateSt(arr, 2, 2);
        for (int i=0; i<tree.length; i++){
            System.out.print(tree[i] + " ");
        }
    }
}
