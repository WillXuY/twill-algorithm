package leetcode.p2300_2399.p2319_check_if_matrix_isx_matrix;

public class CheckIfMatrixIsxMatrixLoop implements CheckIfMatrixIsxMatrix {
    @Override
    public boolean checkXMatrix(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                boolean isZero = grid[i][j] == 0;
                boolean isX = i == j || i + j == grid.length - 1;
                if (isZero == isX) {
                    return false;
                }
            }
        }
        return true;
    }
}
