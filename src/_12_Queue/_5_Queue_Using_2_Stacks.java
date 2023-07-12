package _12_Queue;

import java.util.Stack;

public class _5_Queue_Using_2_Stacks {


    // Process is Like
    // First check if stack 1 is empty
    // if empty insert data in it
    // if not, pop all the data from it and push it into another stack
    // Then insert the new value and then bring back all the old values that were pussed in the second stack
    // This ensures that the data is in the order
    // As stacks tend to REVERSE the data entered
    // Last - print the stack that is perceived a Queue...


    static class S2Queue{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty(){
            return s1.isEmpty();
        }
        public void add(int val){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(val);

            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.pop();
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {

        S2Queue q = new S2Queue();
        q.add(3);
        q.add(4);
        q.add(7);
        q.add(2);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
