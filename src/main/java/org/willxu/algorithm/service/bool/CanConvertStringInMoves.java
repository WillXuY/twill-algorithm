package org.willxu.algorithm.service.bool;

public interface CanConvertStringInMoves {
	/**
	 * Given two strings s and t, your goal is to convert s into t in k
	 * moves or less.
	 * <p>
	 * During the i^th (1 <= i <= k) move you can:
	 * <p>
	 * - Choose any index j (1-indexed) from s, such that
	 *   1 <= j <= s.length and j has not been chosen in any previous
	 *   move, and shift the character at that index i times.
	 * - Do nothing.
	 * <p>
	 * Shifting a character means replacing it by the next letter in the
	 * alphabet (wrapping around so that 'z' becomes 'a'). Shifting a
	 * character by i means applying the shift operations i times.
	 * <p>
	 * Remember that any index j can be picked at most once.
	 * <p>
	 * Return true if it's possible to convert s into t in no more than
	 * k moves, otherwise return false.
	 * 
	 * @param s,t 1 <= s.length, t.length <= 10^5
	 *            contain only lowercase English letters.
	 * @param k 0 <= k <= 10^9
	 */
	boolean canConvertString(String s, String t, int k);
}
