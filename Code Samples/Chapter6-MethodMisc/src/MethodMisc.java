
public class MethodMisc {

    public static void main(String[] args) {

        System.out.printf("The total from 6 to 18 is %d\n", sum(6, 18));

        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.printf("The value of a is %d, the value of b is %d\n", a, b);

        b = swap2(a, a = b);
        System.out.printf("The value of a is %d, the value of b is %d\n", a, b);
    }

    public static int sum(int start, int end) {
        int total = 0;
        for (int current = start; current <= end; current++) {
            total += current;
        }

        return total;
    }

    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }

    public static int swap2(int x, int y) {
        return x;
    }

    public static int max(int x, int y) {
        if (x > y) return x;

        return y;
    }

    public static double max(double x, double y) {
        if (x > y) return x;

        return y;
    }

    public static double max(double x, double y, double z) {
        return max(max(x, y), z);
    }

}
