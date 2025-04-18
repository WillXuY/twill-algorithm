package org.willxu.algorithm.service.integer;

public interface NumberOfRectanglesThatCanFormTheLargestSquare {
    /**
     * You are given an array rectangles where rectangles[i] = [li, wi]
     * represents the ith rectangle of length li and width wi.
     *
     * You can cut the ith rectangle to form a square with a side length
     * of k if both k <= li and k <= wi. For example, if you have a
     * rectangle [4,6], you can cut it to get a square with a side
     * length of at most 4.
     *
     * Let maxLen be the side length of the largest square you can
     * obtain from any of the given rectangles.
     *
     * Return the number of rectangles that can make a square with a
     * side length of maxLen.
     *
     * @param rectangles 1 <= rectangles.length <= 1000
     *                   rectangles[i].length == 2
     *                   1 <= li, wi <= 109
     *                   li != wi
     */
    int countGoodRectangles(int[][] rectangles);
}
