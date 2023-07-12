package _14_Binary_Trees;

public class _7_Kth_Ancestor {

    static class Node {
        int data;
        Node right;
        Node left;

        public Node(int val) {
            this.data = val;
            this.right = null;
            this.left = null;
        }
    }

    public static int KAncestor(Node root, int n, int k){
        if(root == null){
            return -1;
        }
        if (root.data == n){ // if node found. Then 0 is returned and then 1 is added to it when reaching each ancestor
            return 0;
        }

        int lDist = KAncestor(root.left, n, k); // returns 0 if the Node found else -1;
        int rDist = KAncestor(root.right, n, k);

        if(lDist == -1 && rDist == -1){
            return -1;
        }

        int max = Math.max(lDist, rDist); // If not found in left and found in right then left returns -1 and right returns 0
                                          // 0 > -1 so 0 is returned to 2 in this case
        if(max+1 == k){                   // Now 1 is returned to 1 by 2 because of this step
            System.out.println(root.data);
        }
        return max+1;
    }

    public static void main(String[] args) {

        /*
                      1
                    /   \
                  2      3
                /  \   /  \
              4    5  6    7
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(KAncestor(root, 5, 2));
    }
}
