package org.willxu.algorithm.service.integer;

public interface MaximumAreaOfPieceOfCakeAfterHorizontalAndVerticalCuts {
	/**
	 * You are given a rectangular cake of size h x w and two arrays of
	 * integers horizontalCuts and verticalCuts where:
	 * <p>
	 * - horizontalCuts[i] is the distance from the top of the
	 *   rectangular cake to the i^th horizontal cut and similarly, and
	 * - verticalCuts[j] is the distance from the left of the
	 *   rectangular cake to the j^th vertical cut.
	 * <p>
	 * Return the maximum area of a piece of cake after you cut at each
	 * horizontal and vertical position provided in the arrays
	 * horizontalCuts and verticalCuts. Since the answer can be a large
	 * number, return this modulo 10^9 + 7.
	 * 
	 * @param h,w 2 <= h, w <= 10^9
	 * @param horizontalCuts 1 <= horizontalCuts.length <= min(h - 1, 10^5)
	 *                       1 <= horizontalCuts[i] < h
	 *                       All the elements in horizontalCuts are distinct.
	 * @param verticalCuts 1 <= verticalCuts.length <= min(w - 1, 10^5)
	 *                     1 <= verticalCuts[i] < w
	 *                     All the elements in verticalCuts are distinct.
	 */
	int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts);
}
