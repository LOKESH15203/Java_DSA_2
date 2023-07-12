package _13_Greedy_Algorithm;

// All jobs start at the same time
// All jobs should end before deadline
// So we need to decide which tasks to do and in what order


import javax.print.attribute.standard.JobPriority;
import java.util.*;

public class _5_Job_Sequence {

    static class Job{
        int id;
        int deadline;
        int profit;

        public Job(int i, int d, int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }

    // Main function
    public static void main(String[] args) {
        //              Deadline, Profit
        int jobsInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i=0; i< jobsInfo.length; i++){
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        // Sorting object in descending order
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);  // Descending order of profit

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i=0; i< jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("Max Jobs = " + seq.size());
        for(int i=0; i<seq.size(); i++){
            System.out.print(seq.get(i)+ " ");
        }
        System.out.println();

//        for (int i=0; i<jobs.length - 1; i++){
//            for (int j = 0; j< jobs.length - 1; j++){
//                System.out.println(jobs[i][j]);
//            }

    }
}
