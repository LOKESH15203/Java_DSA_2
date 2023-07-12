package _13_Greedy_Algorithm;

public class _1_Activity_Selection {

    public static int maxActivity(int[] start, int[] end){

        int count = 0;

        int lastEnd = end[0];
        count++;
        for(int i=1; i<end.length; i++){
            if(start[i] >= lastEnd){
                count++;
                lastEnd = end[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        System.out.println(maxActivity(start, end));
    }
}
