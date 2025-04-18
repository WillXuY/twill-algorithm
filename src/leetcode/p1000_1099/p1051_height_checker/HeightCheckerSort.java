package leetcode.p1000_1099.p1051_height_checker;

import java.util.Arrays;

public class HeightCheckerSort implements HeightChecker {
    /**
     * Sort the height and compare two arrays.
     *
     * @param heights 1 <= heights.length <= 100
     *                1 <= heights[i] <= 100
     * @return difference of sort and heights.
     */
    @Override
    public int heightChecker(int[] heights) {
        int[] sort = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sort);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (sort[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}
