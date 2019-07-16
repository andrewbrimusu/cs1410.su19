public class UnitTestMe {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter a number to test: ");
        double value = input.nextDouble();
        System.out.printf("The value %f is positive: %b\n", value, isPositive(value));
        System.out.printf("The value %f is a whole number: %b\n", value, isWhole(value));

    }

    public static boolean isPositive(double value) {
        return value >= 0;
    }

    public static boolean isWhole(double value) {
        double wholePart = Math.floor(value);
        return wholePart == value;
    }
}
