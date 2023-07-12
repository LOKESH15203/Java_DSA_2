package _12_Queue;

public class _1_ArrayQueue {

    public static class queue{
        static int arr[];
        static int size;
        static int rear;

        queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }
        public Boolean isEmpty(){
            return rear == -1;
        }

        public void add(int val){
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }
            rear = rear+1;
            arr[rear] = val;
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear = rear - 1;

            return front;
        }

        public void peek(){
            if(rear == size-1){
                System.out.println("Queue is empty");
                return;
            }
            System.out.println(arr[0]);
        }

    }

    public static void main(String[] args) {

        queue q = new queue(5);
        q.add(4);
        q.add(3);
        q.add(6);
        q.add(1);

        while(!q.isEmpty()){
            q.peek();
            q.remove();
        }
    }
}
