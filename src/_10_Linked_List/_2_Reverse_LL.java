package _10_Linked_List;

public class _2_Reverse_LL {

    class Node{
        int data;
        Node next;
        public Node(int val){
            this.data = val;
            this.next = null;
        }
    }

    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {

    }
}
