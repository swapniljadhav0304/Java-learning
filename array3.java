import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        System.out.print("Enter the 10 numbers");
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        double average = 0d;
        for (int e : array) {
            sum = sum + e;
        }
        average = sum / array.length;

        System.out.println("The Average is =" + average);

    }
}