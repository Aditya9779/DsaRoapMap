import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = scanner.nextInt();
        fibonacciSeriesRecursive(a, 0, 1);
        System.out.println();
        fibonacciSeriesBrute(a, 0, 1);
    }

    static void fibonacciSeriesRecursive(int n, int x, int y) {
        if (n == 0) return;
        System.out.print(x + " ");
        fibonacciSeriesRecursive(n - 1, y, x + y);
    }

    static void fibonacciSeriesBrute(int n, int x, int y) {
        for (int i = 0; i < n; i++) {
            System.out.print(x + " ");
            int z = x + y;
            x = y;
            y = z;
        }

    }


}
