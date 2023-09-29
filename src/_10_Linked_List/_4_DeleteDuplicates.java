package _10_Linked_List;

import java.util.HashSet;
import java.util.LinkedList;

public class _4_DeleteDuplicates {

    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node head;

    public static void duplicates(Node head){
        if (head == null || head.next == null){
            return;
        }
        Node curr = head;
        Node prev = null;
        HashSet<Node> vis = new HashSet<>();
        while (curr != null){
            if(vis.contains(curr)){
                prev.next = curr.next;
            }
            vis.add(curr);
            prev = curr;
        }
        System.out.println(vis);
    }

    public static void main(String[] args) {

//        LinkedList list = new LinkedList();
//        list.addLast(12);
//        list.addLast(11);
//        list.addLast(12);
//        list.addLast(21);
//        list.addLast(41);
//        list.addLast(43);
//        list.addLast(21);

//        java.util.LinkedList<Integer> ill = new LinkedList<>();
//        Node head = new Node(1);
//        Node second = new Node(2);
//        Node third = new Node(3);
//        Node fourth = new Node(4);
//        Node fifth = new Node(5);

        LinkedList<Integer> list = new LinkedList();
        Node head = new Node(10);
        head.next = new Node(12);
        head.next.next = new Node(11);
        head.next.next.next = new Node(11);
        head.next.next.next.next = new Node(12);
        head.next.next.next.next.next = new Node(11);
        head.next.next.next.next.next.next = new Node(10);

        duplicates(head);

        while (head != null){
            System.out.println(head.data);
        }
    }
}
