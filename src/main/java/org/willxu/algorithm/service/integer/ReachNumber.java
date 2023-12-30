package org.willxu.algorithm.service.integer;

public interface ReachNumber {
    /**
     * You are standing at position 0 on an infinite number line. There
     * is a destination at position target.
     * <p>
     * You can make some number of moves numMoves so that:
     * <p>
     * - On each move, you can either go left or right.
     * - During the i^th move (starting from i == 1 to i == numMoves),
     *   you take i steps in the chosen direction.
     * <p>
     * Given the integer target, return the minimum number of moves
     * required (i.e., the minimum numMoves) to reach the destination.
     * <p>
     * 1 step ->     1         || -1
     *             / \           / \
     * 2 step -> 3   -1         1  -3
     * 3 step ->6 0 2 -4      4 -2 0, -6
     *
     * @param target -10^9 <= target <= 10^9
     *               target != 0
     */
    int reachNumber(int target);
}
