package org.willxu.algorithm.service.impl.integer;

public interface MinimumDeletionsToMakeCharacterFrequenciesUnique {

	/**
	 * A string s is called good if there are no two different
	 * characters in s that have the same frequency.
	 * <p>
	 * Given a string s, return the minimum number of characters you
	 * need to delete to make s good.
	 * <p>
	 * The frequency of a character in a string is the number of times
	 * it appears in the string. For example, in the string "aab", the
	 * frequency of 'a' is 2, while the frequency of 'b' is 1.
	 * 
	 * @param s 1 <= s.length <= 10^5
	 *          contains only lowercase English letters.
	 */
	int minDeletions(String s);
}
