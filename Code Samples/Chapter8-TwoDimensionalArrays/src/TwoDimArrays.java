
public class TwoDimArrays {
    public static void main(String[] args) {

//        int[][] square = new int[5][5];
//
//        int fillValue = 1;
//        for (int[] row : square) {
//            java.util.Arrays.fill(row, fillValue++);
//            for (int element : row) {
//                System.out.printf("%d ", element);
//            }
//            System.out.println();
//        }
//
//        for (int row = 0; row < square.length; row++) {
//            for (int column = 0; column < square[row].length; column++) {
//                System.out.printf("%d ", square[row][column]);
//            }
//            System.out.println();
//        }

//        int[][] ragged = new int[5][];
//        ragged[0] = new int[5];
//        ragged[1] = new int[4];
//        ragged[2] = new int[3];
//        ragged[3] = new int[2];
//        ragged[4] = new int[1];
//
//        int fillValue = 1;
//        for (int[] row : ragged) {
//            java.util.Arrays.fill(row, fillValue++);
//            for (int element : row) {
//                System.out.printf("%d ", element);
//            }
//            System.out.println();
//        }

        int[][] square = {
            { 1, 1, 1, 1, 1 },
            { 2, 2, 2, 2, 2 },
            { 3, 3, 3, 3, 3 },
            { 4, 4, 4, 4, 4 },
            { 5, 5, 5, 5, 5 }
        };

        int[][] ragged = {
            { 1, 2, 3, 4, 5 },
            { 2, 3, 4, 5 },
            { 3, 4, 5 },
            { 4, 5 },
            { 5 }
        };

        System.out.printf("The sum of the square array is: %d\n", arraySum(square));
        System.out.printf("The sum of the ragged array is: %d\n", arraySum(ragged));

        int[][] myArray = createTriangularArray(6);
        printArray(myArray);
    }

    public static int arraySum(int[][] data) {
        int total = 0;

        for (int[] row : data) {
            for (int cell : row) {
                total += cell;
            }
        }

        return total;
    }

    public static int[][] createTriangularArray(int rows) {
        int result[][] = new int[rows][];

        for (int row = 0; row < rows; row++) {
            result[row] = new int[rows - row];
            for (int cell = 0; cell < (rows - row); cell++) {
                result[row][cell] = row + 1;
            }
        }

        return result;
    }

    public static void printArray(int data[][]) {
        for (int[] row : data) {
            for (int cell : row) {
                System.out.printf("%d ", cell);
            }
            System.out.println();
        }
    }
}
