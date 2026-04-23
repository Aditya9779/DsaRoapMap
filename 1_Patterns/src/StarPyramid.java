import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int input = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            //left spacing
            for (int j = 0; j < input - i - 1; j++) {
                System.out.print(" ");
            }
            //printing stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            //right spacing
            for (int j = 0; j < input - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        scanner.close();

    }
}
