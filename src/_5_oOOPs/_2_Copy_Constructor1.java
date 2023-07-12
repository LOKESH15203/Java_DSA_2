package _5_oOOPs;

class Pen2{
    String color; // as variables private we need GETTERS to access them
    int tip;

    Pen2(){} // if not created - Object creation not possible

    Pen2(Pen p1){
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

public class _2_Copy_Constructor1 {

    public static void main(String[] args) {
        
        Pen p1 = new Pen();
            Pen p2 = new Pen();

            p1.setColor("red");
            System.out.println(p2.color);
    }
    
}
