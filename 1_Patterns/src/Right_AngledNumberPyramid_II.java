import java.util.Scanner;

public class Right_AngledNumberPyramid_II {
    /*
    1
    22
    333
    4444
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int input = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
        scanner.close();
    }
}
