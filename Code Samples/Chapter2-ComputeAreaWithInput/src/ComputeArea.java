import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a circle radius: ");

        double radius = input.nextDouble();
        double area = radius * radius * 3.14159;

        System.out.println("The area for the circle of radius " + radius + " is " + area);

        System.out.println("Mod: " + (2.2 % 2));
    }
}
