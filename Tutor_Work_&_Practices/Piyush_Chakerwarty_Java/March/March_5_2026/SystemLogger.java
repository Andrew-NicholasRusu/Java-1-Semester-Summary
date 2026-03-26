
import java.io.FileWriter;
import java.io.IOException;

// Modernize resource management using the try-with-resources syntax so you 
// don't have to manually close files in a finally block. 

// Scenario: You need to write a log message to a file, ensuring the file stream closes 
// safely even if an error occurs

// 1. Setup: Create a class named SystemLogger. 
public class SystemLogger {
    
    // 2. The Method: Create a method public static void writeLog(String message). 
    public static void writeLog(String message){
        // 3. Try-With-Resources: Instead of a standard try block, use the syntax 
        // try (FileWriter writer = new FileWriter("app.log")) { ... }. 
        try (FileWriter writer = new FileWriter("app.log", true)) {
        // 4. The Logic: Inside the try block, call writer.write(message + "\n"); 
        // and print "Log written successfully." 
            writer.write(message + "\n");
            System.out.println("Log written successfully.");
        
        // 5. The Catch Block: Catch IOException. Print "Failed to write log: " + e.getMessage(). 
        } catch (IOException e) {
            System.out.println("Failed to write log: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        writeLog("Application Started.");
        writeLog("User: Andrew-Nicholas Rusu");
        writeLog("Exception Handled in Main Modul:");
        // 6. Observation: Note that you do not need a finally block to call writer.close(). 
        // Java handles it automatically because FileWriter implements the AutoCloseable interface. 
    }
}
