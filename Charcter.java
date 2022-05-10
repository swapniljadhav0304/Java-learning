import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class charcter {


    public static void main(String[] args) {

//        char k = 'x';
//        Character c = 'x';
//        System.out.print(c.isDigit('x'));


        Scanner scanner = new Scanner(System.in);
        char m = scanner.next().charAt(0);
        System.out.println("Ther ascii value"  + m);
        int n = scanner.next().charAt(0);
        System.out.println("Ther ascii value"  + n);
    }
}