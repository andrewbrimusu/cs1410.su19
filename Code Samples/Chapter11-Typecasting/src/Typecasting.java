
public class Typecasting {
    public static void main(String[] args) {
        Object o = new Student("Sally");
        Student s = (Student)o;

        s = (NotStudent)o;

    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }
}

class NotStudent {
    private String name;

    public NotStudent(String name) {
        this.name = name;
    }
}
