package _16_Heaps;

import java.util.ArrayList;
import java.util.Objects;

public class _2_HEAP {

     static class Heap{
         ArrayList<Integer> al = new ArrayList<>();

         public void add(int data){
             // add at last
             al.add(data);

             //Fix Position
             int x = al.size()-1; // Child index
             int par = (x-1)/2;   // Parent Index

             while (al.get(x)<al.get(par)){//         O(logn)
                 //swap
                 int temp = al.get(x);
                 al.set(x, al.get(par));
                 al.set(par, temp);

                 x = par;
                 par = (x-1)/2;
             }
         }

         public int peek(){
             return al.get(0);
         }

         private void heapify(int i){
             int left = 2*i+1;
             int right = 2*i+2;
             int minIdx = i;

             if(left < al.size() && al.get(minIdx) > al.get(left)){
                 minIdx = left; /////// This changes where "midIdx" is pointing
             }
             if(right < al.size() && al.get(minIdx) > al.get(right)){
                 minIdx = right;
             }

             if(minIdx != i){ // if midIdx pointer changed - Bring it back.
                 // swap
                 int temp = al.get(i);
                 al.set(i, al.get(minIdx));  // al.set(index, valueToSet)
                 al.set(minIdx, temp);

                 heapify(minIdx);
             }
         }
         public int delete(){
             int data = al.get(0);
             // swap 1st and last
             int temp = al.get(0);
             al.set(0, al.get(al.size()-1));
             al.set(al.size()-1, temp);

             // remove
             al.remove(al.size()-1);

             // fix the heap
             heapify(0);
             return data;
         }

         public boolean isEmpty(){
             return al.size() == 0;
         }
     }

    public static void main(String[] args) {

         Heap h = new Heap();
         h.add(3);
         h.add(4);
         h.add(1);
         h.add(5);

         while(!h.isEmpty()){
             System.out.println(h.peek());
             h.delete();
         }
    }
}
