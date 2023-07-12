package _15_B_Search_T;

import java.util.ArrayList;

public class _2_SortedArr_To_BST {

    static class Node{
        int data;
        Node right;
        Node left;

        public Node(int val){
            data = val;
            right = left = null;
        }
    }
    // #######       Sorted array to BST
    public static Node BalancedTree(int arr[], int start, int end){
        if(start > end){
            return null;
        }
        int mid = (start+end)/2 ;   // = 3 i.e. 0, 1, 2, 3 i.e. 4th element
        Node root = new Node(arr[mid]); // We set mid-node as the root node so as to get a Balanced subtree.

        root.left = BalancedTree(arr, start, mid-1);  //
        root.right = BalancedTree(arr, mid+1, end);
        return root;
    }

    // BST to balanced tree

    public static void BstInorder(Node root, ArrayList<Integer> al){
        if(root == null){
            return;
        }
        BstInorder(root.left, al);
        al.add(root.data);
        BstInorder(root.right, al);
    }
    public static Node sortedToBst(ArrayList<Integer> al, int start, int end){
        if(start > end){
            return null;
        }
        int mid = (start+end)/2 ;   // = 3 i.e. 0, 1, 2, 3 i.e. 4th element
        Node root = new Node(al.get(mid)); // We set mid-node as the root node so as to get a Balanced subtree.

        root.left = sortedToBst(al, start, mid-1);  //
        root.right = sortedToBst(al, mid+1, end);
        return root;
    }
    public static Node bstToBalanced(Node root){  // Return type is Node just to print it later in the Main Func
        // 1st To find inorder sequence
        ArrayList<Integer> al = new ArrayList<>();
        BstInorder(root, al);

        // sorted array -> bst
        Node newRoot = sortedToBst(al, 0, al.size()-1);
        return newRoot;
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
                          8
                        /   \
                       6     10
                      /        \
                     5         11
                    /            \
                   3              12
        given BST
                    */
        Node root = new Node (8);
        root. left = new Node (6);
        root. left. left = new Node (5);
        root. left. left. left = new Node (3);
        root. right = new Node (10);
        root. right. right = new Node (11);
        root. right. right. right = new Node(12);


        // ##########     Sorted to BST
//        int arr[] = {3, 5, 6, 8, 10, 11, 12};
//        Node root = BalancedTree(arr, 0, arr.length-1);
//        preOrder(root);

        root = bstToBalanced(root);
        preOrder(root);
    }
}
