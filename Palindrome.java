public class Palindrome {
    public static void main(String[] args) {
        String input = "madam"; // Change this to test other strings
        boolean isPalindrome = isPalindrome(input);
        System.out.println("Is \"" + input + "\" a palindrome? " + isPalindrome);
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
