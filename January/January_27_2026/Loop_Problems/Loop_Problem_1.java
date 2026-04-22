// Using a loop, how can you find the factors of 12?
public class Loop_Problem_1 {
    public static void main(String[] args) {
        int number = 12; // Used to find the factors of 12
        for (int i = 1; i <= number; i++) { 
            // i = 1 because we cannot divide any number by 0. 
            if (number % i == 0) {
                System.out.println(i);
                // It is not println(number) because it is a number.
            }
        }
    }
}