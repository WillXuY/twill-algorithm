package leetcode.p1000_1099.p1030_matrix_cells_in_distance_order;

public interface MatrixCellsInDistanceOrder {
    /**
     * You are given four integers row, cols, rCenter, and cCenter.
     * There is a rows x cols matrix and you are on the cell with the
     * coordinates (rCenter, cCenter).
     * Return the coordinates of all cells in the matrix, sorted by
     * their distance from (rCenter, cCenter) from the smallest distance
     * to the largest distance. You may return the answer in any order
     * that satisfies this condition.
     * The distance between two cells (r_1, c_1) and (r_2, c_2) is
     * |r_1 - r_2| + |c_1 - c_2|.
     *
     * @param rows 1 <= rows <= 100
     * @param cols 1 <= cols <= 100
     * @param rCenter 0 <= rCenter < rows
     * @param cCenter 0 <= cCenter < cols
     * @return all cells closest to farthest.
     */
    int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter);
}
