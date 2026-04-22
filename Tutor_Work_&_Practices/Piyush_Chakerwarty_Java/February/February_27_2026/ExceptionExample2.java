public class ExceptionExample2 {
    public static void main(String[] args) {
        try { 
        int[] numbers = {1, 2, 3}; 
        System.out.println(numbers[5]); 
        System.out.println("Step A"); 
        } catch (ArrayIndexOutOfBoundsException e) { 
        System.out.println("Step B"); 
        } finally { 
        System.out.println("Step C"); 
        } 
    }
}
