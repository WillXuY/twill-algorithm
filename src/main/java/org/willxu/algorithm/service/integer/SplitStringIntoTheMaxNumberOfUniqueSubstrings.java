package org.willxu.algorithm.service.integer;

public interface SplitStringIntoTheMaxNumberOfUniqueSubstrings {
	/**
	 * Given a string s, return the maximum number of unique substrings
	 * that the given string can be split into.
	 * <p>
	 * You can split string s into any list of non-empty substrings,
	 * where the concatenation of the substrings forms the original
	 * string. However, you must split the substrings such that all of
	 * them are unique.
	 * <p>
	 * A substring is a contiguous sequence of characters within a
	 * string.
	 * 
	 * @param s 1 <= s.length <= 16
	 *          contains only lower case English letters.
	 */
	int maxUniqueSplit(String s);
}
