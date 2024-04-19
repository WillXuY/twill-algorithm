package org.willxu.algorithm.service.integer;

public interface KnightDialer {
    /**
     * The chess knight has a unique movement, it may move two squares
     * vertically and one square horizontally, or two squares
     * horizontally and one square vertically (with both forming the
     * shape of an L). The possible movements of chess knight are shown
     * in this diagram:
     * <p>
     * A chess knight can move as indicated in the chess diagram below:
     * <p>
     * We have a chess knight and a phone pad as shown below, the knight
     * can only stand on a numeric cell (i.e. blue cell).
     * <p>
     * Given an integer n, return how many distinct phone numbers of
     * length n we can dial.
     * <p>
     * You are allowed to place the knight on any numeric cell initially
     * and then you should perform n - 1 jumps to dial a number of
     * length n. All jumps should be valid knight jumps.
     * <p>
     * As the answer may be very large, return the answer modulo 10^9 + 7.
     *
     * @param n 10 < n <= 5000
     */
    int knightDialer(int n);
}
