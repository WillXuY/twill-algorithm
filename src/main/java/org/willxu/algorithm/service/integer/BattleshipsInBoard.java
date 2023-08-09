package org.willxu.algorithm.service.integer;

public interface BattleshipsInBoard {
    /**
     * Given an m x n matrix board where each cell is a battleship 'X'
     * or empty '.', return the number of the battleships on board.
     * <p>
     * Battleships can only be placed horizontally or vertically on
     * board. In other words, they can only be made of the shape 1 x k
     * (1 row, k columns) or k x 1 (k rows, 1 column), where k can be of
     * any size. At least one horizontal or vertical cell separates
     * between two battleships (i.e., there are no adjacent battleships).
     *
     * @param board m == board.length
     *              n == board[i].length
     *              1 <= m, n <= 200
     *              board[i][j] is either '.' or 'X'.
     */
    int countBattleships(char[][] board);
}
