import java.io.FileReader;
import java.io.IOException;

public class Rethrow {

    public static void processFile (String filename) throws IOException {
        try {
            FileReader fr = new FileReader(filename);

        } catch (IOException ex) {
            System.out.println("Logging erro before rethrowing: " + ex.getMessage());
            throw ex;
        }
    }

    public static void main (String[] args) {
        try {
            processFile ("nonexistent.txt");
        } catch (IOException e) {
            System.out.println("Main caught: " + e.getMessage());
        }
    }
}
