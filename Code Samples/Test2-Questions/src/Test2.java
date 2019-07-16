import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        Animal[] pets = new Animal[3];
        pets[0] = new Animal();
        pets[1] = new Cat();
        pets[2] = new Dog();

        for (Animal pet : pets) {
            pet.move();
        }

        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(10);
        items.add(100);

        int[][] array1= {{1, 2}, {3, 4}};
        //int[][] array2= {1, 2};
        int[][] array3= {{1, 2}, {3, 4, 5}};
        //int[][] array4= {{1, 2; 3, 4}};
    }

    public static int[][] generateArray() {
        return new int[3][3];
    }
}

class Base {
    public void show() {
        System.out.println("Base::show() called");
    }
}

class Derived extends Base {
    public void show() {
        System.out.println("Derived::show() called");
    }
}

class Geometry {
    protected String color;
    public Geometry() {
        System.out.println("I'm not sure who I am, yet...");
    }
    public Geometry(String color) {
        this.color = color;
    }
}

class Circle extends Geometry {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
        System.out.println("I am a Circle!");
    }
}

class Parallelogram extends Geometry {
    public Parallelogram(String color) {
        super(color);
        System.out.printf("I'm a %s parallelogram\n", this.color);
    }
}

class Animal {
    public void move() {
        System.out.println("The animal moved");
    }
}

class Cat extends Animal {
    @Override public void move() {
        System.out.println("The cat pounces");
    }
}

class Dog extends Animal {
}
