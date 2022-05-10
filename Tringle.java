public class Tringle implements Shape {

    double height;
    double width;
    double a;
    double b;
    double c;

    public Tringle(double height, double width, double a, double b, double c) {
        this.height = height;
        this.width = width;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double CalculateArea() {
        return height*width/2;
    }

    @Override
    public double CalculatePerimeter() {
        return a+b+c;
    }
}
