
public class Circle {
    double radius;
    static int numberCreated = 0;

    Circle() {
        radius = 1;
        numberCreated++;
    }

    Circle(double newRadius) {
        radius = newRadius;
        numberCreated++;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return Math.PI * radius * 2;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }

    static int getNumberCreated() {
        return numberCreated;
    }
}
