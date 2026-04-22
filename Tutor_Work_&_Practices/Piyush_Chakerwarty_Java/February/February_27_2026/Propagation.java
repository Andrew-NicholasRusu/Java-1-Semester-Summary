public class Propagation {

    // Create 3 methods that propagate eachother
    public static void method3() {
        int[] arr = new int[3];
        arr[5] = 50;
    }

    public static void method2() {
        method3();
    }

    public static void method1() {
        method2();
    }

    // Main method
    public static void main(String[] args) {

        // This is the wrong order when you're doing a catch block.

        /*
        Always catch subclass exceptions BEFORE superclass exceptions.
         */
            // try {
            //     method1();    
            // } catch (Exception e) {
            //     System.out.println("Caught in main(): " + e.getMessage());
            // }
            // System.out.println("Program continues manually.");

        // Correct order
        try {  
            method1();
        } catch (RuntimeException ex) {  
            System.out.println("Runtime exception");  
        } catch (Exception ex) {  
            System.out.println("General exception");  
        }  

        // Output: Runtime Exception


        /*
        
        */
        try { 

            String str = "xyz"; 

            int num = Integer.parseInt(str); 

        } catch (NumberFormatException ex) { // most specific 

            System.out.println("Number format error: " + ex.getMessage()); 
            // This will print only because

        } catch (IllegalArgumentException ex) { // parent of NumberFormatException 

            System.out.println("Illegal argument"); 

        } catch (RuntimeException ex) { // broader 

            System.out.println("Runtime error"); 

        } catch (Exception ex) { // most general — last 

            System.out.println("General error"); 

        } 

        /*
        Multi-catch for related exceptions:
        */
        try {
            // code that might throw multiple unrelated exceptions.
            int[] arr = new int[3];
            int val = Integer.parseInt("xyz");            
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException ex) {
            // Handle both the same way
            System.out.println("Caught: " + ex.getMessage());
        } 
    }
}
