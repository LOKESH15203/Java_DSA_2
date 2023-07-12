package _6_Recursion;

public class _8_PairingFrinends {

    public static int noOfWays(int n){

        if(n == 1 || n == 2){
            return n;
        }
        // when single - not pared
        int fnm1 = noOfWays(n-1);
        // when paired - not single
        int fnm2 = noOfWays(n-2);
        int pairWays = (n-1) * fnm2; // Total ways as the
                                     // -1 for the element with which pair formed
                                     // and * for the rest of the possible elements that could have paired(possible outcomes)

        return fnm1 + pairWays;
//        ########################################################################
//        return noOfWays(n-1) + (n-1) * noOfWays(n-2); // above code in One line
//        ########################################################################
    }

    public static void main(String[] args) {

        System.out.println(noOfWays(3));

    }
}
