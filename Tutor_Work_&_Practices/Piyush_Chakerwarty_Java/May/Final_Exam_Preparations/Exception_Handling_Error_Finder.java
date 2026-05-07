
import java.util.InputMismatchException;


public class Exception_Handling_Error_Finder {

    public static void main(String[] args) {
        int number = 0;
        String str = "abc";

    /**1. Find the error in the following code segments.*/

    // try  {
    //       number = Integer.parseInt(str);
    //  } catch (Exception e) {
    //         System.out.println(e.getMessage());
    //         } catch (IllegalArgumentException e) {
    //         System.out.println("Bad number format.");
    //  }

    //  catch (NumberFormatException e) {
    //         System.out.println(str + " is not a number.");
    // }

    /**Answer: Error order of excpetion handling (Should be NumberFormatException, IllegalArgumentException, and Exception at the end.)*/

    // Right way to code:
    try {
        number = Integer.parseInt(str);
    } catch (NumberFormatException e) {
        System.out.println(str + " is not a number.");
    } catch (IllegalArgumentException e) {
        System.out.println("Bad number format.");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }

    /**2. Find the error in the following code segments.*/
    // try  {
    // input = inputFile.nextInt();
    //  } finally  {
    //  inputFile.close();
    //  } catch (InputMismatchException e)  {
    //         System.out.println(e.getMessage());
    //   }

    /**Answer: Error order of excpetion handling (Should be NumberFormatException, IllegalArgumentException, and Exception at the end.)*/

    // Right way to code:
    try {
        input = inputFile.nextInt();
    } catch (InputMismatchException e) {
        System.out.println(e.getMessage());
    } finally {
        inputFile.close();
    }


    /**3. Find the error in the following code segments.*/
    // catch (FileNotFoundException e)  {
    // System.out.println("File not found.");
    //  } try {
    // File file = new File("MyFile.txt");
    // Scanner inputFile = new Scanner(file);
    //  }


    }
}

