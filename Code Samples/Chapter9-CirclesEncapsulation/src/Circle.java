
public class Circle {
    private double radius;
    private static int numberCreated = 0;

    public Circle() {
        radius = 1;
        numberCreated++;
    }

    public Circle(double newRadius) {
        radius = newRadius;
        numberCreated++;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return Math.PI * radius * 2;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        if (newRadius > 0) {
            radius = newRadius;
        }
    }

    public double getDiameter() {
        return radius * 2;
    }

    public void setDiameter(double diameter) {
        if (diameter > 0) {
            radius = diameter / 2.0;
        }
    }

    public static int getNumberCreated() {
        return numberCreated;
    }
}
