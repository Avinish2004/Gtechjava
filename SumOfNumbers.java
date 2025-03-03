import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= limit; i++) {
            sum += i;
        }
        
        System.out.println("The sum of numbers from 1 to " + limit + " is " + sum + ".");
        
        scanner.close();
    }
}
