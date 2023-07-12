package _14_Binary_Trees;

import java.util.LinkedList;
import java.util.Queue;

public class _5_K_Level_Elements {

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

    public static void K_th_Elem(int n, Node root) {  // O(n) Trying to print by Level order Traversal
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        int count = 1;
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                    count++;
                }
            } else {
                if (count == n) {
                    System.out.print(currNode.data + " ");
                }
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }

    }

    public static void kLevel(Node root, int level, int k){  //  O(n) Recursive Approach
        if(root==null){
            return;
        }
        if(level == k){
            System.out.print(root.data + " ");
            return;
        }
        kLevel(root.left, level+1, k);
        kLevel(root.right, level+1, k);
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

        K_th_Elem(3, root);  // Successful
        kLevel(root, 1, 3);
    }
}