package org.willxu.algorithm.service.integer;

public interface NumberOfGoodWaysToSplitString {
	/**
	 * You are given a string s.
	 * <p>
	 * A split is called good if you can split s into two non-empty
	 * strings s_left and s_right where their concatenation is equal to
	 * s (i.e., s_left + s_right = s) and the number of distinct letters
	 * in s_left and s_right is the same.
	 * <p>
	 * Return the number of good splits you can make in s.
	 * 
	 * @param s 1 <= s.length <= 10^5
	 *          consists of only lowercase English letters.
	 */
	int numSplits(String s);
}
