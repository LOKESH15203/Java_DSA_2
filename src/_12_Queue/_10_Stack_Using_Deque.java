package _12_Queue;

import java.util.Deque;
import java.util.LinkedList;

public class _10_Stack_Using_Deque {

    public static class stack{

        Deque<Integer> dq = new LinkedList<>();

        public void push(int val){
            dq.addFirst(val);
        }

        // And the rest are understood

    }

    public static void main(String[] args) {

    }
}
