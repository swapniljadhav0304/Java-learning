import org.w3c.dom.ls.LSOutput;

public class array6 {
    public static void main(String[] args) {

        int[] my_array = {25, 14, 15, 56, 144};
        int min_max = my_array[2];
        for (int i = 2; i < my_array.length; i++) {
            if (my_array[i] > min_max) {
                min_max = my_array[i];
                System.out.println("min of the numbers is " + min_max);

            }

        }

    }
}