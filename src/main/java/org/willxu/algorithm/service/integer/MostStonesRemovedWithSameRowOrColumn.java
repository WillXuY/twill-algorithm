package org.willxu.algorithm.service.integer;

public interface MostStonesRemovedWithSameRowOrColumn {
    /**
     * On a 2D plane, we place n stones at some integer coordinate
     * points. Each coordinate point may have at most one stone.
     * <p>
     * A stone can be removed if it shares either the same row or the
     * same column as another stone that has not been removed.
     * <p>
     * Given an array stones of length n where stones[i] = [x_i, y_i]
     * represents the location of the i^th stone, return the largest
     * possible number of stones that can be removed.
     *
     * @param stones 1 <= stones.length <= 1000
     *               0 <= x_i, y_i <= 10^4
     *               No two stones are at the same coordinate point.
     */
    int removeStones(int[][] stones);
}
