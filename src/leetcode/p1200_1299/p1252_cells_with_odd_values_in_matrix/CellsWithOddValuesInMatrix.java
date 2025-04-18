package leetcode.p1200_1299.p1252_cells_with_odd_values_in_matrix;

public interface CellsWithOddValuesInMatrix {
    /**
     * There is an m x n matrix that is initialized to all 0's. There is
     * also a 2D array indices where each indices[i] = [r_i, c_i]
     * represents a 0-indexed location to perform some increment
     * operations on the matrix.
     * For each location indices[i], do both of the following:
     * 1. Increment all the cells on row r_i.
     * 2. Increment all the cells on column c_i.
     * Given m, n, and indices, return the number of odd-valued cells in
     * the matrix after applying the increment to all locations in
     * indices.
     * Follow up:
     * Could you  solve this in O(n + m + indices.length) time with only
     * O(n + m) extra space?
     *
     * @param m 1 <= m <= 50
     * @param n 1 <= n <= 50
     * @param indices 1 <= indices.length <= 100
     *                indices[i] = [r_i, c_i]
     *                0 <= r_i < m
     *                0 <= c_i < n
     * @return number od odd cells.
     */
    int oddCells(int m, int n, int[][] indices);
}
