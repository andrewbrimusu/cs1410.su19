package ch3;


import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        double tuition = 3800;
        int grade = 0;

        System.out.println("Enter your grade as an int, and I'll tell you your tuition: ");
        Scanner input = new Scanner(System.in);
        grade = input.nextInt();

        switch (grade) {
            case 4:
                tuition = 0;
                break;
            case 3:
                tuition = tuition / 2;
                break;
            case 2:
                tuition = tuition * 0.9;
                break;
            case 1:
                tuition = tuition * 0.9;
                break;
            default:
                //leave tuition alone
                break;
        }
        System.out.println("Tuition is: " + tuition);
    }
}
