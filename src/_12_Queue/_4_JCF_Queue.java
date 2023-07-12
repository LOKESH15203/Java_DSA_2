package _12_Queue;
import java.util.*;

public class _4_JCF_Queue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st No.");
        int n1 = sc.nextInt();


        Queue<Integer> q = new LinkedList<>();
        q.add(n1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
     }
}
