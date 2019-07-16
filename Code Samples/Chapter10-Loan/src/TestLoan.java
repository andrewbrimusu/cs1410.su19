import java.util.Scanner;

public class TestLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        int numberOfYears = input.nextInt();

        System.out.print("Enter loan amount: ");
        double loanAmount = input.nextDouble();

        Loan myLoan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.println();
        System.out.printf("The loan was created on   : %s\n", myLoan.getLoanDate());
        System.out.printf("  Monthly Payment         : %.2f\n", myLoan.getMonthyPayment());
        System.out.printf("  Total Payment           : %.2f\n", myLoan.getTotalPayment());
    }
}
