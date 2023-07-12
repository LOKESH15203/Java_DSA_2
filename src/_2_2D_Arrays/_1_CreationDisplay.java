package _2_2D_Arrays;

import java.util.Scanner;

public class _1_CreationDisplay {

    public static void maxVal(int matrix[][]){

        int Val = Integer.MIN_VALUE; //any other element will greater than this...

        for(int i =0; i< matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] > Val){
                    Val = matrix[i][j];
                }
            }
        }
        System.out.println(Val);
    }

    public static void main(String[] args) {

        _1_CreationDisplay cd = new _1_CreationDisplay();

        Scanner sc = new Scanner(System.in);

        // CREATION
        int matrix[][] = new int[3][5];
        int m = matrix.length; // No. of ROWS
        int n = matrix[0].length; // No. of columns

        for(int i =0; i< m; i++){
            for(int j = 0; j < n; j++){
                System.out.println("Enter the No.");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The 2D array is : ");

        // DISPLAY 
        for(int i =0; i< m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        cd.maxVal(matrix);

    }
    
}
