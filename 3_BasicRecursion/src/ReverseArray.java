import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int a = scanner.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < a; i++) {
            array[i] = scanner.nextInt();
        }
        reverse(array, 0, array.length - 1);
        for (int x : array) {
            System.out.print(x + " ");
        }

    }

    static void reverse(int[] array, int start, int end) {
        if (start >= end) return;
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        reverse(array, start + 1, end - 1);
    }
}
