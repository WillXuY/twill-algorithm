package leetcode.p2300_2399.p2373_largest_local_values_in_matrix;

public class LargestLocalValuesInMatrixLoop
        implements LargestLocalValuesInMatrix {
    @Override
    public int[][] largestLocal(int[][] grid) {
        int len = grid.length;
        int outputLen = len - 2;
        int[][] row = new int[len][outputLen];
        for (int r = 0; r < len; r++) {
            for (int c = 0; c < outputLen; c++) {
                int max = Math.max(grid[r][c], grid[r][c + 1]);
                row[r][c] = Math.max(grid[r][c + 2], max);
            }
        }
        int[][] output = new int[outputLen][outputLen];
        for (int c = 0; c < outputLen; c++) {
            for (int r = 0; r < outputLen; r++) {
                int max = Math.max(row[r][c], row[r + 1][c]);
                output[r][c] = Math.max(row[r + 2][c], max);
            }
        }
        return output;
    }
}
