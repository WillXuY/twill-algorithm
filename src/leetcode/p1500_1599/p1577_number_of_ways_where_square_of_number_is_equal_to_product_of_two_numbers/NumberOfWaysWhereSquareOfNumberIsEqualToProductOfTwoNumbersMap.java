package org.willxu.algorithm.service.impl.integer;

import java.util.HashMap;
import java.util.Map;

import org.willxu.algorithm.service.integer.NumberOfWaysWhereSquareOfNumberIsEqualToProductOfTwoNumbers;

public class NumberOfWaysWhereSquareOfNumberIsEqualToProductOfTwoNumbersMap
        implements NumberOfWaysWhereSquareOfNumberIsEqualToProductOfTwoNumbers {

	@Override
	public int numTriplets(int[] nums1, int[] nums2) {
		int result = 0;
		for (long n: nums1) {
			result += countProducts(n * n, nums2);
		}
		for (long n: nums2) {
			result += countProducts(n * n, nums1);
		}
		return result;
	}

	public int countProducts(long square, int[] numbers) {
		int result = 0;
		Map<Long, Integer> numberCountMap = new HashMap<>();
		for (long n: numbers) {
			if (square % n == 0) {
				result += numberCountMap.getOrDefault(square / n, 0);
			}
			numberCountMap.put(n, numberCountMap.getOrDefault(n, 0) + 1);
		}
		return result;
	}
}
