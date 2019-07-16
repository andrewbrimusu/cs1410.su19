package ch9.Classes;

class Bike {
    public String model;
    public String gears;
    private String color;

    public Bike() {
        model = "Trek";
    }

    public String getColor() { return color; }
    public void setColor(String col) { color = col;}
}

public class TestClass {
    public String name;
    public int age;
    public boolean isCSMajor;
    private char gender;

    public static void main(String[] args) {
        TestClass tc1 = new TestClass();
        System.out.println("tc1.name: " + tc1.name);
        System.out.println("age: " + tc1.age);
        System.out.println("isCSMajor: " + tc1.isCSMajor);
        System.out.println("gender: " + tc1.gender);

        Bike mybmx = new Bike();
        System.out.println("bike model: " + mybmx.model);
        System.out.println("bike color: " + mybmx.getColor());
    }
}
