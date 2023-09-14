package _10_Linked_List;

import java.util.HashSet;
import java.util.LinkedList;

public class _3_Cycle_in_LL {

    static class Node{
        int data;
        Node next;
        public Node(int val){
            this.data = val;
            this.next = null;
        }
    }

    public static boolean hasCycleSet(Node head) {
        // int fastPointer = head;
        HashSet<Node> Visited = new HashSet<>();
        Node curr = head;
        while(curr!= null){
            if (Visited.contains(curr)){
                return true;
            }
            Visited.add(curr);
            curr = curr.next;
        }
        return false;
    }

    public static boolean hasCyclePointer(Node head){
        Node fPointer = head;
        Node sPointer = head;

        while(fPointer != null && sPointer != null){
            sPointer = sPointer.next;
            fPointer = fPointer.next.next;
            if(sPointer == fPointer){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        java.util.LinkedList<Integer> ill = new LinkedList<>();
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        // Build the linked list: 1 -> 2 -> 3 -> 4 -> 5
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Create a cycle: 5 -> 2
        fifth.next = second;

        // Now, the linked list has a cycle

        System.out.println(hasCyclePointer(head));

    }
}
