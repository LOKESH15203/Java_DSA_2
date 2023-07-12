package _0_Practice;

public class TP {
    
    public static void floid_triangle(int n){

        for(int i = 1; i<= n; i++){
            for(int j = i; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
   
    public static void main(String[] args) {
        TP f = new TP();

        f.floid_triangle(4);
    }
}