package ch6;

public class SummingNumbers {

    public static int sumNumbers(int num1, int num2) {
        int sum = 0;
        for (int i=num1; i<=num2; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println("sum: " + sumNumbers(1,10));

        System.out.println("sum: " + sumNumbers(20,30));

        System.out.println("sum: " + sumNumbers(35,45));

    }

}
