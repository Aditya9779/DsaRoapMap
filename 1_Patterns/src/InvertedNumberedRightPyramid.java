import java.util.Scanner;

public class InvertedNumberedRightPyramid {
    /*
         1234
         123
         12
         1
         */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int input = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input - i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
        scanner.close();
    }
}
