package ch8.Arrays2D;

public class Arrays2D {
    public static void main(String[] args) {
        int rows = 7;
        int cols = 7;
        double[][] cityDistances = {{0, 983, 787, 714, 1375, 967, 1087},
                {983, 0, 214, 1102, 1763, 1723, 1842},
                {787, 214, 0, 888, 1549, 1548, 1627},
                {714, 1102, 888, 0, 661, 781, 810},
                {1375, 1763, 1549, 661, 0, 1426, 1187},
                {967, 1723, 1548, 781, 1426, 0, 239},
                {1087, 1842, 1627, 810, 1187, 239, 0}};

        double sum = 0.0;
        for(int i=0; i < rows; i++) {
            for(int j=0; j < cols; j++) {
                sum += cityDistances[i][j];
            }
            System.out.println("Sum of row " + i + ": " + sum);
            sum = 0.0;
        }

        System.out.println("Sum of all city distances: " + sum);
        for(int i=0; i < rows; i++) {
            for(int j=0; j < cols; j++) {
                System.out.print(cityDistances[i][j] + " ");
            }
            System.out.println();
        }

        double[][] twod = {{1,2,3,4},
                {5,6,7,8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};


    }
}
