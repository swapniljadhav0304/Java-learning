import java.util.Scanner;

public class addingnumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println( "Enter the number ");
        int x= scanner.nextInt();

        int sum = 0 ;
        while (x !=0) {
            sum = sum+ x%10;
            x= x/10;
        }
        System.out.print(sum); }
}
