package _14_Binary_Trees;
import java.util.*;

public class _3_SubTree_of_Tree {

    static class Node{
        int data;
        Node right;
        Node left;

        public Node(int val) {
            data = val;
            right = null;
            left = null;
        }
    }


//        static int idx = -1;
//        public static Node buildTree(int nodes[]){
//            idx++;
//            if(nodes[idx] == -1){
//                return null;
//            }
//            Node newNode = new Node(nodes[idx]);      // 2, 4, -1, -1, 5, -1, -1
//            newNode.left = buildTree(nodes);
//            newNode.right = buildTree(nodes);
//
//            return newNode;
//        }


        public static boolean isIdentical(Node node, Node subRoot){

            if(node == null && subRoot == null){
                return true;
            }else if(node.data != subRoot.data || node == null || subRoot == null){
                return false;
            }

            if(!isIdentical(node.left, subRoot.left)){
                return false;
            }
            if(!isIdentical(node.right, subRoot.right)){
                return false;
            }

            return true;   // ELSE
        }

        public static boolean isSubtree(Node root, Node subRoot){

            if(root == null){
                return false;
            }
            if(root.data == subRoot.data){
                if(isIdentical(root, subRoot)){
                    return true;
                }
            }

            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }


    public static void main(String[] args) {

//        int nodes1[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};   // Pre ORDER Sequence
//        int nodes2[] = {2, 4, -1, -1, 5, -1, -1};

//        BTree tree1 = new BTree();
//        Node root1 = tree1.buildTree(nodes1);
//
//        BTree tree2 = new BTree();
//        Node subRoot = tree2.buildTree(nodes2);

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

        /*
                      2
                    /   \
                  4      8
         */
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(8);


        System.out.println(isSubtree(root, subRoot));

    }
}
