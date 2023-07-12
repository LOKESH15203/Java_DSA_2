package _11_Stack;

public class _2_LinkedList_Stack {

    static class Node{
        int data;
        Node next;
        public Node(int val){
            data = val;
            next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    static class StackLL{

        public boolean isEmpty(){
            if (head == null)
                return true;
            return false;
        }

        public void add(int val){
            Node node = new Node(val);
            size++;
            if(head == null){
                head = tail = node;
                return;
            }
            node.next = head;
            head = node;
        }
        public int pop(){
            int val = head.data;

            if(head == null){
                size--;
                return -1;
            }
            if(head == tail){
                head = tail = null;
                size--;
                return -1;
            }
            head = head.next;
            size--;
            return val;
        }
        public int peek(){
            if (head == null){
                return -1;
            }
            System.out.println(head.data);
            return head.data;
        }
//        public void printSt(){
//            if(head == null){
//                System.out.println("st is empty");
//            }
//            Node temp = head;
//            while (temp!= null){
//                System.out.print(temp.data + " ");
//                temp = temp.next;
//            }
//            System.out.println();
//        }
    }


    public static void main(String[] args) {
        StackLL sl = new StackLL();
        sl.add(4);
        sl.add(5);
        sl.add(7);
        sl.add(2);
        sl.add(9);
        sl.pop();
//        sl.peek();
        while (!sl.isEmpty()){
            sl.peek();
            sl.pop();
        }
    }

}
