import java.util.Arrays;
import java.util.Comparator;

public class FCFS{

    // Function to find the waiting time for all processes
    static void findWaitingTime(int processes[], int n, int bt[], int wt[], int at[]) {
        int service_time[] = new int[n];
        service_time[0] = at[0];
        wt[0] = 0;

        // calculating waiting time
        for (int i = 1; i < n; i++) {
            // Add burst time of previous processes
            service_time[i] = service_time[i - 1] + bt[i - 1];

            // Find waiting time for current process
            wt[i] = service_time[i] - at[i];

       
            if (wt[i] < 0) {
                wt[i] = 0;
              
                service_time[i] = at[i];
            }
        }
    }

    // Function to calculate turn around time
    static void findTurnAroundTime(int processes[], int n, int bt[], int wt[], int tat[]) {
        // Calculating turnaround time by adding bt[i] + wt[i]
        for (int i = 0; i < n; i++)
            tat[i] = bt[i] + wt[i];
    }

    // Function to calculate average waiting and turn-around times
    static void findavgTime(int processes[], int n, int bt[], int at[]) {
        int wt[] = new int[n], tat[] = new int[n];

        // Function to find waiting time of all processes
        findWaitingTime(processes, n, bt, wt, at);

        // Function to find turn around time for all processes
        findTurnAroundTime(processes, n, bt, wt, tat);

        // Display processes along with all details
        System.out.println("Processes " + " Burst Time " + " Arrival Time " + " Waiting Time " + " Turn-Around Time " + " Completion Time");
        int total_wt = 0, total_tat = 0;
        for (int i = 0; i < n; i++) {
            total_wt += wt[i];
            total_tat += tat[i];
            int compl_time = tat[i] + at[i];
            System.out.println(processes[i] + "\t\t" + bt[i] + "\t\t" + at[i] + "\t\t" + wt[i] + "\t\t " + tat[i] + "\t\t " + compl_time);
        }

        System.out.println("Average waiting time = " + (float) total_wt / n);
        System.out.println("Average turn around time = " + (float) total_tat / n);
    }

    // Driver code
    public static void main(String args[]) {
        // Process ids
        int processes[] = {1, 2, 3, 4, 5, 6};
        int n = processes.length;

        // Burst time of all processes
        int burst_time[] = {25, 28, 33, 15, 45, 10}; // Fixed to match number of processes

        // Arrival time of all processes
        Integer[] arrival_time = {1, 2, 0, 1, 0, 4};

        // Create an array of indices
        Integer[] sorted_indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            sorted_indices[i] = i;
        }

        // Sort indices based on arrival times
        Arrays.sort(sorted_indices, Comparator.comparingInt(i -> arrival_time[i]));

        // Create sorted arrays based on the sorted indices
        int[] sorted_arrival_time = new int[n];
        int[] sorted_burst_time = new int[n];
        int[] sorted_processes=new int[n];
        for (int i = 0; i < n; i++) {
            sorted_arrival_time[i] = arrival_time[sorted_indices[i]];
            sorted_burst_time[i] = burst_time[sorted_indices[i]];
            sorted_processes[i]=processes[sorted_indices[i]];
        }

        findavgTime(sorted_processes, n, sorted_burst_time, sorted_arrival_time);
    }
}
