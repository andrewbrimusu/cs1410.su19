
public class Sorting {
    public static void main(String[] args) {
        int myData[] = { 10, 1, 9, 2, 8, 3, 7, 4, 6, 5 };

        //selectionSort(myData);

        java.util.Arrays.parallelSort(myData);

        for (int value : myData) {
            System.out.println(value);
        }

        System.out.println("Index of 3 is: " + java.util.Arrays.binarySearch(myData, 22));

        System.out.println(java.util.Arrays.toString(myData));
    }

    public static void bubbleSort(int data[]) {
        boolean didSwap = false;

        do {
            didSwap = false;
            for (int item = 0; item < (data.length - 1); item++) {
                if (data[item] > data[item + 1]) {
                    int temp = data[item];
                    data[item] = data[item + 1];
                    data[item + 1] = temp;
                    didSwap = true;
                }
            }
        } while (didSwap);
    }

    public static void selectionSort(int data[]) {
        for (int start = 0; start < (data.length - 1); start++) {
            int minPos = start;
            for (int scan = start + 1; scan < data.length; scan++) {
                if (data[scan] < data[minPos]) {
                    minPos = scan;
                }
            }
            int temp = data[start];
            data[start] = data[minPos];
            data[minPos] = temp;
        }
    }
}
