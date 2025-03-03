import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "hello world"; // Change this to test other strings
        Map<Character, Integer> frequencyMap = getCharacterFrequency(input);
        printCharacterFrequency(frequencyMap);
    }

    public static Map<Character, Integer> getCharacterFrequency(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        return frequencyMap;
    }

    public static void printCharacterFrequency(Map<Character, Integer> frequencyMap) {
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}
