package _10_Linked_List;

import java.util.LinkedList;

public class _1_Basics {

    public class LinkedList{

        public static class Node{
            int data;
            Node next;

            public Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        public static Node head;
        public static Node tail;

        public void addFirst(int data){

            Node node = new Node(data);

            if(head == null){
                head = tail = node;
            }

            node.next = head;

            head = node;
        }

        public void addLast(int data){
            Node node = new Node(data);

            if(head == null){
                head = tail = node;
            }

            tail.next = node;

            tail = node ;
        }

        public void printll(){
            if(head == null){
                System.out.println("LL is Empty");
                return;
            }
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
    }

        public void main(String[] args) {
            LinkedList ll = new LinkedList();

            ll.addFirst(4);
            ll.addFirst(9);
            ll.addLast(5);
            ll.addLast(6);
            ll.addLast(8);

            ll.printll();
        }
    }
}
