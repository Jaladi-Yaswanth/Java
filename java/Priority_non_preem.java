
public class Priority_non_preem {

    // Function to find the waiting time for all processes
    static void findWaitingTime(int n, int[] bt, int[] wt, int[] at, int[] priority) {
        int[] remainingProcesses = new int[n];
        boolean[] completed = new boolean[n];
        int currentTime = 0;
        int completedCount = 0;

        // Initialize remaining processes to burst times
        for (int i = 0; i < n; i++) {
            remainingProcesses[i] = bt[i];
        }

        while (completedCount < n) {
            int highestPriorityIndex = -1;

            // Find the process with the highest priority that has arrived and is not yet completed
            for (int i = 0; i < n; i++) {
                if (at[i] <= currentTime && !completed[i] &&
                    (highestPriorityIndex == -1 || priority[i] < priority[highestPriorityIndex])) {
                    highestPriorityIndex = i;
                }
            }

            if (highestPriorityIndex == -1) {
                // No process has arrived yet, move time forward
                currentTime++;
                continue;
            }

            // Calculate waiting time for the selected process
            wt[highestPriorityIndex] = currentTime - at[highestPriorityIndex];
            // Update current time
            currentTime += remainingProcesses[highestPriorityIndex];
            // Mark this process as completed
            completed[highestPriorityIndex] = true;
            completedCount++;
        }
    }

    // Function to calculate turn around time
    static void findTurnAroundTime(int n, int[] bt, int[] wt, int[] tat) {
        for (int i = 0; i < n; i++) {
            tat[i] = bt[i] + wt[i];
        }
    }

    // Function to calculate average waiting and turn-around times
    static void findAvgTime(int n, int[] bt, int[] at, int[] priority) {
        int[] wt = new int[n];
        int[] tat = new int[n];

        // Find waiting time of all processes
        findWaitingTime(n, bt, wt, at, priority);

        // Find turn around time for all processes
        findTurnAroundTime(n, bt, wt, tat);

        // Display processes along with all details
        System.out.println("Processes " + " Burst Time " + " Arrival Time " + " Priority " + " Waiting Time " + " Turn-Around Time " + " Completion Time");
        int totalWt = 0, totalTat = 0;
        for (int i = 0; i < n; i++) {
            totalWt += wt[i];
            totalTat += tat[i];
            int complTime = tat[i] + at[i];
            System.out.println((i + 1) + "\t\t" + bt[i] + "\t\t" + at[i] + "\t\t" + priority[i] + "\t\t" + wt[i] + "\t\t" + tat[i] + "\t\t" + complTime);
        }

        System.out.println("Average waiting time = " + (float) totalWt / n);
        System.out.println("Average turn around time = " + (float) totalTat / n);
    }

    // Driver code
    public static void main(String[] args) {
        // Process ids
        int[] processes = {1, 2, 3, 4, 5, 6};
        int n = processes.length;

        // Burst time of all processes
        int[] burstTime = {25, 28, 33, 15, 45, 10};

        // Arrival time of all processes
        int[] arrivalTime = {1, 2, 0, 1, 0, 4};

        // Priority of all processes (lower number means higher priority)
        int[] priority = {2,4,6,1,3,5};

        // Find average waiting and turn-around times
        findAvgTime(n, burstTime, arrivalTime, priority);
    }
}