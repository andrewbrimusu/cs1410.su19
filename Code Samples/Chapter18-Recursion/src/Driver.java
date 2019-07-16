
public class Driver {
    static long count = 0;
    public static void main(String[] args) {
        System.out.printf("The factorial of 0 is %d\n", factorial(0));
        System.out.printf("The factorial of 1 is %d\n", factorial(1));
        System.out.printf("The factorial of 2 is %d\n", factorial(2));
        System.out.printf("The factorial of 3 is %d\n", factorial(3));
        System.out.printf("The factorial of 4 is %d\n", factorial(4));
        System.out.printf("The factorial of 5 is %d\n", factorial(5));
        System.out.printf("The factorial of 6 is %d\n", factorial(6));

        System.out.println();

//        System.out.printf("The fibonacci of 0 is: %d\n", fib(0));
//        System.out.printf("The fibonacci of 1 is: %d\n", fib(1));
//        System.out.printf("The fibonacci of 2 is: %d\n", fib(2));
//        System.out.printf("The fibonacci of 3 is: %d\n", fib(3));
//        System.out.printf("The fibonacci of 4 is: %d\n", fib(4));
//        System.out.printf("The fibonacci of 5 is: %d\n", fib(5));
//        System.out.printf("The fibonacci of 6 is: %d\n", fib(6));
//        System.out.printf("The fibonacci of 7 is: %d\n", fib(7));
//        System.out.printf("The fibonacci of 8 is: %d\n", fib(8));
//        System.out.printf("The fibonacci of 9 is: %d\n", fib(9));
//        System.out.printf("The fibonacci of 10 is: %d\n", fib(10));
        //System.out.printf("The fibonacci of 40 is: %d, and took %d recursive calls.\n", fib(40), count);

        int[] sortMe = {13, 33, 92, 51, 31, 10, 31, 59, 3, 43, 84, 95, 68, 70, 75, 33, 100, 7, 33, 11 };
        selectionSort(sortMe, 0, sortMe.length - 1);
        for (int value : sortMe) {
            System.out.printf("%d, ", value);
        }
        System.out.println();

        if (binarySearch(sortMe, 43)) {
            System.out.println("The value of 43 was found");
        }
        else {
            System.out.println("The value of 43 was not found");
        }

        if (binarySearch(sortMe, 42)) {
            System.out.println("The value of 42 was found");
        }
        else {
            System.out.println("The value of 42 was not found");
        }

        System.out.println("--- Tail-Call Factorial ---");
        System.out.printf("The factorial of 0 is %d\n", factorialTail(0));
        System.out.printf("The factorial of 1 is %d\n", factorialTail(1));
        System.out.printf("The factorial of 2 is %d\n", factorialTail(2));
        System.out.printf("The factorial of 3 is %d\n", factorialTail(3));
        System.out.printf("The factorial of 4 is %d\n", factorialTail(4));
        System.out.printf("The factorial of 5 is %d\n", factorialTail(5));
        System.out.printf("The factorial of 6 is %d\n", factorialTail(6));

        System.out.println();

        int[] sortMe2 = {13, 33, 92, 51, 31, 10, 31, 59, 3, 43, 84, 95, 68, 70, 75, 33, 100, 7, 33, 11 };
        quickSort(sortMe2, 0, sortMe.length - 1);
        for (int value : sortMe2) {
            System.out.printf("%d, ", value);
        }
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }

    public static long factorialTail(int n) {
        return factorialTail(n, 1);
    }

    public static long factorialTail(int n, int result) {
        if (n == 0) {
            return result;
        }
        return factorialTail(n - 1, n * result);
    }

    public static long fib(long n) {
        count++;
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void selectionSort(int[] data, int low, int high) {
        if (low < high) {
            int minPos = low;
            for (int scan = low + 1; scan <= high; scan++) {
                if (data[scan] < data[minPos]) {
                    minPos = scan;
                }
            }

            int temp = data[low];
            data[low] = data[minPos];
            data[minPos] = temp;

            selectionSort(data, low + 1, high);
        }
    }

    public static boolean binarySearch(int[] data, int search) {
        return binarySearch(data, 0, data.length - 1, search);
    }

    public static boolean binarySearch(int[] data, int low, int high, int search) {
        if (low > high) return false;

        int middle = (low + high) / 2;
        if (data[middle] == search) {
            return true;
        }
        else if (data[middle] < search) {
            return binarySearch(data, middle + 1, high, search);
        }
        else {
            return binarySearch(data, low, middle - 1, search);
        }
    }

    public static void quickSort(int[] data, int start, int end) {
        if (start < end) {
            int pivot = partition(data, start, end);
            quickSort(data, start, pivot - 1);
            quickSort(data, pivot + 1, end);
        }
    }

    public static int partition(int[] data, int start, int end) {
        int middle = (start + end) / 2;
        int temp = data[start];     // Swap start and middle values
        data[start] = data[middle];
        data[middle] = temp;

        int index = start;
        int pivotValue = data[start];

        for (int scan = start + 1; scan <= end; scan++) {
            if (data[scan] < pivotValue) {
                index++;
                temp = data[index];
                data[index] = data[scan];
                data[scan] = temp;
            }
        }

        temp = data[start];
        data[start] = data[index];
        data[index] = temp;

        return index;
    }
}
