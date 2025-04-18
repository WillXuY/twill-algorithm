package leetcode.p0000_0099.p0064_minimum_path_sum;

public class MinimumPathSumMatrix implements MinimumPathSum {
    @Override
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] sum = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0) {
                    if (j == 0) {
                        sum[i][j] = grid[i][j];
                    } else {
                        sum[i][j] = grid[i][j] + sum[i][j - 1];
                    }
                } else {
                    if (j == 0) {
                        sum[i][j] = grid[i][j] + sum[i - 1][j];
                    } else {
                        sum[i][j] = Math.min(grid[i][j] + sum[i - 1][j],
                                grid[i][j] + sum[i][j - 1]);
                    }
                }
            }
        }
        return sum[row - 1][col - 1];
    }
}
