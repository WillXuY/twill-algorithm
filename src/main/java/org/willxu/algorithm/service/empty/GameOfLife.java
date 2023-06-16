package org.willxu.algorithm.service.empty;

public interface GameOfLife {
    /**
     * According to Wikipedia's article: "The Game of Life, also known
     * simply as Life, is a cellular automaton devised by the British
     * mathematician John Horton Conway in 1970."
     * <p>
     * The board is made up of an m x n grid of cells, where each cell
     * has an initial state: live (represented by a 1) or dead
     * (represented by a 0). Each cell interacts with its eight
     * neighbors (horizontal, vertical, diagonal) using the following
     * four rules (taken from the above Wikipedia article):
     * <p>
     * Any live cell with fewer than two live neighbors dies as if
     * caused by under-population.
     * <p>
     * Any live cell with two or three live neighbors lives on to the
     * next generation.
     * <p>
     * Any live cell with more than three live neighbors dies, as if by
     * over-population.
     * <p>
     * Any dead cell with exactly three live neighbors becomes a live
     * cell, as if by reproduction.
     * <p>
     * The next state is created by applying the above rules
     * simultaneously to every cell in the current state, where births
     * and deaths occur simultaneously. Given the current state of the
     * m x n grid board, return the next state.
     *
     * @param board m == board.length
     *              n == board[i].length
     *              1 <= m, n <= 25
     *              board[i][j] is 0 or 1.
     */
    void gameOfLife(int[][] board);
}
