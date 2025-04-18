package leetcode.p0000_0099.p0036_valid_sudoku;

public interface ValidSudoku {
    /**
     * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells
     * need to be validated according to the following rules:
     * <p>
     * Each row must contain the digits 1-9 without repetition.
     * Each column must contain the digits 1-9 without repetition.
     * Each of the nine 3 x 3 sub-boxes of the grid must contain the
     * digits 1-9 without repetition.
     * Note:
     * <p>
     * - A Sudoku board (partially filled) could be valid but is not
     *   necessarily solvable.
     * - Only the filled cells need to be validated according to the
     *   mentioned rules.
     *
     * @param board board.length == 9
     *              board[i].length == 9
     *              board[i][j] is a digit 1-9 or '.'.
     */
    boolean isValidSudoku(char[][] board);
}
