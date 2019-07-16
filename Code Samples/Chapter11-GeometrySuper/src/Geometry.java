public class Geometry {
    public static void main(String[] args) {

        Circle c1 = new Circle(1, "red", true);
        System.out.printf("The color of the circle is: %s\n", c1.getColor());
        System.out.printf("The radius of the circle is: %f\n", c1.getRadius());
        System.out.printf("The area of the circle is: %f\n", c1.getArea());
        System.out.printf("The perimeter of the circle is: %f\n", c1.getPerimeter());

        Rectangle r1 = new Rectangle(2, 4, "green", false);
        System.out.printf("The color of the rectangle is: %s\n", r1.getColor());
        System.out.printf("The area of the rectangle is: %f\n", r1.getArea());
        System.out.printf("The perimeter of the rectangle is: %f\n", r1.getPerimeter());

        System.out.println(c1.toString());
        System.out.println(r1.toString());

        report(c1);
        report(r1);
    }

    public static void report(GeometricObject object) {
        System.out.printf("Created on %s, Color is %s\n", object.getDateCreated(), object.getColor());
    }
}
