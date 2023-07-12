package _14_Binary_Trees;

public class _2_Max_Diameter {

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

    // ####################################### In-efficient approach just for understanding
    public static int height(Node root) {  //   TC = O(n)
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }
        public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int leftDia = diameter(root.left);
        int rightDia = diameter(root.right);
        int leftHigh = height(root.left);
        int rightHigh = height(root.right);

        int rootDia =  leftHigh+rightHigh+1;  // Imagine a diameter of a root node

        return Math.max(rootDia, Math.max(leftDia, rightDia));
    }

    // ####################################### Efficient Approach
    static class Info{
        int dia;
        int high;

        public Info(int dia, int high){
            this.dia = dia;
            this.high = high;
        }
    }

    public static Info maxDia(Node root){ //          TC = O(n)
        if(root == null){
            return new Info(0, 0);
        }

        Info lInfo = maxDia(root.left);
        Info rInfo = maxDia(root.right);

        int dia = Math.max(lInfo.high + rInfo.high +1, Math.max(lInfo.dia, rInfo.dia));
        int high = Math.max(lInfo.high, rInfo.high) + 1;  // This helps in incrementing the values

        return new Info(dia, high);
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

//        System.out.println(diameter(root));
        System.out.println(maxDia(root).dia);          // maxDia(root) returns Object so ".dia" for data
        System.out.println(maxDia(root).high);
    }
}
