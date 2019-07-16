
public class DemoCourse {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Game Development");

        course1.addStudent("Kim Smith");
        course1.addStudent("Peter Jones");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Sally Carter");

        System.out.printf("Number of students in course 1: %d\n", course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int student = 0; student < course1.getNumberOfStudents(); student++) {
            System.out.printf("  %s\n", students[student]);
        }

        System.out.printf("Number of students in course 2: %d\n", course2.getNumberOfStudents());
    }
}
