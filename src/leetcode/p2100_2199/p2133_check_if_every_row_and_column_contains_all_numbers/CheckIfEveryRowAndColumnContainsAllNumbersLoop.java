package leetcode.p2100_2199.p2133_check_if_every_row_and_column_contains_all_numbers;

public class CheckIfEveryRowAndColumnContainsAllNumbersLoop
        implements CheckIfEveryRowAndColumnContainsAllNumbers {
    @Override
    public boolean checkValid(int[][] matrix) {
        int len = matrix.length;
        for (int[] row: matrix) {
            boolean[] contains = new boolean[len + 1];
            for (int i: row) {
                contains[i] = true;
            }
            for (int i = 1; i < contains.length; i++) {
                if (!contains[i]) {
                    return false;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            boolean[] contains = new boolean[len + 1];
            for (int[] row: matrix) {
                contains[row[i]] = true;
            }
            for (int j = 1; j < contains.length; j++) {
                if (!contains[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
