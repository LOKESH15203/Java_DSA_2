package _16_Heaps;

import java.util.PriorityQueue;

public class _6_Weakest_Solder {
    // Needed to find the row with the weakest row. The weakest row is defined as :
    // 1. The row wth Less No. of solders is weaker and
    // 2. If the No. of solders are equal then one which is before the other is weaker

    static class row implements Comparable<row>{
        int idx;
        int sNo;

        public row(int idx, int sNo) {
            this.idx = idx;
            this.sNo = sNo;
        }

        @Override
        public int compareTo(row r2) {
            if(this.sNo == r2.sNo){                 // When the No. of solders are same
                return this.idx-r2.idx;             // Compare on the bases of index
            }
            else {
                return this.sNo - r2.sNo;            // Else on the basis of solder No.
            }
        }
    }

    public static void main(String[] args) {
        int rows[][] = {{1, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 0, 0, 0},
                {1, 0, 0, 0}};
        int k = 2;

        PriorityQueue<row> pq = new PriorityQueue<>();


        for (int i=0; i<rows.length; i++){
            int sNo = rows[i][0] + rows[i][1] + rows[i][2] + rows[i][3];      // Can also be written as count += rows[i][j] == 1 ? 1 : 0;
            pq.add(new row(i, sNo));
        }

        for (int i=0; i<k; i++){
            System.out.println("R" + pq.remove().idx);
        }
    }
}
