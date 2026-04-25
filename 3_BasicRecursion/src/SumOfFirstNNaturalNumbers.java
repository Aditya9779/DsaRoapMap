import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = scanner.nextInt();
        System.out.println(sumOfFirstNNaturalNumbers(a));
    }

    static int sumOfFirstNNaturalNumbers(int a) {
        if (a == 0 || a == 1) return a;
        int sum = sumOfFirstNNaturalNumbers(a - 1);
        return a + sum;
    }

}

