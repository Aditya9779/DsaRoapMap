import java.util.Scanner;

public class CountDigitsInNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int input = scanner.nextInt();
        System.out.println("This number " + input + " contains " + countNum(input) + " digits");
    }

    public static int countNum(int input) {
        int count = 0;
        while (input > 0) {
            input /= 10;
            count++;
        }
        return count;
    }
}
