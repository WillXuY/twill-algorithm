package org.willxu.algorithm.service.integer;

public interface ContainerWithMostWater {
    /**
     * You are given an integer array height of length n. There are n
     * vertical lines drawn such that the two endpoints of the ith line
     * are (i, 0) and (i, height[i]).
     * <p>
     * Find two lines that together with the x-axis form a container, such
     * that the container contains the most water.
     * <p>
     * Return the maximum amount of water a container can store.
     * <p>
     * Notice that you may not slant the container.
     *
     * @param height n == height.length
     *               2 <= n <= 105
     *               0 <= height[i] <= 104
     */
    int maxArea(int[] height);
}
