package _6_Recursion;

public class _9_nBinaryDigitsWithoutConsicutive1s {

    public static void printBi(int n, int lastplace, String str){
        if (n == 0){
            System.out.println(str);
            return;
        }

        // Adding zero and setting last-place 0
       printBi(n-1, 0, str+"0");

        // Adding 1 and setting last place 1
        if (lastplace == 0){
            printBi(n-1, 1, str+"1");
        }
    }

    public static void main(String[] args) {

        printBi(3, 0, "");
    }
}
