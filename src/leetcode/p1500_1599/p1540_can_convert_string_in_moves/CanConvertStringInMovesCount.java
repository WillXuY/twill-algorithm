package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.CanConvertStringInMoves;

public class CanConvertStringInMovesCount implements CanConvertStringInMoves {
	@Override
	public boolean canConvertString(String s, String t, int k) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] counts = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int diff = (t.charAt(i) - s.charAt(i) + 26) % 26;
			if (diff > 0 && diff + counts[diff] * 26 > k) {
				return false;
			}
			// loop another 26 times.
			counts[diff]++;
		}
		return true;
	}
}
