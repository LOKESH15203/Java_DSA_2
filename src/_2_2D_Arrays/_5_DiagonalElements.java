package _2_2D_Arrays;

public class _5_DiagonalElements {

    public static void printDiagonal(int[][] arr){
        int down = 0;
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length+1; j++){
                while (i+j == down && down <= ){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr= { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 },
                        { 13, 14, 15, 16 },
                        { 17, 18, 19, 20 } };

        printDiagonal(arr);
    }
}
