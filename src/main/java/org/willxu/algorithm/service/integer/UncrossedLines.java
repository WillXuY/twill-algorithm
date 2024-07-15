package org.willxu.algorithm.service.integer;

public interface UncrossedLines {
    /**
     * You are given two integer arrays nums1 and nums2. We write the
     * integers of nums1 and nums2 (in the order they are given) on two
     * separate horizontal lines.
     * <p>
     * We may draw connecting lines: a straight line connecting two
     * numbers nums1[i] and nums2[j] such that:
     * <p>
     * - nums1[i] == nums2[j], and
     * <p>
     * - the line we draw does not intersect any other connecting
     *   (non-horizontal) line.
     * <p>
     * Note that a connecting line cannot intersect even at the
     * endpoints (i.e., each number can only belong to one connecting
     * line).
     * <p>
     * Return the maximum number of connecting lines we can draw in this
     * way.
     *
     * @param nums1,num2 1 <= nums1.length, nums2.length <= 500
     *                   1 <= nums1[i], nums2[j] <= 2000
     */
    int maxUncrossedLines(int[] nums1, int[] nums2);
}
