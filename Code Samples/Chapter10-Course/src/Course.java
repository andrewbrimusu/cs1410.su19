
public class Course {
    private String name;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String name) {
        this.name = name;
        this.numberOfStudents = 0;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public void dropStudent(String student) {
        // ...left as exercise for the reader...
    }
}
