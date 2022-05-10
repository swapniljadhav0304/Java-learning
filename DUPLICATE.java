public class DUPLICATE {
    public static void main(String[] args) {
        int[] myarray = new int[]{1, 2, 3, 3, 4, 5, 6, 7, 7, 8, 9};

        for (int i = 0; i < myarray.length; i++) {

            for (int j = i + 1; j < myarray.length; j++) {
                if (myarray[i] == myarray[j]) {
                    System.out.println(myarray[j]);
                }
            }

        }
    }
}