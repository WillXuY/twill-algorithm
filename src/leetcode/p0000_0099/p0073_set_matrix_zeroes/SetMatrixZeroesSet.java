package leetcode.p0000_0099.p0073_set_matrix_zeroes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroesSet implements SetMatrixZeroes {
    @Override
    public void setZeroes(int[][] matrix) {
        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }
        for (int row: rowSet) {
            Arrays.fill(matrix[row], 0);
        }
        for (int col: colSet) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = 0;
            }
        }
    }
}
