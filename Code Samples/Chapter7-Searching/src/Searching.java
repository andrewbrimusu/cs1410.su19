import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        int list[] = { 1, 1, 2, 3, 5, 8, 13, 21, 34, 53, 89 };

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value to search for: ");
        int search = input.nextInt();

        boolean foundLinear = linearSearch(list, search);
        boolean foundBinary = binarySearch(list, search);

        System.out.printf("%b %b\n", foundLinear, foundBinary);

    }

    public static boolean linearSearch(int[] array, int search) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                return true;
            }
        }

        return false;
    }

    public static boolean binarySearch(int[] array, int search) {
        int lower = 0;
        int upper = array.length - 1;
        boolean found = false;

        while (!found && lower <= upper) {
            int middle = (upper + lower) / 2;
            if (array[middle] == search) {
                found = true;
            }
            else if (array[middle] < search) {
                lower = middle + 1;
            }
            else {
                upper = middle - 1;
            }
        }

        return found;
    }
}
