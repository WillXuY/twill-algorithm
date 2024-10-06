package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface QueensThatCanAttackTheKing {
    /**
     * On a 0-indexed 8 x 8 chessboard, there can be multiple black
     * queens and one white king.
     * <p>
     * You are given a 2D integer array queens where
     * queens[i] = [xQueen_i, yQueen_i] represents the position of the
     * i^th black queen on the chessboard. You are also given an integer
     * array king of length 2 where king = [xKing, yKing] represents the
     * position of the white king.
     * <p>
     * Return the coordinates of the black queens that can directly
     * attack the king. You may return the answer in any order.
     *
     * @param queens,king 1 <= queens.length < 64
     *                    queens[i].length == king.length == 2
     *                    0 <= xQueen_i, yQueen_i, xKing, yKing < 8
     *                    All the given positions are unique.
     */
    List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king);
}
