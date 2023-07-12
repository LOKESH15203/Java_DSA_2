package _14_Binary_Trees;
import java.util.*;
public class _4_Top_View {

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

    static class Info{
        Node node;
        int hd;     // Horizontal distance for which node can be seen from top. If same distance the second node can't be seen

        public Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topView(Node root){
        HashMap<Integer, Node> map = new HashMap<>();
        Queue<Info> q = new LinkedList<>();

        if(root==null){
            return;
        }
        int min=0, max=0;
        q.add(new Info(root, 0));
        q.add(null);

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else {
                if(!map.containsKey(curr.hd)){    // The node with this HD must be added onl once
                    map.put(curr.hd, curr.node);
                }
                if(curr.node.left != null){
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min = Math.min(min, curr.hd-1);
                }
                if(curr.node.right != null){
                    q.add(new Info(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);
                }
            }
        }
        for(int i=min; i<=max;i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
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

        topView(root);
    }
}
