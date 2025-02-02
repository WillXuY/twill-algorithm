package org.willxu.algorithm.service.integer;

public interface NumberOfSubstringsWithOnly1s {
	/**
	 * Given a binary string s, return the number of substrings with all
	 * characters 1's. Since the answer may be too large, return it
	 * modulo 10^9 + 7. 
	 * 
	 * @param s 1 <= s.length <= 10^5
	 *          s[i] is either '0' or '1'.
	 */
	int numSub(String s);
}
