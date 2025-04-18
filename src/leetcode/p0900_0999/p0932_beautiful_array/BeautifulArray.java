package leetcode.p0900_0999.p0932_beautiful_array;

public interface BeautifulArray {
    /**
     * An array nums of length n is beautiful if:
     * <p>
     * - nums is a permutation of the integers in the range [1, n].
     * - For every 0 <= i < j < n, there is no index k with i < k < j
     *   where 2 * nums[k] == nums[i] + nums[j].
     * <p>
     * Given the integer n, return any beautiful array nums of length n.
     * There will be at least one valid answer for the given n.
     *
     * @param n 1 < n < 1000
     */
    int[] beautifulArray(int n);
}
