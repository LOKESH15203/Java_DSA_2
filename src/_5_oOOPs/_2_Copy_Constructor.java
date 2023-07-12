package _5_oOOPs;

class Pen{
    String color; // as variables private we need GETTERS to access them
    int tip;

    Pen(){} // if not created - Object creation not possible

    Pen(Pen p1){
        p1.color = color;
        p1.tip = tip;
    }

    void setColor(String newColor){
        this.color = newColor;   
    }
    
    void setTip(int newTip){
        this.tip = newTip;
    }
}

public class _2_Copy_Constructor {
     public static void main(String[] args) {
            
            Pen p1 = new Pen();
            Pen p2 = new Pen();

            p1.color = "Red";
            System.out.println(p2.color);
    
        }    
    }
    
    

