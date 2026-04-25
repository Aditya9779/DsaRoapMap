import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = scanner.nextInt();
        System.out.println(armstrongNumber(a) ? "ArmstrongNumber" : "Not a ArmstrongNumber");
    }

    static boolean armstrongNumber(int number) {
        if (number < 10) return false;
        int temp = number, count = 0, sum = 0, rem = 0;
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        temp = number;
        while (temp > 0) {
            rem = temp % 10;
            sum += (int) Math.pow(rem, count);
            temp /= 10;
        }
        return sum == number;
    }
}
