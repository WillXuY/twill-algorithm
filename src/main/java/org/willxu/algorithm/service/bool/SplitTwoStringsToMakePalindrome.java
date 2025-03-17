package org.willxu.algorithm.service.bool;

public interface SplitTwoStringsToMakePalindrome {
	/**
	 * You are given two strings a and b of the same length. Choose an
	 * index and split both strings at the same index, splitting a into
	 * two strings: a_prefix and a_suffix where a = a_prefix + a_suffix,
	 * and splitting b into two strings: b_prefix and b_suffix where
	 * b = b_prefix + b_suffix. Check if a_prefix + b_suffix or
	 * b_prefix + a_suffix forms a palindrome.
	 * <p>
	 * When you split a string s into s_prefix and s_suffix, either
	 * s_suffix or s_prefix is allowed to be empty. For example, if
	 * s = "abc", then "" + "abc", "a" + "bc", "ab" + "c" , and
	 * "abc" + "" are valid splits.
	 * <p>
	 * Return true if it is possible to form a palindrome string,
	 * otherwise return false.
	 * <p>
	 * Notice that x + y denotes the concatenation of strings x and y.
	 * 
	 * @param a,b 1 <= a.length, b.length <= 10^5
	 *            a.length == b.length
	 *            consist of lowercase English letters
	 */
	boolean checkPalindromeFormation(String a, String b);
}
