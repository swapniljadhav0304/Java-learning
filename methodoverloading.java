public class methodoverloading {
        public static void main(String[] args) {
//
            int result1 = Sumoftwonumbers(100,700);
            double result2= Sumoftwonumbers(2.3,4.6,6.9,5.6);
            System.out.println(result1);
            System.out.println(result2);

        }//end of method
       // new method 1
       public static int Sumoftwonumbers(int x, int y) {
            int result = x + y;
            return result;
        }
       //mothod 2
        public static double Sumoftwonumbers (double a,double b,double c ) {
            double result = a + b + c;
            return result;
        }
        //method 3
    public static double Sumoftwonumbers (double a,double b,double c,double d ) {
        double result = a + b + c + d;
        return result;
        }









    }//end of class

