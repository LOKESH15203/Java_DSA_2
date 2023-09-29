package _11_Stack;

import java.util.LinkedList;
import java.util.Queue;

public class _14_Queue_Stack {

    Queue<Integer> q = new LinkedList();

    public void push(int x) {
        q.add(x);
    }

    public int pop() {
        Queue<Integer> top = new LinkedList<>();

        int size =  q.size();

        for(int i =0;i<size-1;i++){
            top.add(q.remove());
        }
        int ans =  q.remove();

        while(!top.isEmpty()){
            q.add(top.remove());
        }

        return ans;
    }

    public int top() {
        Queue<Integer> top = new LinkedList();
        int size = q.size();

        for (int i=0; i<size-1; i++){
            top.add(q.remove());
        }

        int ans = q.peek();
        top.add(q.remove());

        while(!top.isEmpty()){
            q.add(top.remove());
        }

        return ans;
    }

    public boolean empty() {
        return q.isEmpty();
    }

    public static void main(String[] args) {

    }
}
