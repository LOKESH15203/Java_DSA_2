package _16_Heaps;
import java.util.Comparator;
import java.util.PriorityQueue;

public class _7_Kth_Largest_Element {

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < nums.length; i++) {
            maxHeap.add(nums[i]);
        }

        for(int i = 0; i < k - 1; i++) {
            maxHeap.poll();
        }

        return maxHeap.peek();
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(findKthLargest(nums, k));

    }
}
