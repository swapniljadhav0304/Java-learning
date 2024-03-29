public class rectangle implements Shape {

    double width;
    double height;

    public rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double CalculateArea() {
        return height*width;
    }

    @Override
    public double CalculatePerimeter() {
        return 2*(height+width);
    }
}
