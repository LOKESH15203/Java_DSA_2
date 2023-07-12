package _6_Recursion;

public class _10_StringLength {

    public static int strlength(String str, int i){

        if (str.length() == 0 || i == str.length()){
            return 0;
        }
        int count = 1 + strlength(str, i+1);
        return count;
    }

    public static void main(String[] args) {

        String str = "Lokesh";
        System.out.println(strlength(str, 0));

    }
}
