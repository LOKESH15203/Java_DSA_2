// SEARCHINNG IN A SORTED ARRAY

package _2_2D_Arrays;

import java.security.Key;

public class _3_Seraching_Arr {
    
    public static boolean search(int matrix [][], int key){

        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0){

            if(matrix[row][col] == key){
                System.out.println("The element was found at coordinates : ("+ row + ", "+ col +")");
                return true;
            }
            
            else if(key < matrix[row][col]){
                col--;
            }

            else{
                row++;
            }
        }
        System.out.println("No such element in the matrix");
        return false;
    }

    public static void main(String[] args) {
        
        int matrix[][] = {{1, 5, 3, 5},
                          {2, 9, 4, 8}, 
                          {3, 5, 7, 5},
                          {7, 6, 4, 5}};
        int key = 7;
        search(matrix, key);
    }
}
