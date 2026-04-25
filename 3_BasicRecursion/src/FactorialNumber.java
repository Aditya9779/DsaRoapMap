import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = scanner.nextInt();
        System.out.println(factorialNumber(a));
    }

    static int factorialNumber(int n) {
        if (n == 0 || n == 1) return 1;
        int fac = factorialNumber(n - 1);
        return n * fac;
    }
}
