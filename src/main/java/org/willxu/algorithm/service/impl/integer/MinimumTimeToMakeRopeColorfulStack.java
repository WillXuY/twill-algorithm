package org.willxu.algorithm.service.impl.integer;

import java.util.Stack;

import org.willxu.algorithm.service.integer.MinimumTimeToMakeRopeColorful;

public class MinimumTimeToMakeRopeColorfulStack implements MinimumTimeToMakeRopeColorful {

	@Override
	public int minCost(String colors, int[] neededTime) {
		if (colors.isEmpty()|| colors.length() != neededTime.length) {
			return -1;
		}
		int result = 0;
		Stack<Integer> indexStack = new Stack<>();
		indexStack.push(0);
		for (int i = 1; i < colors.length(); i++) {
			char c = colors.charAt(i);
			char s = colors.charAt(indexStack.peek());
			if (c == s) {
				int lenC = neededTime[i];
				int lenS = neededTime[indexStack.peek()];
				if (lenS > lenC) {
					// remove c
					result += lenC;
				} else {
					// pop s, push c
					result += lenS;
					indexStack.pop();
					indexStack.push(i);
				}
			} else {
				indexStack.push(i);
			}
		}
		return result;
	}

}
