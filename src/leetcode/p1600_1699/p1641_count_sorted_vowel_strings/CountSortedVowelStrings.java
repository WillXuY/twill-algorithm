package leetcode.p1600_1699.p1641_count_sorted_vowel_strings;

public interface CountSortedVowelStrings {

	/**
	 * Given an integer n, return the number of strings of length n
	 * that consist only of vowels (a, e, i, o, u) and are
	 * lexicographically sorted.
	 * <p>
	 * A string s is lexicographically sorted if for all valid i, s[i]
	 * is the same as or comes before s[i+1] in the alphabet.
	 * 
	 * @param n 1 <= n <= 50
	 */
	int countVowelStrings(int n);
}
