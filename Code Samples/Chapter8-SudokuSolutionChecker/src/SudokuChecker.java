public class SudokuChecker {
    public static void main(String[] args) {
        int[][] gridGood = {
                { 5, 3, 4, 6, 7, 8, 9, 1, 2 },
                { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
                { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
                { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
                { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
                { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
                { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
                { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
                { 3, 4, 5, 2, 8, 6, 1, 7, 9 }
        };

        int[][] gridBad = {
                { 5, 3, 4, 6, 7, 8, 9, 1, 2 },
                { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
                { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
                { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
                { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
                { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
                { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
                { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
                { 4, 3, 5, 2, 8, 6, 1, 7, 9 }   // Swap the first two numbers in this row from 'gridGood'
        };

        System.out.printf("'gridGood' is valid: %b\n", isValid(gridGood));
        System.out.printf("'gridBad' is valid: %b\n", isValid(gridBad));

    }

    public static boolean isValid(int[][] grid) {
        boolean rowsValid = true;
        boolean colsValid = true;
        boolean groupsValid = true;

        for (int part = 0; part < 9; part++) {
            rowsValid = rowsValid && isValidRow(grid[part]);
            colsValid = colsValid && isValidColumn(grid, part);
            groupsValid = groupsValid && isValidGroup(grid, part);
        }

        return rowsValid && colsValid && groupsValid;
    }

    public static boolean isValidRow(int[] row) {
        boolean[] values = new boolean[9];
        for (int value : row) {
            values[value - 1] = true;
        }
        return allUnique(values);
    }

    public static boolean isValidColumn(int[][] grid, int column) {
        boolean[] values = new boolean[9];
        for (int[] row : grid) {
            values[row[column] - 1] = true;
        }
        return allUnique(values);
    }

    public static boolean isValidGroup(int[][] grid, int group) {
        int rowStart = (group / 3) * 3;
        int colStart = (group % 3) * 3;
        boolean[] values = new boolean[9];

        for (int row = rowStart; row < rowStart + 3; row++) {
            for (int col = colStart; col < colStart + 3; col++) {
                values[grid[row][col] - 1] = true;
            }
        }

        return allUnique(values);
    }

    public static boolean allUnique(boolean[] values) {
        boolean unique = true;
        for (boolean value : values) {
            if (!value) {
                unique = false;
            }
        }
        return unique;
    }
}
