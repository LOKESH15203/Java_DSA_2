package _10_Linked_List;
import java.util.*;
import java.util.LinkedList;

public class LL_in_JCF {
    public static void main(String[] args) {
        LinkedList<Integer> ill = new LinkedList<>();
        LinkedList<Character> cll = new LinkedList<>();
        ill.addFirst(1);
        ill.addLast(4);
        ill.addFirst(0);
        ill.addLast(5);
        System.out.println(ill);

        ill.removeLast();
        System.out.println(ill);
    }
}
