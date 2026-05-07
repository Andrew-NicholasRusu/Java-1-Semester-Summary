public class Name_Repeat {
    public static void repeat(String message, int n){ 
        if(n <= 0) { 
            return;
        } 
        System.out.println(message);
        repeat(message, n - 1); // n - 1 allows to subtract 5 by 1 so it can run 5 times.
    } 

    public static void main(String[] args) { 
        int numberOfTimes = 5; 
        repeat("Andrew", numberOfTimes);
    } 
}
