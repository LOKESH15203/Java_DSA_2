package _14_Binary_Trees;
import java.util.*;

public class _6_LCA_Min_Distance {

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

    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.data == n) {
            return true;
        }
        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);
        if (foundLeft || foundRight) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2) { // TC = O(n) && SC = O(n) both Linear
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getPath(root, n1, path1);
        getPath(root, n2, path2); //last common ancestor
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        //last equal node -> i-1th
        Node lca = path1.get(i-1);
        return lca;
    }

    // ##########          PREFER THIS SOLUTION         ############
    public static Node lca2(Node root, int n1, int n2){ // TC = O(n) && SC = O(1)

        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node leftLCA = lca2(root.left, n1, n2);  // This receives values from all the conditions below
        Node rightLCA = lca2(root.right, n1, n2);

        if(leftLCA == null){
            return rightLCA;
        }
        if(rightLCA == null){
            return leftLCA;
        }

        return root;  // if Both left and right are null
    }

    // #################################################################################################

    public static int lcaDist (Node root, int n) {
        if(root == null) {
            return -1;
        }
        if(root.data == n) {
            return 0;
        }
        int leftDist = lcaDist (root.left, n);
        int rightDist = lcaDist (root.right, n);
        if(leftDist == -1 && rightDist == -1) {
            return -1;
        } else if(leftDist == -1) {
            return rightDist+1;
        } else {
            return leftDist+1;
        }
    }
    public static int minDist (Node root, int n1, int n2) {
        Node lca = lca2(root, n1, n2);
        int dist1=lcaDist (lca, n1);
        int dist2 = lcaDist(lca, n2);
        return dist1 + dist2;
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

        System.out.println(lca(root, 4, 6).data);
        System.out.println(lca2(root, 4, 5).data);
        System.out.println(minDist(root, 4, 6))

        ;
    }
}
