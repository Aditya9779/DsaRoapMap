import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int input = scanner.nextInt();
        System.out.println("This is the PalindromeNumber " + palindrome(input));
    }

    static boolean palindrome(int input) {
        int store = input, sum = 0;
        while (input > 0) {
            int digit = input % 10;
            sum = sum * 10 + digit;
            input /= 10;
        }
        return store == sum;
    }
}
