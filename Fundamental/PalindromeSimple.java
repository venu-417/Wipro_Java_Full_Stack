import java.util.Scanner;

public class PalindromeSimple {

    public static String isPalindrome(String s) {
        s = s.toLowerCase(); 
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return "Not palindrome";
            }
            left++;
            right--;
        }
        return "Palindrome";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println(isPalindrome(input));

        scanner.close();
    }
}

