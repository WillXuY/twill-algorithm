package org.willxu.algorithm.service.impl.character;

import org.willxu.algorithm.service.character.FindKthBitInNthBinaryString;

public class FindKthBitInNthBinaryStringRecursive implements FindKthBitInNthBinaryString {

	@Override
	public char findKthBit(int n, int k) {
		if (n == 1) {
			return '0';
		} else if (n < 1) {
			return 'e';
		}
		int midIndex = 1 << (n - 1);
		if (k == midIndex) {
			return '1';
		}
		if (k < midIndex) {
			return findKthBit(n - 1, k);
		}
		char reversed = findKthBit(n - 1, midIndex * 2 - k);
		char inverted = reversed == '0' ? '1' : '0';
		return inverted;
	}

}
