
public class ArrayMisc {
    public static void main(String[] args) {
        double[] myList = new double[10];

        for (int i = 0; i < myList.length; i++) {
            myList[i] = (int)(Math.random() * 100);
        }

        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.printf("The total of the array is %.2f\n", total);

        total = 0;
        for (double v : myList) {
            total += v;
        }
        System.out.printf("The total of the array is %.2f\n", total);

        int[] myList1 = { 1, 1, 2, 3, 5, 8, 13, 21 };
        int[] myList2 = new int[myList1.length];

        for (int i = 0; i < myList1.length; i++) {
            myList2[i] = myList1[1];
        }

        System.arraycopy(myList1, 0, myList2, 0, myList1.length);

        reportArray(myList);
        doubleArray(myList);
        reportArray(myList);
        double[] reversed = makeReverse(myList);
        reportArray(reversed);
    }

    public static void reportArray(double[] array) {
        double total = 0;
        System.out.printf("--- Array Elements (%d) ---\n", array.length);
        for (double v : array) {
            total += v;
            System.out.printf("  %6.2f\n", v);
        }
        System.out.println("---------");
        System.out.printf("%8.2f (total)\n", total);
    }

    public static void doubleArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }

    public static double[] makeReverse(double[] array) {
        double[] result = new double[array.length];

        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            result[j] = array[i];
        }

        return result;
    }
}
