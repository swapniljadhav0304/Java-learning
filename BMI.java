import com.sun.tools.javac.Main;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        float weight= 0f;
        float height=0f;
        System.out.println("Enter weight");
        Scanner scanner=new Scanner(System.in);
        weight =scanner.nextFloat();
        System.out.println("Enter Height");
    height=scanner.nextFloat();
        float bmi= weight/(height/height);

        System.out.println("BMI="+bmi);}
}
