package _14_Binary_Trees;

import java.util.ArrayList;
import java.util.LinkedList;

public class _8_Sum_Tree {

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

    public static int sumTree(Node root){
        ArrayList<Integer> al = new ArrayList<>();
        if(root == null){
            return 0;
        }

        int lSubSum = sumTree(root.left);
        int rSubSum = sumTree(root.right);
        int data = root.data;

        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;

        root.data = lSubSum + newLeft + rSubSum + newRight;

        return data;

    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
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

        System.out.println(sumTree(root));
        preOrder(root);
    }
}
