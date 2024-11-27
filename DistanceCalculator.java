import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        double initialVelkmh= 36;
        double acl = 5;       
         double initialVelMps = (initialVelkmh * 1000) / 3600;

        System.out.print("Enter the first time interval (in seconds): ");
        int time1 = scanner.nextInt();
        System.out.print("Enter the second time interval (in seconds): ");
        int time2 = scanner.nextInt();

        // Calculate distances using the formula s = ut + (1/2)at^2
        double distance1 = initialVelMps * time1 + (acl* time1 * time1) / 2;
        double distance2 = initialVelMps * time2 + (acl * time2 * time2) / 2;

   
        System.out.println((int) distance1);
        System.out.println((int) distance2);

        
    }
}