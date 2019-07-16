public class Test1Questions {
    public static void main(String[] args) {

        int max = 0;
        doubleMax(1, 2, max);
        System.out.println(max);
    }

    public static void doubleMax(int value1, int value2, int max) {
        if (value1 > value2) {
            max = value1;
        }
        else {
            max = value2;
        }
        max *= 2;
    }

    public static void arrayDecls() {
        int[] myArray = new int[4];
        int[] myArray2 = { 1, 2, 3, 4 };
        int[][] myArray3 = new int[4][4];
        int[][] myArray4 = new int[4][];

        int[] myArray5 = int[5];
        int[] myArray6 = [5];
        int[4] myArray7 = new int[];
        int myArray8 = new int[4][4];
        int myArray9 = { 1, 2, 3, 4 };
    }
}
