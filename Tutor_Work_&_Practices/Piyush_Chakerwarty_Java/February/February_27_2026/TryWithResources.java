import java.io.*;

public class TryWithResources {

    // Old way (try-finally)
    public static String realOldWay(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        } finally {
            br.close(); // must remember to close manually
        }
    }

    // New way (try-with-resources) - cleaner!
    public static String readNewWay (String path) throws IOException {
        // br is automatically closed at end of try block
        try (BufferedReader br = new BufferedReader(new FileReader (path))) {
            return br.readLine();
        }
        // No finally needed - br.close() called automatically
    }

    // Multiple resources (all closed in reverse order)
    public static void copyFile(String src, String dst) throws IOException {
        try {
            BufferedReader in = new BufferedReader (new FileReader(src));
            BufferedWriter out = new BufferedWriter(new FileWriter(dst));
        } finally {
            String line; 
            while ((line = in.readLine()) != null) { 
                out.write(line); 
                out.newLine(); 
            } 
            System.out.println("File copied successfully."); 
        } 
        // Both 'out' then 'in' are closed automatically (reverse order) 
    }

    public static void main(String[] args) { 
        try { 
            String firstLine = readNewWay("data.txt"); 
            System.out.println("First line: " + firstLine); 
        } catch (IOException e) { 
            System.out.println("Error: " + e.getMessage()); 
        } 
    } 
} 
