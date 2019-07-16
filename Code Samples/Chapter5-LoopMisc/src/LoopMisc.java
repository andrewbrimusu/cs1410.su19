import java.util.Scanner;

public class LoopMisc {
    public static void main(String[] args) {

//        int count = 0;
//        while (count < 10) {
//            System.out.println("Welcome to Java!");
//            count++;
//        }
//
//        System.out.println("You will enjoy it");

//        Scanner input = new Scanner(System.in);
//        double userInput = 0;
//        double sum = 0;
//
//        do {
//            System.out.print("Enter a value to add to the sum (0 to end input): ");
//            userInput = input.nextDouble();
//            sum += userInput;
//        } while (userInput != 0);
//
//        System.out.printf("The sum of the values entered is %4.2f\n", sum);

//        for (int i = 0; i < 10; i++) {
//            System.out.println("Welcome to Java!");
//        }
//
//        System.out.println("You will enjoy it");

        //
        // GCD - While Loop
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the first integer: ");
//        int n1 = input.nextInt();
//        System.out.print("Enter the second integer: ");
//        int n2 = input.nextInt();
//
//        int gcd = 1;    // Initial guess
//        int k = 2;      // possible gcd
//        while (k <= n1 && k <= n2) {
//            if (n1 % k == 0 && n2 % k == 0) {
//                gcd = k;    // Update gcd
//            }
//            k++;
//        }
//
//        System.out.printf("The greatest common divisor for %d and %d is %d", n1, n2, gcd);

        //
        // GCD - For Loop
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        int n2 = input.nextInt();

        int gcd = 1;    // Initial guess
        for (int k = 2; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;    // Update gcd
            }
            k++;
        }

        System.out.printf("The greatest common divisor for %d and %d is %d", n1, n2, gcd);
    }
}
