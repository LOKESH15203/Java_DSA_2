package _3_Strings;

public class TP_String {

    public static void main(String[] args) {

        String s = "String";
        StringBuilder sb = new StringBuilder();
//        int n=3;
//        String r = "in it";
//        System.out.println(s.replace(s.charAt(n), r.charAt(2)));
//        System.out.println(s);

        char[] arr = s.toCharArray();
        System.out.println(arr[3]);
        System.out.println(arr);
        String c = arr.toString();
        System.out.println(c);
    }
}
