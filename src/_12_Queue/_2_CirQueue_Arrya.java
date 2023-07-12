package _12_Queue;

public class _2_CirQueue_Arrya {

    public static class cirQueue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        public cirQueue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public boolean isFull(){
            return (rear + 1) % size == front;
        }

        public void add(int val){
            if(isFull()){
                System.out.println("The Circular Queue is full..");
                return;
            }
            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = val;
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("The Circular Queue is empty");
                return -1;
            }
            int f = arr[front];
            if(front == rear){
                front = rear = -1;
            }else
                front = (front+1) % size;
            return f;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("The Circular Queue is Empty");
                return -1;
            }
            return arr[front];

        }

    }

    public static void main(String[] args) {

        cirQueue q = new cirQueue(5);
        q.add(2);
        q.add(4);
        q.add(6);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
