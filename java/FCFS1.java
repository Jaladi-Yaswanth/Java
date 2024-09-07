import java.util.*;

class Process {

    int pid;          // Process ID
    int arrivalTime;  // Arrival time
    int burstTime;    // Burst time
    int completionTime; // Completion time
    int turnaroundTime; // Turnaround time
    int waitingTime;  // Waiting time

    // Constructor to initialize the process
    public Process(int pid, int arrivalTime, int burstTime) {
        this.pid = pid;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
    }
}

public class FCFS1{

    public static void main(String[] args) {
        // List of processes
        List<Process> processes = new ArrayList<>();

        // Add processes to the list
        processes.add(new Process(1, 1, 25));
        processes.add(new Process(2, 2, 28));
        processes.add(new Process(3, 0, 33));
        processes.add(new Process(4, 1, 15));
        processes.add(new Process(5, 0, 45));
        processes.add(new Process(6, 4, 10));

        // Sort processes by arrival time
        processes.sort(Comparator.comparingInt(p -> p.arrivalTime));

        // Calculate completion, turnaround, and waiting times
        calculateTimes(processes);

        // Display the processes and their respective times
        System.out.println("PID\tArrival\tBurst\tCompletion\tTurnaround\tWaiting");
        for (Process process : processes) {
            System.out.println(process.pid + "\t" + process.arrivalTime + "\t" + process.burstTime + "\t" + process.completionTime + "\t\t" + process.turnaroundTime + "\t\t" + process.waitingTime);
        }

        // Calculate and display average turnaround and waiting times
        double avgTurnaroundTime = processes.stream().mapToDouble(p -> p.turnaroundTime).average().orElse(0.0);
        double avgWaitingTime = processes.stream().mapToDouble(p -> p.waitingTime).average().orElse(0.0);
        System.out.println("\nAverage Turnaround Time: " + avgTurnaroundTime);
        System.out.println("Average Waiting Time: " + avgWaitingTime);
    }

    private static void calculateTimes(List<Process> processes) {
        int currentTime = 0;

        for (Process process : processes) {
            if (currentTime < process.arrivalTime) {
                currentTime = process.arrivalTime;
            }

            process.completionTime = currentTime + process.burstTime;
            process.turnaroundTime = process.completionTime - process.arrivalTime;
            process.waitingTime = process.turnaroundTime - process.burstTime;

            currentTime = process.completionTime;
        }
    }
}