import java.util.HashMap;

public class HashmapTest_number3 {
    public static void main(String[] args) {
        String input = "Hello, HashMaps!";

        HashMap<String, String> SchoolMarks = new HashMap<>();

        // Basic operations
        SchoolMarks.put("Mathematics", "96%"); // Adds a key-value pair.
        SchoolMarks.put("Science", "89%");
        SchoolMarks.put("English", "85%");
        SchoolMarks.put("French", "75%");
        SchoolMarks.put("History", "65%");
        SchoolMarks.put("Gymnastics", "98%");
        SchoolMarks.put("Geography", "75%");
        SchoolMarks.put("Ethics", "74%");
        System.out.println(SchoolMarks); // Prints all the values
        System.out.println(SchoolMarks.size() + " total classes this semester."); // size() gets the map size.

        // Marks ones that need to be improved
        System.out.println(SchoolMarks.get("Gymnastics"));

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("Time to begin College!");
        HashMap<String, String> CollegeMarks = new HashMap<>();
        
    }

}
