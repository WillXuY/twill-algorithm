package org.willxu.algorithm.service.integer;

public interface NumberOfWaysToSplitString {
	/**
	 * Given a binary string s, you can split s into 3 non-empty
	 * strings s1, s2, and s3 where s1 + s2 + s3 = s.
	 * <p>
	 * Return the number of ways s can be split such that the number of
	 * ones is the same in s1, s2, and s3. Since the answer may be too
	 * large, return it modulo 10^9 + 7.
	 * 
	 * @param s 3 <= s.length <= 10^5
	 *          s[i] is either '0' or '1'.
	 */
	int numWays(String s);
}
