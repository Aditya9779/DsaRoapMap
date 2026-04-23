import java.util.Scanner;

public class ReverseDigitsNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int input = scanner.nextInt();
        System.out.println("The reverse of this number  " + input + " is this " + revNum(input));
    }

    static int revNum(int input) {
        int sum = 0;
        while (input > 0) {
            int digit = input % 10;
            sum = sum * 10 + digit;
            input /= 10;
        }
        return sum;
    }
}
