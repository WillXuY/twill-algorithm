package org.willxu.algorithm.service.ints;

public interface MovingStonesUntilConsecutiveIi {
    /**
     * There are some stones in different positions on the X-axis. You
     * are given an integer array stones, the positions of the stones.
     * <p>
     * Call a stone an endpoint stone if it has the smallest or largest
     * position. In one move, you pick up an endpoint stone and move it
     * to an unoccupied position so that it is no longer an endpoint
     * stone.
     * <p>
     * - In particular, if the stones are at say, stones = [1,2,5], you
     *   cannot move the endpoint stone at position 5, since moving it
     *   to any position (such as 0, or 3) will still keep that stone as
     *   an endpoint stone.
     * <p>
     * The game ends when you cannot make any more moves (i.e., the
     * stones are in three consecutive positions).
     * <p>
     * Return an integer array answer of length 2 where:
     * <p>
     * - answer[0] is the minimum number of moves you can play, and
     * - answer[1] is the maximum number of moves you can play.
     *
     * @param stones 3 <= stones.length <= 10^4
     *               1 <= stones[i] <= 10^9
     *               All the values of stones are unique.
     */
    int[] numMovesStonesII(int[] stones);
}
