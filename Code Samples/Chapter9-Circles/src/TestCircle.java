
public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();

        System.out.printf("The area of the circle with radius of %f is %f\n", circle1.radius, circle1.getArea());

        Circle circle2 = new Circle(22);
        System.out.printf("The area of the circle with radius of %f is %f\n", circle2.radius, circle2.getArea());

        Circle circle3 = new Circle(122);
        System.out.printf("The area of the circle with radius of %f is %f\n", circle3.radius, circle3.getArea());

        circle2.setRadius(4);
        System.out.printf("The area of the circle with radius of %f is %f\n", circle2.radius, circle2.getArea());

        System.out.printf("There have been %d Circle instances created\n", circle1.getNumberCreated());
        System.out.printf("There have been %d Circle instances created\n", Circle.getNumberCreated());
    }
}

