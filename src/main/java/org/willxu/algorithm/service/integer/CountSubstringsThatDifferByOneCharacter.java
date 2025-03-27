package org.willxu.algorithm.service.integer;

public interface CountSubstringsThatDifferByOneCharacter {

	/**
	 * Given two strings s and t, find the number of ways you can choose
	 * a non-empty substring of s and replace a single character by a
	 * different character such that the resulting substring is a
	 * substring of t. In other words, find the number of substrings in
	 * s that differ from some substring in t by exactly one character.
	 * <p>
	 * For example, the underlined substrings in "computer" and
	 * "computation" only differ by the 'e'/'a', so this is a valid way.
	 * <p>
	 * Return the number of substrings that satisfy the condition above.
	 * <p>
	 * A substring is a contiguous sequence of characters within a
	 * string.
	 * 
	 * @param s,t 1 <= s.length, t.length <= 100
	 *            consist of lowercase English letters only.
	 */
	int countSubstrings(String s, String t);
}
