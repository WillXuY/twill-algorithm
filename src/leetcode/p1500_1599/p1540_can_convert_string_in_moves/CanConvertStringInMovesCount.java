package leetcode.p1500_1599.p1540_can_convert_string_in_moves;

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
