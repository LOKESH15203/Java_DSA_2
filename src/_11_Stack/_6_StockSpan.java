package _11_Stack;

import java.util.Stack;

public class _6_StockSpan {

    public static void stockSpan(int Stock[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for(int i=1; i<Stock.length; i++){
            int currEle = Stock[i];
            while (!s.isEmpty() && currEle > Stock[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
                return;
            }
            else {
                int preHigh = s.peek();
                span[i] = i - preHigh;
            }
            s.push(i);
        }
    }

    public static void main(String[] args) {

        int Stock[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[Stock.length];
        stockSpan(Stock, span);

        for(int i=0; i<span.length; i++){
            System.out.println(span[i] + " ");
        }
    }
}
