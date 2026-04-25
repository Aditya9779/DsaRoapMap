import java.util.Scanner;

public class PrintNameNTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = scanner.nextInt();
        printNTimes(a);
    }

    static void printNTimes(int n) {
        if (n == 0) return; //base condition
        System.out.println("Aditya"); // do the logic
        printNTimes(--n);// set the values for the next stack recursive call
    }
}
