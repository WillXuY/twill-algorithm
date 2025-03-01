package org.willxu.algorithm.service.integer;

public interface MinimumTimeToMakeRopeColorful {
	/**
	 * Alice has n balloons arranged on a rope. You are given a
	 * 0-indexed string colors where colors[i] is the color of the i^th
	 * balloon.
	 * <p>
	 * Alice wants the rope to be colorful. She does not want two
	 * consecutive balloons to be of the same color, so she asks Bob for
	 * help. Bob can remove some balloons from the rope to make it
	 * colorful. You are given a 0-indexed integer array neededTime
	 * where neededTime[i] is the time (in seconds) that Bob needs to
	 * remove the i^th balloon from the rope.
	 * <p>
	 * Return the minimum time Bob needs to make the rope colorful.
	 * 
	 * @param colors n == colors.length == neededTime.length
	 *               1 <= n <= 10^5
	 *               contains only lowercase English letters.
	 * @param neededTime 1 <= neededTime[i] <= 10^4
	 */
	int minCost(String colors, int[] neededTime);
}
