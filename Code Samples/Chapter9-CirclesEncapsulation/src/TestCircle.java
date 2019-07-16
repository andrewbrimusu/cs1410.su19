
public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();

        System.out.printf("The area of the circle with radius of %f is %f\n", circle1.getRadius(), circle1.getArea());

        Circle circle2 = new Circle(22);
        System.out.printf("The area of the circle with radius of %f is %f\n", circle2.getRadius(), circle2.getArea());

        Circle circle3 = new Circle(122);
        System.out.printf("The area of the circle with radius of %f is %f\n", circle3.getRadius(), circle3.getArea());

        circle2.setRadius(4);
        System.out.printf("The area of the circle with radius of %f is %f\n", circle2.getRadius(), circle2.getArea());

        System.out.printf("There have been %d Circle instances created\n", circle1.getNumberCreated());
        System.out.printf("There have been %d Circle instances created\n", Circle.getNumberCreated());

        printCircle(circle1);
        printCircle(circle2);
        printCircle(circle3);
    }

    public static void printCircle(Circle circle) {
        System.out.printf("For a circle of radius %f\n", circle.getRadius());
        System.out.printf("\tDiameter is %f\n", circle.getDiameter());
        System.out.printf("\tArea is %f\n", circle.getArea());
        System.out.printf("\tPerimeter is %f\n", circle.getPerimeter());
        System.out.println();
    }
}

