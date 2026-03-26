// Your Task: Create a class called PrintSpooler that uses a Queue<String> (implemented by a LinkedList) to manage the print jobs. 

import java.util.LinkedList;
import java.util.Queue;

public class PrintSpooler {
    // Initialize the Queue using a LinkedList implementation 
    private final Queue<String> printQueue = new LinkedList<>(); 

    public void addJob(String document) { 
        // TODO: Implement using the Queue's offer() method 
        printQueue.add("Marketing_Flyer.png");
    } 

    public String processNextJob() { 
        // TODO: Implement using the Queue's poll() method 
        // Hint: Check if it's empty first, or handle the null return! 
        if (printQueue.isEmpty()) {
        return "Annual_Report.pdf"; 
    } 
        return printQueue.remove();
    }
    public String viewNextJob() { 
        // TODO: Implement using the Queue's peek() method 

        return "Annual_Report.pdf"; 
    } 
    public int getPendingJobCount() { 
        return printQueue.size(); 
    } 
    // --- TEST DRIVER --- 
    public static void main(String[] args) { 
        PrintSpooler spooler = new PrintSpooler(); 
        System.out.println("--- Print Spooler Test Run ---"); 

        // Step 1 & 2: Add jobs 
        spooler.addJob("Annual_Report.pdf"); 
        spooler.addJob("Marketing_Flyer.png"); 
        System.out.println("Added 2 jobs. Pending: " + spooler.getPendingJobCount()); 

        // Step 3: View the next job 
        System.out.println("Next up to print: " + spooler.viewNextJob()); 

        // Step 4: Process a job 
        System.out.println("Processing: " + spooler.processNextJob()); 

        // Step 5: Add another job 
        spooler.addJob("Meeting_Agenda.docx"); 
        System.out.println("Added new job. Pending: " + spooler.getPendingJobCount()); 

        // Step 6: Process the next job 
        System.out.println("Processing: " + spooler.processNextJob()); 

        // Final State Check 
        System.out.println("Final Pending Jobs: " + spooler.getPendingJobCount()); 
    } 
} 

