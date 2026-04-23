import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        int a = scanner.nextInt();
        System.out.print(" and Second ");
        int b = scanner.nextInt();
        System.out.println("The GCD of this " + a + "," + b + " two number is " + gcd(a, b));
    }

    static int gcd(int a, int b) {
        //Euclidean Algorithm
        //Simple like just divide the number and take the remainder do until they are
        //greater than zero
        while (a > 0 && b > 0) {
            if (a > b) a = a % b;
            else b = b % a;
            if (a == 0) return b;
        }
        return a;
    }
}
