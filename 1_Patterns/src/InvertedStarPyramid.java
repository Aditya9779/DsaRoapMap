import java.util.Scanner;

public class InvertedStarPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int input = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            //Left space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //Printing Stars
            for (int j = 0; j < 2 * input - (2 * i + 1); j++) {
                System.out.print("*");
            }
            //Right Space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
