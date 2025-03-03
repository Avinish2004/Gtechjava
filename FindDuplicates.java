import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 2, 6, 3, 7};

        Set<Integer> uniqueNumbers = new HashSet<>();
        Set<Integer> duplicateNumbers = new HashSet<>();

        for (int number : numbers) {
            if (!uniqueNumbers.add(number)) {
                duplicateNumbers.add(number);
            }
        }

        System.out.println("Duplicate elements: " + duplicateNumbers);
    }
}
