import java.util.Scanner;

public class Print_1toN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = scanner.nextInt();
        print_1toN(a);
        System.out.println();
        print_Nto1(a);
    }

    static void print_1toN(int n) {
        if (n == 0) {
            return;
        }
        print_1toN(n - 1);
        System.out.print(n + " ");
    }

    static void print_Nto1(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        print_1toN(n - 1);
    }
}
