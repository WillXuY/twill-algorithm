package org.willxu.algorithm.service.string;

public interface AlphabetBoardPath {
    /**
     * On an alphabet board, we start at position (0, 0), corresponding
     * to character board[0][0].
     * <p>
     * Here, board = ["abcde", "fghij", "klmno", "pqrst", "uvwxy", "z"],
     * as shown in the diagram below.
     * <p>
     * We may make the following moves:
     * <p>
     * - 'U' moves our position up one row, if the position exists on
     *   the board;
     * - 'D' moves our position down one row, if the position exists on
     *   the board;
     * - 'L' moves our position left one column, if the position exists
     *   on the board;
     * - 'R' moves our position right one column, if the position exists
     *   on the board;
     * - '!' adds the character board[r][c] at our current position
     *   (r, c) to the answer.
     * <p>
     * (Here, the only positions that exist on the board are positions
     * with letters on them.)
     * <p>
     * Return a sequence of moves that makes our answer equal to target
     * in the minimum number of moves.  You may return any path that
     * does so.
     *
     * @param target 1 <= target.length <= 100
     *               consists only of English lowercase letters.
     */
    String alphabetBoardPath(String target);
}
