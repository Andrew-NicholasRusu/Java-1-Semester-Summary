import java.util.Scanner;

public class StatementHomework_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int kilometres;
        System.out.println("Accept the kilometres covered.");
        kilometres = sc.nextInt();

        if (kilometres >= 0 && kilometres <= 10) {
            int RS = kilometres * 11;
            System.out.println("Amount payable = $" + RS); 
        } else if (kilometres >= 10 && kilometres <= 100) {
            int RS = ((kilometres - 10) * 10) + 110;  // 10 kms
            System.out.println("Amount payable = $" + RS);            
        } else if (kilometres > 100) {
            int RS = ((kilometres - 100) * 9) + 110 + 900; // 90kms
            System.out.println("Amount payable = $" + RS);
        }
    }
}