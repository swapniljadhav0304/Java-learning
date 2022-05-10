public class codetest {
    public static void main(String[] args) {
        Shape shape1= new Circle(10,10,7);
        Shape shape2=new rectangle(5,5);
        Shape shape3=new Tringle(7,5,3,7,3);

        System.out.println("The Area of circle:"+shape1.CalculateArea());
        System.out.println("The Area of rectangle:"+shape2.CalculateArea());
        System.out.println("The Area of triangle:"+shape3.CalculateArea());

    }
}
