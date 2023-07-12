// changing aaaabbbcccdd
// to 
// a4b3c3d2

package _3_Strings;

import java.util.jar.Attributes.Name;

public class _2_CompressString {

    public static String compress(String s){
        String str = "";
        
        for(int i= 0; i < s.length(); i++){
            Integer count = 1;
            while(i < s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                count++;
                i++;
            }
            str += s.charAt(i);
            if(count>1){
                str += count.toString();
            }
        }
        return str;
    }

    public static void main(String[] args) {

        String s = "abcd";
        System.out.println(compress(s));  
    }
}
