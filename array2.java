import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {

        System.out.print("Enter the Digits");
        Scanner scanner =new Scanner(System.in);
        int[] my_array =new int[10];  //initatlization of array
        for (int i=0;i< my_array.length;i++)
        {
         my_array[i]= scanner.nextInt();
        }
        int sum=0;
        for(int i:my_array)
        {
            sum=sum+i;
        }
        System.out.println(sum);

    }
}
