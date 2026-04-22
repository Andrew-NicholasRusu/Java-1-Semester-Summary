// Write a program to convert the amount from US Dollars (USD) to British Pounds (GBP).

import java.util.Scanner;

public class Structure_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int USDamount;
        System.out.println("Enter the amount in USD: ");
        USDamount = sc.nextInt();

        double GBP = USDamount * 0.78;
        System.out.println("Amount in GBP: " + GBP + "$");
    }
}