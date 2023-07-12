package _8_Backtracking;

public class _6_T9_Alphabets {

    //                       0   1          2                3                4             ##INDEXES##
    final static char L[][]= {{}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'},
                            {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'},
                            {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};

    public static void printPossOptions(char L[][], int i){

        for(int j=0; j<=2; j++){
            System.out.print(L[i][j]+ " ");
        }
    }


    public static void main(String[] args) {
        int i = 2;
        printPossOptions(L, i);
        System.out.println(L[2][0]);
    }
}
