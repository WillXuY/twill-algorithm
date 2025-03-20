package org.willxu.algorithm.service.string;

public interface LexicographicallySmallestStringAfterApplyingOperations {

	/**
	 * You are given a string s of even length consisting of digits from
	 * 0 to 9, and two integers a and b.
	 * <p>
	 * You can apply either of the following two operations any number
	 * of times and in any order on s:
	 * <p>
	 * - Add a to all odd indices of s (0-indexed). Digits post 9 are
	 *   cycled back to 0. For example, if s = "3456" and a = 5, s
	 *   becomes "3951".
	 * - Rotate s to the right by b positions. For example, if s = "3456"
	 *   and b = 1, s becomes "6345".
	 * <p>
	 * Return the lexicographically smallest string you can obtain by
	 * applying the above operations any number of times on s.
	 * <p>
	 * A string a is lexicographically smaller than a string b (of the
	 * same length) if in the first position where a and b differ,
	 * string a has a letter that appears earlier in the alphabet than
	 * the corresponding letter in b. For example, "0158" is
	 * lexicographically smaller than "0190" because the first position
	 * they differ is at the third letter, and '5' comes before '9'.
	 * 
	 * @param s 2 <= s.length <= 100
	 *          s.length is even.
	 *          s consists of digits from 0 to 9 only.
	 * @param a 1 <= a <= 9
	 * @param b 1 <= b <= s.length - 1
	 */
	String findLexSmallestString(String s, int a, int b);
}
