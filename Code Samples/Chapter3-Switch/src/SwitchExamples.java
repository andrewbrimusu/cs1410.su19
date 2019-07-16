import java.util.Scanner;

public class SwitchExamples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a day of the week (number 1 to 7): ");
        int dayOfWeek = input.nextInt();

        System.out.print("The name of the day is: ");
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        System.out.print("The kind of day is: ");
        switch (dayOfWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekday");
                break;
        }
    }
}