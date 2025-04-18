package leetcode.p1300_1399.p1380_lucky_numbers_in_matrix;

import java.util.List;

public interface LuckyNumbersInMatrix {
    /**
     * Given an m x n matrix of distinct numbers, return all lucky
     * numbers in the matrix in any order.
     * A lucky number is an element of the matrix such that it is the
     * minimum element in its row and maximum in its column.
     *
     * @param matrix 1 <= matrix.length, matrix[i].length <= 50
     *               1 <= matrix[i][j] <= 10^5
     *               All elements in the matrix are distinct.
     * @return lucky numbers in matrix.
     */
    List<Integer> luckyNumbers (int[][] matrix);
}
