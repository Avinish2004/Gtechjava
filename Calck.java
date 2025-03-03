import java.util.Scanner;

public class Calck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for X: ");
        int X = scanner.nextInt();

        System.out.print("Enter value for Y: ");
        int Y = scanner.nextInt();

        if (X > Y) {
            int sum = X + Y;
            System.out.println("Sum of " + X + " and " + Y + " is: " + sum);
        } else if (X == Y) {
            int product = X * Y;
            System.out.println("Product of " + X + " and " + Y + " is: " + product);
        } else {
            int division1 = X / Y;
            int division2 = Y / X;
            int remainder = X % Y;
            System.out.println("Division of " + X + " by " + Y + " is: " + division1);
            System.out.println("Division of " + Y + " by " + X + " is: " + division2);
            System.out.println("Remainder when " + X + " is divided by " + Y + " is: " + remainder);
        }

        int expression = (X * Y) / (X + Y);
        System.out.println("The result of the expression (X * Y) / (X + Y) is: " + expression);

        scanner.close();
    }
}
