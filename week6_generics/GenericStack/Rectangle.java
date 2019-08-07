
public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle(double height, double width) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }
}
