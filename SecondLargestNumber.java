import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers separated by spaces: ");
        String input = scanner.nextLine();

        // Convert input string to an array of integers
        String[] inputArray = input.split(" ");
        int[] numbers = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            numbers[i] = Integer.parseInt(inputArray[i]);
        }

        // Find the second largest number
        int secondLargest = findSecondLargest(numbers);
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest number is: " + secondLargest);
        } else {
            System.out.println("There is no second largest number.");
        }
    }

    public static int findSecondLargest(int[] numbers) {
        if (numbers.length < 2) {
            return Integer.MIN_VALUE;
        }

        Arrays.sort(numbers);

        // Find the second largest number
        for (int i = numbers.length - 2; i >= 0; i--) {
            if (numbers[i] != numbers[numbers.length - 1]) {
                return numbers[i];
            }
        }

        return Integer.MIN_VALUE;
    }
}
