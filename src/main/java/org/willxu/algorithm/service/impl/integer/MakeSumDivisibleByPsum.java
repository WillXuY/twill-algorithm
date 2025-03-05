package org.willxu.algorithm.service.impl.integer;

import java.util.HashMap;
import java.util.Map;

import org.willxu.algorithm.service.integer.MakeSumDivisibleByP;

public class MakeSumDivisibleByPsum implements MakeSumDivisibleByP {

	@Override
	public int minSubarray(int[] nums, int p) {
		long sum = 0;
		for (int n: nums) {
			sum += n;
		}
		long target = sum % p;
		if (target == 0) {
			return 0;
		}
		Map<Long, Integer> remainderLastIndexMap = new HashMap<>();
		remainderLastIndexMap.put(0l, -1);
		long currentSum = 0;
		int minLen = nums.length;
		for (int i = 0; i < nums.length; i++) {
			currentSum += nums[i];
			long needed = (currentSum - target + p) % p;
			if (remainderLastIndexMap.containsKey(needed)) {
				int lastIndex = remainderLastIndexMap.get(needed);
				minLen = Math.min(minLen, i - lastIndex);
			}
			remainderLastIndexMap.put(currentSum % p, i);
		}
		if (minLen == nums.length) {
			return -1;
		} else {
			return minLen;
		}
	}

}
