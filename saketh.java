import java.util.Scanner;

public class saketh {

    public static boolean isPalindrome(String str) {
        // Remove spaces and punctuation from the string
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Check if the string is a palindrome
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // Palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word or phrase:");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The input is a palindrome.");
        } else {
            System.out.println("The input is not a palindrome.");
        }

        scanner.close();
    }
}