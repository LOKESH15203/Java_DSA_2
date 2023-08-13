package _3_Strings;

public class _4_RemoveConsicutiveCharacters {
    // Just removing same adjesent characters in a string.

    public static String removeConsecutiveCharacter(String S){
        StringBuilder sb = new StringBuilder();
        sb.append(S.charAt(0));
        for (int i=1; i<S.length(); i++){
            if (S.charAt(i) != S.charAt(i-1)){
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(removeConsecutiveCharacter(s));

    }
}
