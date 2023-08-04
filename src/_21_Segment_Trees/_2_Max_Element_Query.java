package _21_Segment_Trees;

public class _2_Max_Element_Query {

    static int[] tree;
    public static void init(int n){
        tree = new int[4*n];
    }
    public static void buildST(int[] arr, int i, int start, int end){
        if (start == end){
            tree[i] = arr[start];     // OR (= arr[end]) as the array has only one element.
            return;
        }
        int mid = (start+end)/2;
        buildST(arr, 2*i+1, start, mid);
        buildST(arr, 2*i+2, mid+1, end);
        tree[i] = Math.max(tree[2*i+1], tree[2*i+2]);    // We are making a tree of maximum value
    }

    // Find Maximum Element
    public static int maxElemUtil(int i, int qi, int qj, int si, int sj){
        if(si > qj || sj < qi){
            return 0;
        }
        else if (si>=qi && sj<=qj){
            return tree[i];         // This means returning parent of si-sj
        }
        else {
            int mid = (si+sj)/2;
            int left = maxElemUtil(2*i+1, qi, qj, si, mid);
            int right = maxElemUtil(2*i+2, qi, qj, mid+1, sj);
            return Math.max(left, right);
        }
    }
    public static int maxElem(int[] arr, int qi, int qj){
        int n = arr.length;
        return maxElemUtil(0, qi, qj, 0, n-1);
    }

    // UPDATING
    public static void updateStUtil(int i, int idx, int nVal, int si, int sj){
        if (idx < si || idx > sj){
            return;
        }
        tree[i] = Math.max(tree[i], nVal);     // Subtract the difference from the topmost element as it is sum of all the elements in the arr.
        if (si != sj){
            int mid = (si+sj)/2;
            updateStUtil(2*i+1, idx, nVal, si, mid);
            updateStUtil(2*i+1, idx, nVal, mid+1, sj);
        }
    }
    public static void updateSt(int[] arr, int idx, int nVal){
        int n= arr.length;
        arr[idx] = nVal;
        updateStUtil(0, idx, nVal, 0, n-1);
    }


    public static void main(String[] args) {

        int[] arr = {6, 8, -1, 2, 17, 1, 3, 2, 4};
        int n = arr.length;
        init(n);
        buildST(arr, 0, 0, n-1);
        for (int i=0; i<tree.length; i++){
            System.out.print(tree[i] + " ");
        }
        System.out.println();
        System.out.println(maxElem(arr, 2, 5));

        updateSt(arr, 2, 19);
        for (int i=0; i<tree.length; i++){
            System.out.print(tree[i] + " ");
        }

    }
}
