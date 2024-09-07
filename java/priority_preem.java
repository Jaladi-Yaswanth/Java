import java.util.*;

class Process {
    int id, burstTime, arrivalTime, priority, remainingTime, completionTime, turnaroundTime, waitingTime;

    Process(int id, int burstTime, int arrivalTime, int priority) {
        this.id = id;
        this.burstTime = burstTime;
        this.arrivalTime = arrivalTime;
        this.priority = priority;
        this.remainingTime = burstTime;
    }
}

class ComparePriority implements Comparator<Process> {
    public int compare(Process p1, Process p2) {
        if (p1.priority == p2.priority) {
            return p1.arrivalTime - p2.arrivalTime;
        }
        return p1.priority - p2.priority;
    }
}

public class priority_preem {
    public static void preemptivePriorityScheduling(List<Process> processes) {
        PriorityQueue<Process> pq = new PriorityQueue<>(new ComparePriority());
        int currentTime = 0;
        int completed = 0;
        int n = processes.size();

        // Track whether each process has been added to the queue
        boolean[] addedToQueue = new boolean[n];
        
        while (completed != n) {
            // Add processes to the priority queue that have arrived at the current time
            for (Process process : processes) {
                if (process.arrivalTime <= currentTime && !addedToQueue[process.id - 1]) {
                    pq.add(process);
                    addedToQueue[process.id - 1] = true; // Mark as added
                }
            }

            if (!pq.isEmpty()) {
                Process current = pq.poll();
                current.remainingTime--;

                // If the process is completed
                if (current.remainingTime == 0) {
                    completed++;
                    current.completionTime = currentTime + 1;
                    current.turnaroundTime = current.completionTime - current.arrivalTime;
                    current.waitingTime = current.turnaroundTime - current.burstTime;
                } else {
                    pq.add(current);
                }
            }
            currentTime++;
        }

        printTable(processes);
        printAverages(processes);
    }

    public static void printTable(List<Process> processes) {
        System.out.println("ID\tBurst\tArrival\tPriority\tCompletion\tTurnaround\tWaiting");
        for (Process process : processes) {
            System.out.println(process.id + "\t" + process.burstTime + "\t" + process.arrivalTime + "\t" + process.priority + "\t\t" + process.completionTime + "\t\t" + process.turnaroundTime + "\t\t" + process.waitingTime);
        }
    }

    public static void printAverages(List<Process> processes) {
        int totalTurnaroundTime = 0;
        int totalWaitingTime = 0;
        int n = processes.size();
        
        for (Process process : processes) {
            totalTurnaroundTime += process.turnaroundTime;
            totalWaitingTime += process.waitingTime;
        }

        System.out.println("Average Turnaround Time = " + (float) totalTurnaroundTime / n);
        System.out.println("Average Waiting Time = " + (float) totalWaitingTime / n);
    }

    public static void main(String[] args) {
        List<Process> processes = Arrays.asList(
            new Process(1, 25, 1, 2),
            new Process(2, 28, 2, 4),
            new Process(3, 33, 0, 6),
            new Process(4, 15, 1, 1),
            new Process(5, 45, 0, 3),
            new Process(6, 10, 4, 5)
        );

        preemptivePriorityScheduling(processes);
    }
}
