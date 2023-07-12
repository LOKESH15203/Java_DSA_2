package _12_Queue;

public class _3_QueueLinkedList {

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

     public static class LLQueue{

         public static boolean isEmpty(){
            return head == null && tail == null;
         }

         public void add(int val){
             Node newnode = new Node(val);
             size++;
             if(head == null) {
                 head = tail = newnode;
                 return;
             }
             tail.next = newnode;
             tail = newnode;
         }

         public void remove(){
             int data = head.data;
             if(isEmpty()){
                 System.out.println("Queue is Empty");
                 return;
             }
             else if(size == 1){
                 head = tail = null;
                 return;
             }
             head = head.next;
             System.out.println("The dequed element is " + data);
         }
         public int peek(){
             if(isEmpty()){
                 System.out.println("Queue is Empty");
                 return -1;
             }
             return head.data;
         }
     }

    public static void main(String[] args) {

         LLQueue q = new LLQueue();
         q.add(5);
         q.add(0);
         q.add(7);
         q.add(9);
         q.add(2);

         while (!q.isEmpty()){
             System.out.println(q.peek());
             q.remove();
         }
    }
}
