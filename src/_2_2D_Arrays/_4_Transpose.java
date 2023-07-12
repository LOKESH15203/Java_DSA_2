package _2_2D_Arrays;

public class _4_Transpose {

    public static void display(int matrix[][]){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j< matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int row = 3, col = 3;

        int[][] matrix = { {1,4,9},{11,4,3},{2,2,3} };

        int[][] transpose = new int[col][row];

        for(int i = 0; i < row; i++){
            for(int j = 0; j< col; j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        display(transpose);
    }
}
