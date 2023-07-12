package _14_Binary_Trees;

import java.util.LinkedList;
import java.util.Queue;

public class _1_All_Orders {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int val) {
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){ // ################################ PRE ORDER

            idx++;
            if(nodes[idx]== -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // ###################################################################################
        // ###################################################################################
        public static void preTraversal(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preTraversal(root.left);
            preTraversal(root.right);
        }

        public static void InTraversal(Node root){
            if(root == null){
                return;
            }
            InTraversal(root.left);
            System.out.print(root.data + " ");
            InTraversal(root.right);
        }
        public static void postTraversal(Node root){
            if(root == null){
                return;
            }
            postTraversal(root.left);
            postTraversal(root.right);
            System.out.print(root.data + " ");
        }

        // ###################################################################################
        // ###################################################################################

        public static void LevelOrder(Node root){  // To print a level order traversal
            if(root == null){
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);  // Just to print a new line each time a null is peeked in the Queue

            while (!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){    // to print new line
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else {
                        q.add(null);     // again add null to print new line after the next level
                    }
                }else {              // if the node in the queue is not-null and has some value
                    System.out.print("      "+currNode.data + " ");
                    if(currNode.left != null){
                        q.add(currNode.left);    // and left child of the currNode
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }
        // ###################################################################################
        // ###################################################################################

        public static int height(Node root){
            if(root == null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh, rh) + 1;

//            if(height(root.left) > height(root.right)){
//                height += height(root.left)
//            }else {
//                height += height(root.right);
//            }
        }

        // ###################################################################################
        // ###################################################################################

        public static int noOfNodes(Node root){
            if(root == null){
                return 0;
            }
            int lCount = noOfNodes(root.left);
            int rCount = noOfNodes(root.right);
            return lCount+rCount + 1;
        }

        // ###################################################################################
        // ###################################################################################

        public static int sumOfNodes(Node root){
            if(root == null){
                return 0;
            }
            int lSum = sumOfNodes(root.right);
            int rSum = sumOfNodes(root.left);

            return lSum+rSum+root.data;
        }

        public static void count(){
            System.out.println("The No. ");
        }
    }



    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        tree.preTraversal(root);
        System.out.println();
        tree.InTraversal(root);
        System.out.println();
        tree.postTraversal(root);
        System.out.println();
        tree.LevelOrder(root);
        System.out.println(tree.height(root));
        System.out.println(tree.noOfNodes(root));
        System.out.println(tree.sumOfNodes(root));
    }
}