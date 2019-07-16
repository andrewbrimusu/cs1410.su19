package ch8.Arrays2D;

public class RaggedArrays {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4,5},
                {2,3,4,5},
                {3,4,5},
                {4,5},
                {5}
        };

        int[][] matrix2 = {
                {1,2,3,4,5},
                {2,3,4,5,6},
                {3,4,5,6,7},
                {4,5,6,7,8},
                {5,6,7,8,9}
        };

        int rows = 5;
        int cols = 5;
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Ragged array...");
        for (int[] i : matrix) {
            for (int j : i) {
                System.out.print(j + " ");
                j = 0;
            }
            System.out.println();
        }

        System.out.println("Matrix after...");
        for (int[] i : matrix) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
