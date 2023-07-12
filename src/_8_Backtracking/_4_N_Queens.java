package _8_Backtracking;

public class _4_N_Queens {

    public static boolean isSafe(char board[][], int row, int col){

        // Vertically up
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // Diagonally left up
        for (int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if (board[i][j]== 'Q'){
                return false;
            }
        }

        // Diagonally right up
        for (int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if (board[i][j]== 'Q'){
                return false;
            }
        }

        return true;
    }

    static int count = 0;  // Accessible anywhere in the program

    public static void nQueens(char board[][], int row){  // TO PRINT

        if(row == board.length){
            printBoard(board); // To print all boards
            count++; // To get possible No. of boards or possibilities
            return;
        }

        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                nQueens(board, row+1);
                board[row][j]= 'x'; // This Helps to un-place and find other solution (if any)(4*4 has 2 && 5*5 has 10)
                // When back tracking, we need to remove Q from      -    .  Q
                // the first row to allow next set to be tried that is-    Q  .
            }
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("--------- Board ---------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 2;
        char board[][] = new char[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 'x';
            }
        }

//        nQueens(board, 0);
        nQueens(board, 0);
        System.out.println("The possible No. of combinations to arranging the Queens safe from each other are : " + count);

    }
}
