import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int r = quotient2(number1, number2);
        System.out.printf("%d / %d = %d\n", number1, number2, r);

//        try {
//            System.out.print("Enter two integers: ");
//            int number1 = input.nextInt();
//            int number2 = input.nextInt();
//
//            try {
//                quotient2(number1, number2);
//            } catch (ArithmeticException ex) {
//                System.out.printf("Exception caught: %s\n", ex.getMessage());
//            }
//        }
//        catch (InputMismatchException ex) {
//            System.out.println("Input values must be integers");
//        }
    }

    public static void divideExample() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        System.out.printf("%d / %d = %d\n", number1, number2, number1 / number2);
    }

    public static void divideExample2() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        if (number2 != 0) {
            System.out.printf("%d / %d = %d\n", number1, number2, number1 / number2);
        }
        else {
            System.out.println("Divisor cannot be 0");
        }
    }

    public static int quotient(int x, int y) {
        if (y != 0) {
            return x / y;
        }
        else {
            return 0; // This isn't actually a good result to return
        }
    }

    public static int quotient2(int x, int y) throws ArithmeticException {
        if (y != 0) {
            return x / y;
        }
        else {
            throw new ArithmeticException("Divisor cannot be 0");
        }
    }
}
