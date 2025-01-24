package org.willxu.algorithm.service.ints;

public interface AvoidFloodInTheCity {
	/**
	 * Your country has an infinite number of lakes. Initially, all the
	 * lakes are empty, but when it rains over the n^th lake, the n^th
	 * lake becomes full of water. If it rains over a lake that is full
	 * of water, there will be a flood. Your goal is to avoid floods in
	 * any lake.
	 * <p>
	 * Given an integer array rains where:
	 * <p>
	 * - rains[i] > 0 means there will be rains over the rains[i] lake.
	 * - rains[i] == 0 means there are no rains this day and you can choose one lake this day and dry it.
	 * <p>
	 * Return an array ans where:
	 * <p>
	 * - ans.length == rains.length
	 * - ans[i] == -1 if rains[i] > 0.
	 * - ans[i] is the lake you choose to dry in the ith day if rains[i] == 0.
	 * <p>
	 * If there are multiple valid answers return any of them. If it is
	 * impossible to avoid flood return an empty array.
	 * <p>
	 * Notice that if you chose to dry a full lake, it becomes empty,
	 * but if you chose to dry an empty lake, nothing changes.
	 * 
	 * @param rains 1 <= rains.length <= 10^5
	 *              0 <= rains[i] <= 10^9
	 */
	int[] avoidFlood(int[] rains);
}
