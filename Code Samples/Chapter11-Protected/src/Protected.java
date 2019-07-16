public class Protected {
    public static void main(String[] args) {
        Shape s = new Shape(2);
        Square sq = new Square();
        Triangle t = new Triangle();

        s.report();
        sq.report();
        t.report();
    }
}

class Shape {
    int sides;

    public Shape(int sides) {
        this.sides = sides;
    }

    public void report() {
        System.out.printf("This object has %d sides.\n", this.sides);
    }
}

class Square extends Shape {
    public Square() {
        super(4);
    }

    @Override
    public void report() {
        System.out.printf("A Square has %d sides.\n", this.sides);
    }
}

class Triangle extends Shape {
    public Triangle() {
        super(3);
    }

    @Override
    public void report() {
        System.out.printf("A Triangle has %d sides.\n", this.sides);
    }
}
