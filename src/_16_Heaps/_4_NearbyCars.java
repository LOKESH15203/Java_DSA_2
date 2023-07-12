package _16_Heaps;

import java.util.PriorityQueue;

public class _4_NearbyCars {
    // Imagine a 2d parking area on which you are standing on the origin
    // Coordinates of position of cars are given we need to find closet k cars

    static class Points implements Comparable<Points>{
        int x;
        int y;
        int distSq;
        int idx;

        public Points(int x, int y, int distSq, int idx){
            this.distSq = distSq;
            this.x = x;
            this.y = y;
            this.idx = idx;
        }
        @Override
        public int compareTo(Points p2){
            return this.distSq - p2.distSq;
        }
    }


    public static void main(String[] args) {

//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        pq.add(2);
//        pq.add(8);
//        pq.add(1);
//        pq.add(5);
//
//        while (!pq.isEmpty()){
//            System.out.print(pq.peek()+ " ");
//            pq.remove();
//        }

        int pts[][] = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;

        PriorityQueue<Points> pq = new PriorityQueue<>();
        for (int i=0; i< pts.length; i++){
            int distSq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new Points(pts[i][0], pts[i][1], distSq, i));
        }

        for (int i=0; i<k; i++){
            System.out.println("C"+ pq.remove().idx);
        }
    }
}
