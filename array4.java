public class array4 {
    public static void main(String[] args) {

        int [] my_array= {25,14,56,99,55,63};

        int removingIndex =1;
        for (int i=removingIndex;i<my_array.length-1; i++)
        {
           my_array[i]=my_array[i+1];

        }
        for (int i=0;i<my_array.length;i++) System.out.println(my_array[i]);

    }

}
