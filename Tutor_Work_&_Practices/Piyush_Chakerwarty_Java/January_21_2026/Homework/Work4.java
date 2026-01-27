import java.util.Scanner;

public class Work4 {
    public void main (String [] args) {
        double PI = 3.14;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the radius of the cone:");
            int radius1 = sc.nextInt();
            System.out.println("Enter the height of the cone:");
            int height1 = sc.nextInt();
            double volume1 = (PI * radius1 * radius1 * height1) / 3.0;
            System.out.println("Volume of Cone: " + volume1);

            System.out.println("Enter the radius of the cylinder:");
            int radius2 = sc.nextInt();
            System.out.println("Enter the height of the cylinder:");
            int height2 = sc.nextInt();
            double volume2 = PI * (radius2 * radius2) * height2;
            System.out.println("Volume of Cylinder: " + volume2);
        
    }
}