package _10_Linked_List;

import java.lang.Math;


public class _5_MultiplyLL {

    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    public static void multiply(Node l1, Node l2){
        if (l1 == null || l2 == null) {
            return;
        }
        int n1 = 0;
        int count = 0;
        Node curr1 = l1;
        while (curr1 != null){
            n1 += head.data*Math.pow(10,count);
        }
    }

    public static void main(String[] args) {

    }
}
