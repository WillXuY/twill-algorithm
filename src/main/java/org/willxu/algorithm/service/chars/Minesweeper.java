package org.willxu.algorithm.service.chars;

public interface Minesweeper {
    /**
     * Let's play the minesweeper game (Wikipedia, online game)!
     * <p>
     * You are given an m x n char matrix board representing the game
     * board where:
     * <p>
     * - 'M' represents an unrevealed mine,
     * - 'E' represents an unrevealed empty square,
     * - 'B' represents a revealed blank square that has no adjacent
     *   mines (i.e., above, below, left, right, and all 4 diagonals),
     * - digit ('1' to '8') represents how many mines are adjacent to
     *   this revealed square, and
     * - 'X' represents a revealed mine.
     * <p>
     * You are also given an integer array click where
     * click = [click_r, click_c] represents the next click position
     * among all the unrevealed squares ('M' or 'E').
     * <p>
     * Return the board after revealing this position according to the
     * following rules:
     * <p>
     * 1. If a mine 'M' is revealed, then the game is over. You should
     *    change it to 'X'.
     * 2. If an empty square 'E' with no adjacent mines is revealed,
     *    then change it to a revealed blank 'B' and all of its adjacent
     *    unrevealed squares should be revealed recursively.
     * 3. If an empty square 'E' with at least one adjacent mine is
     *    revealed, then change it to a digit ('1' to '8') representing
     *    the number of adjacent mines.
     * 4. Return the board when no more squares will be revealed.
     *
     * @param board m == board.length
     *              n == board[i].length
     *              1 <= m, n <= 50
     *              board[i][j] is either 'M', 'E', 'B', or a digit from
     *              '1' to '8'.
     * @param click click.length == 2
     *              0 <= click_r < m
     *              0 <= click_c < n
     *              board[click_r][click_c] is either 'M' or 'E'.
     */
    char[][] updateBoard(char[][] board, int[] click);
}
