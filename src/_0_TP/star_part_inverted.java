package _0_Practice;

public class star_part_inverted {
    
    public static void main(String[] args) {
        
        for(int line= 0; line <= 3; line ++){

            for(int star = 3-line; star >= 0; star--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
