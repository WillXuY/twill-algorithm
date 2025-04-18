package leetcode.p1600_1699.p1641_count_sorted_vowel_strings;

public class CountSortedVowelStringsCount implements CountSortedVowelStrings {

	@Override
	public int countVowelStrings(int n) {
		int[] counts = new int[] {1, 1, 1, 1, 1};
		for (int i = 1; i < n; i++) {
			counts[1] += counts[0];
			counts[2] += counts[1];
			counts[3] += counts[2];
			counts[4] += counts[3];
		}
		int result = 1;
		for (int i = 1; i < 5; i++) {
			result += counts[i];
		}
		return result;
	}

}
