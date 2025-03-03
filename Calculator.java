import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (X): ");
        int X = scanner.nextInt();

        System.out.print("Enter the second number (Y): ");
        int Y = scanner.nextInt();

        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Division (X by Y)");
        System.out.println("4. Division (Y by X)");
        System.out.println("5. Remainder (X divided by Y)");
        System.out.println("6. Expression (X * Y) / (X + Y)");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                int sum = X + Y;
                System.out.println("Sum of " + X + " and " + Y + " is " + sum);
                break;
            case 2:
                int prod = X * Y;
                System.out.println("Product of " + X + " and " + Y + " is " + prod);
                break;
            case 3:
                int div = X / Y;
                System.out.println("Division of " + X + " by " + Y + " is " + div);
                break;
            case 4:
                int div1 = Y / X;
                System.out.println("Division of " + Y + " by " + X + " is " + div1);
                break;
            case 5:
                int div2 = X % Y;
                System.out.println("Remainder of " + X + " divided by " + Y + " is " + div2);
                break;
            case 6:
                int exp = (X * Y) / (X + Y);
                System.out.println("Expression (X * Y) / (X + Y) is " + exp);
                break;
            default:
                System.out.println("Invalid choice. Please select a valid operation.");
        }

        scanner.close();
    }
}
