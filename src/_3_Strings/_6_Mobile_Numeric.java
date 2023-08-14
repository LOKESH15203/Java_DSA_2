package _3_Strings;

public class _6_Mobile_Numeric {
    /*
     Given a sentence in the form of a string, convert it into its equivalent mobile numeric keypad sequence.
     Input : HELLO WORLD
     Output : 4433555555666096667775553
    */
    public static String numeric(String[] str, String input){

        String res = "";
        int n = input.length();
        for (int i=0; i<n; i++){
            if (input.charAt(i) == ' '){
                res += "0";
            }
            else {
                int pos = input.charAt(i) - 'A'; // This gives us the ASCII value.
                res += str[pos];
            }
        }
        return res;
    }
    public static void main(String[] args) {

        String str[]
                = { "2",    "22",  "222", "3",   "33", "333",
                    "4",    "44",  "444", "5",   "55", "555",
                    "6",    "66",  "666", "7",   "77", "777",
                    "7777", "8",   "88",  "888", "9",  "99",
                    "999",  "9999" };

        String input = "GEEKSFORGEEKS";
        System.out.println(numeric(str, input));

        // 4333355777733366677743333557777
    }
}
