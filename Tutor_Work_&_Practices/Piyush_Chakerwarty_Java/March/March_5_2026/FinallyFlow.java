public class FinallyFlow { 

    // Case 1: No exception 
    public static void noException() { 
        try { 
            System.out.println("try block"); 
            // no exception 
        } catch (Exception e) { 
            System.out.println("catch block");  //  
        } finally { 
            System.out.println("finally block"); //  
        } 
        System.out.println("after try-catch-finally"); 
    } 

    // Case 2: Exception is caught 
    public static void exceptionCaught() { 
        try { 
            System.out.println("try block"); 
            int x = 1 / 0;                      
            System.out.println("after throw");  // doesn't print because there is no after throw method in here.
        } catch (ArithmeticException e) { 
            System.out.println("catch block: " + e.getMessage()); 
        } finally { 
            System.out.println("finally block"); //  
        } 
        System.out.println("after try-catch-finally"); 

    } 
    // Case 3: Exception thrown and rethrown 
    public static void exceptionRethrown() throws ArithmeticException { 
        try { 
            System.out.println("try block"); 
            int x = 1 / 0; 
        } catch (ArithmeticException e) { 
            System.out.println("catch block — rethrowing"); 
            throw e;                            
        } finally { 
            System.out.println("finally block"); //  
        } 
        // "after" line is never reached 
    } 

    public static void main(String[] args) { 
        System.out.println("=== Case 1: No Exception ==="); 
        noException(); 
        System.out.println("\n=== Case 2: Exception Caught ==="); 
        exceptionCaught(); 
        System.out.println("\n=== Case 3: Exception Rethrown ==="); 
        try { 
            exceptionRethrown(); 
        } catch (ArithmeticException e) { 
            System.out.println("main caught rethrown: " + e.getMessage()); 
        } 
    } 
} 

 

 
