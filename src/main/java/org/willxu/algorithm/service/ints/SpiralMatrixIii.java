package org.willxu.algorithm.service.ints;

public interface SpiralMatrixIii {
    /**
     * You start at the cell (rStart, cStart) of an rows x cols grid
     * facing east. The northwest corner is at the first row and column
     * in the grid, and the southeast corner is at the last row and
     * column.
     * <p>
     * You will walk in a clockwise spiral shape to visit every position
     * in this grid. Whenever you move outside the grid's boundary, we
     * continue our walk outside the grid (but may return to the grid
     * boundary later.). Eventually, we reach all rows * cols spaces of
     * the grid.
     * <p>
     * Return an array of coordinates representing the positions of the
     * grid in the order you visited them.
     *
     * @param rows,cols 1 <= rows, cols <= 100
     * @param rStart 0 <= rStart < rows
     * @param cStart 0 <= cStart < cols
     */
    int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart);
}
