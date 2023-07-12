package _5_oOOPs;

class Pen1{
    private String color; // as variables private we need GETTERS to access them
    private int tip;

    String getColor(){
        return this.color;
    }
    void setColor(String newColor){
        this.color = newColor;   
    }
    int getTip(){
        return this.tip;
    }
    void setTip(int newTip){

    }
}

public class _1_GettersSetters {

    public static void main(String[] args) {
        
        Pen1 p1 = new Pen1();
        Pen1 p2 = new Pen1();

// when variables are not private

        // p.color = "Red";  
        // System.out.println(p.color); 



// when valriables private

        p1.setColor("Red");
        System.out.println(p1.getColor());



    }


    
}
