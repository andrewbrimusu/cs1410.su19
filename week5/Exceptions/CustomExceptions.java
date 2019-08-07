import java.lang.Exception;

public class CustomExceptions {
    public static void main(String[] args) {

        try {
            Circle c1 = new Circle(1);
            //Circle c2 = new Circle(0);
            Circle c3 = new Circle(4);
            Circle c4 = new Circle(-3);
        }
        catch(InvalidRadiusException ex) {
            System.out.printf("Tried to create an invalid circle with a radius of %.2f\n", ex.getRadius());
            System.out.println("before");
            System.err.println(ex);
            System.out.println("after");
            
        }
        catch(Exception e) {
            System.err.println(e);
            
        }
        finally {
            System.out.println("Send an email");
        }
    }
}

class AndysFunRadiusException extends Exception {
    private double radius;

    public AndysFunRadiusException(double radius) {
        super("Invalid radius: " + radius);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }
}

class Circle {
    private double radius;

    public Circle(double radius) throws AndysFunRadiusException {
        if (radius <= 0) {
            throw new AndysFunRadiusException(radius);
        }
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
}