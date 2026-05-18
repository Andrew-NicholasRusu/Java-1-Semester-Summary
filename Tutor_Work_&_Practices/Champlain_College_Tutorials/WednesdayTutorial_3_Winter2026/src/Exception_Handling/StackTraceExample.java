package Exception_Handling;

/**
 * A stack trace shows the sequence of method calls that led to an exception.
 */

public class StackTraceExample {

    public static void methodA() {
        methodB();
    }

    public static void methodB() {
        methodC();
    }

    public static void methodC() {
        int[] arr = new int[5];
        // This will throw ArrayIndexOutOfBoundsException
        System.out.println(arr[5]);
    }

    public static void main(String[] args) {
        try {
            methodA();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught!");
            System.out.println("\n=== getMessage() ===");
            System.out.println(e.getMessage());

            System.out.println("\n=== printStackTrace() ===");
            e.printStackTrace();

            System.out.println("\n=== Custom stack trace using getStackTrace() ===");
            StackTraceElement[] elements = e.getStackTrace();
            for (StackTraceElement element : elements) {
                System.out.println("Class: " + element.getClassName());
                System.out.println("Method: " + element.getMethodName());
                System.out.println("File: " + element.getFileName());
                System.out.println("Line: " + element.getLineNumber());
                System.out.println("---");
            }
        }
    }
}


