package _10_Linked_List;

public class PracticeQueations {

    class Node{
        Node next;
        int data;
        public Node(int val){
            data = val;
            next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){

        Node node = new Node(data);
        size++;
        if(head == null){
            head = tail = node;
            return;
        }
        node.next = head;
        head = node;
    }
    public static void printll(PracticeQueations ll) {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static void crossNode(PracticeQueations ll1, PracticeQueations ll2){
        Node temp1 = ll1.head;
        Node temp2 = ll2.head;

        while(temp1!= null){
            temp1 = temp1.next;
            while (temp2 != null){
                temp2 = temp2.next;
                if(temp1 == temp2){
                    System.out.println("The two linkedLists meet at "+ temp1.data);
                    return;
                }
            }
        }
        System.out.println("Noice");
    }

    public void delRet(int m, int n){
        Node temp = head,t;
        if(head == null){
            System.out.println(" LL is enpty ");
        }
        while(temp != null){
            for(int i=1; i<m && temp != null; i++){
                temp = temp.next;
            }
            if(temp== null){
                return;
            }
            t = temp.next;
        for(int i=1; i<=n && t!= null; i++){
                t = t.next;
            }
            temp.next = t;
            temp = t;
        }
//        System.out.println("Hilo");
    }


    public static void main(String[] args) {

        PracticeQueations ll1 = new PracticeQueations();
        ll1.addFirst(7);
        ll1.addFirst(6);
        ll1.addFirst(5);
        ll1.addFirst(4);
//        PracticeQueations ll2 = new PracticeQueations();
        ll1.addFirst(3);
        ll1.addFirst(2);
        ll1.addFirst(1);

        printll(ll1);
        System.out.println();
//        ll2.printll();

//        crossNode(ll1, ll2);
        System.out.println(head.data);
        ll1.delRet(2, 2);
        printll(ll1);
    }
}
