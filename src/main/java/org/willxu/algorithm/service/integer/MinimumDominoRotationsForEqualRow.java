package org.willxu.algorithm.service.integer;

public interface MinimumDominoRotationsForEqualRow {
    /**
     * In a row of dominoes, tops[i] and bottoms[i] represent the top
     * and bottom halves of the i^th domino. (A domino is a tile with
     * two numbers from 1 to 6 -one on each half of the tile.)
     * <p>
     * We may rotate the i^th domino, so that tops[i] and bottoms[i]
     * swap values.
     * <p>
     * Return the minimum number of rotations so that all the values in
     * tops are the same, or all the values in bottoms are the same.
     * <p>
     * If it cannot be done, return -1.
     *
     * @param tops,bottoms 2 <= tops.length <= 2 * 10^4
     *                     bottoms.length == tops.length
     *                     1 <= tops[i], bottoms[i] <= 6
     */
    int minDominoRotations(int[] tops, int[] bottoms);
}
