import java.util.Scanner;

public class CirclePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double perimeter = 2 * Math.PI * radius;

        
        System.out.printf("The perimeter (circumference) of the circle is: %.2f units%n", perimeter);

        
        scanner.close();
    }
}
