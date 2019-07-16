
public class DynamicBinding {
    public static void main(String[] args) {
        report(new GraduateStudent());
        report(new Student());
        report(new Person());
        report(new Object());
    }

    public static void report(Object o) {
        System.out.printf("The object is a %s\n", o.toString());
    }

    public static void report(GraduateStudent o) {
        System.out.printf("You called the GraduateStudent specific report function!\n");
    }
}

class Person extends Object {
    @Override
    public String toString() {
        return "Person";
    }
}

class Student extends Person {
    @Override
    public String toString() {
        return "Student";
    }
}

class GraduateStudent extends Student {
}
