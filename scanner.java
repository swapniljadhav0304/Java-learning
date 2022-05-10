import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner Userentry = new Scanner(System.in);
        int number, number2;
        System.out.print("Enter first number");
        number = Userentry.nextInt();
        System.out.print("Enter first number");
        number2 = Userentry.nextInt();
        if (number > number2)
        System.out.print("number1 is greater than number2 ");
        else if (number < number2)
            System.out.print("NUmber1 is smaller than number 2");
        else
            System.out.print("number is equal");

    }
}