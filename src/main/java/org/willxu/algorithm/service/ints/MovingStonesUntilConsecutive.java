package org.willxu.algorithm.service.ints;

public interface MovingStonesUntilConsecutive {
    /**
     * There are three stones in different positions on the X-axis. You
     * are given three integers a, b, and c, the positions of the stones.
     * <p>
     * In one move, you pick up a stone at an endpoint (i.e., either the
     * lowest or highest position stone), and move it to an unoccupied
     * position between those endpoints. Formally, let's say the stones
     * are currently at positions x, y, and z with x < y < z. You pick
     * up the stone at either position x or position z, and move that
     * stone to an integer position k, with x < k < z and k != y.
     * <p>
     * The game ends when you cannot make any more moves (i.e., the
     * stones are in three consecutive positions).
     * <p>
     * Return an integer array answer of length 2 where:
     * <p>
     * - answer[0] is the minimum number of moves you can play, and
     * - answer[1] is the maximum number of moves you can play.
     *
     * @param a,b,c 1 <= a, b, c <= 100
     *              a, b, and c have different values.
     */
    int[] numMovesStones(int a, int b, int c);
}
