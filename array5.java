public class array5 {
    public static void main(String[] args) {
        int [] my_array= {25,67,89,12,34,45};
        int indextoinsert= 1;
        for(int i= my_array.length-1;i>indextoinsert;i--)

        {  my_array [i]=my_array[i-1];}
        my_array[indextoinsert]=99;
      for (int i=0;i<my_array.length;i++)
      {
        System.out.println(my_array[i]);}
    }

}