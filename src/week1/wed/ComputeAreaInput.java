package week1.wed;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

public class ComputeAreaInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a circle radius: ");

        double radius = 0.0;
        try {
            radius = input.nextDouble();

        } catch (InputMismatchException e) {
            System.out.println("Exception thrown: " + e);
        } catch (Exception e) {
            System.out.println("Exception thrown: " + e);
        }
        double area = Math.pow(radius,2) * 3.14159;

        System.out.println("The area for the circle of radius " + radius + " is " + area);

        System.out.println("Mod: " + (2.2 % 2));
    }
}

