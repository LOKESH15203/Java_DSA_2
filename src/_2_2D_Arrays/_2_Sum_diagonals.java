package _2_2D_Arrays;

public class _2_Sum_diagonals {

    public static int disum(int matrix[][]){

        int sum = 0;
        for(int i=0; i< matrix.length;i++){
            sum += matrix[i][i];

            if(i != matrix.length-1-i){ // this condition to not add the middle element in a odd 'n' matrix where 2 diagonals overlap on a element. Eg '9' is the matrix below

                sum += matrix[i][matrix.length-1-i]; // i+j = matrix.length-1;
                      //  (i,j)position of the diagonal element int the diagonal matrix
            }                                        //   j = matrix.length -1 - i;
        }
        return sum; 
    }
    
    public static void main(String[] args) {
        
        int matrix[][] = {{1, 5, 3},
                          {2, 9, 4}, 
                          {3, 5, 7}};

       System.out.println(disum(matrix));

    }
    
}
