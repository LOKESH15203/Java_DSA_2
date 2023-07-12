package _10_Linked_List;

public class Doubly_LL {

    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int val){
            data = val;
            next = null;
            prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int val){

        Node node = new Node(val);
        size++;
        if(head == null){
            head = tail = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;

    }

    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    //###############################################################################################

    public void removeLast(){
        if(head== null){
            System.out.println("LL is empty");
            size--;
            return;
        }
        if(head==tail){
            head = tail = null;
            size--;
            return;
        }
        Node temp = head;
        // FInd the node preceding the last node.
        for(int i=0; i<size -2; i++){
            temp = temp.next;
        }
        // Removing the last node
        temp.next = null;
        tail = temp;
        size--;
    }

    //###############################################################################################
    public void reverceDll(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //###############################################################################################
    //###############################################################################################
    //###############################################################################################
    public static void main(String[] args) {

        Doubly_LL dll = new Doubly_LL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        System.out.println(size);
//        dll.removeLast();
//        dll.print();
        dll.reverceDll();
        dll.print();

    }

}
