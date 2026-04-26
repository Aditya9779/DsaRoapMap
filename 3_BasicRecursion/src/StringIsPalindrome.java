import java.util.Scanner;

public class StringIsPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of String : ");
        String a = scanner.next();
        System.out.println(palindrome(a, 0, a.length() - 1) ? "Palindrome" : "Not a Palindrome");
    }

    static boolean palindrome(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return palindrome(s, start + 1, end - 1);
    }
}
