package Exception_Handling;

public class Try_Catch_Finally {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {6, 36, 72}; // myNumbers == name of array
            System.out.println(myNumbers[60]); // will not work because 60 is not in the array
        } catch (Exception e) { // will run if it catches an exception
            System.out.println("Something went wrong.");
        } finally { // will always run
            System.out.println("Why did this happen?");
        }
    }
}