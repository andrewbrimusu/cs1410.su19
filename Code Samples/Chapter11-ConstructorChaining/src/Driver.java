public class Driver {
    public static void main(String[] args) {
        Faculty me = new Faculty();
        Faculty you = new Faculty("abc");
    }
}

class Person {
    public Person() {
        System.out.println("(1) Performs Person things");
    }
}

class Employee extends Person {
    public Employee() {
        System.out.println("(2) Performs Employee things");
    }

    public Employee(String msg) {
        System.out.println("(2) Performs Employee things with a message: " + msg);
    }
}

class Faculty extends Employee {
    public Faculty() {
        System.out.println("(3) Performs Faculty things");
    }

    public Faculty(String msg) {
        super(msg);
        System.out.println("(3) Performs Faculty things with a message: " + msg);
    }
}
