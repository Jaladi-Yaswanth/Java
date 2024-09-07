import java.util.Arrays;
import java.util.Comparator;

public class SJF{

    // Function to find the waiting time for all processes
    static void findWaitingTime(int processes[], int n, int bt[], int wt[], int at[]) {
        int remainingProcesses = n;
        int currentTime = 0;
        boolean[] completed = new boolean[n];
        
        // Sort processes based on arrival time
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, Comparator.comparingInt(i -> at[i]));
        
        int[] sorted_bt = new int[n];
        int[] sorted_at = new int[n];
        for (int i = 0; i < n; i++) {
            sorted_bt[i] = bt[indices[i]];
            sorted_at[i] = at[indices[i]];
        }
        
        int index = 0;
        while (remainingProcesses > 0) {
            int minIndex = -1;
            int minBurst = Integer.MAX_VALUE;

            // Find the process with the shortest burst time that has arrived
            for (int i = 0; i < n; i++) {
                if (sorted_at[i] <= currentTime && !completed[i] && sorted_bt[i] < minBurst) {
                    minBurst = sorted_bt[i];
                    minIndex = i;
                }
            }
            
            if (minIndex == -1) {
                // No process has arrived yet, move time forward
                currentTime++;
                continue;
            }
            
            // Calculate waiting time for the selected process
            wt[minIndex] = currentTime - sorted_at[minIndex];
            currentTime += sorted_bt[minIndex];
            completed[minIndex] = true;
            remainingProcesses--;
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
            System.out.println((i + 1) + "\t\t" + bt[i] + "\t\t" + at[i] + "\t\t" + wt[i] + "\t\t " + tat[i] + "\t\t " + compl_time);
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
        int burst_time[] = {25, 28, 33, 15, 45, 10};

        // Arrival time of all processes
        int arrival_time[] = {1,2,0,1,0,4};

        findavgTime(processes, n, burst_time, arrival_time);
    }
}