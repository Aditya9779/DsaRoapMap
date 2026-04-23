import java.util.Scanner;

public class DiamondStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int input = scanner.nextInt();

        /*
       See from this you need
       to observe if the start pattern is coming then
       three loop first and last one is same
       just need to print in the middle one
        */


        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < input - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * input - (2 * i + 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
