package _12_Queue;

import java.util.Deque;
import java.util.LinkedList;

public class _9_Deque {

    public static void main(String[] args) {

        Deque<Integer> dq = new LinkedList<>();

        dq.addFirst(1);
        dq.addFirst(5);
        dq.addLast(7);
        dq.addLast(3);
        dq.addFirst(9);
        dq.addFirst(2);

        dq.removeFirst();
        dq.removeLast();

        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());

        System.out.println(dq);
    }
}
