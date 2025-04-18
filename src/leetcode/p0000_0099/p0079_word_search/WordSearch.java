package org.willxu.algorithm.service.bool;

public interface WordSearch {
    /**
     * Given an m x n grid of characters board and a string word, return
     * true if word exists in the grid.
     * <p>
     * The word can be constructed from letters of sequentially adjacent
     * cells, where adjacent cells are horizontally or vertically
     * neighboring. The same letter cell may not be used more than once.
     *
     * @param board m == board.length
     *              consists of only lowercase and uppercase English
     *              letters.
     *              n = board[i].length
     *              1 <= m, n <= 6
     * @param word 1 <= word.length <= 15
     *             consists of only lowercase and uppercase English
     *             letters.
     */
    boolean exist(char[][] board, String word);
}
