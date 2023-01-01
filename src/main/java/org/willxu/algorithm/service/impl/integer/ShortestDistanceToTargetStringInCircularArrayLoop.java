package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.ShortestDistanceToTargetStringInCircularArray;

public class ShortestDistanceToTargetStringInCircularArrayLoop
        implements ShortestDistanceToTargetStringInCircularArray {
    @Override
    public int closetTarget(String[] words, String target, int startIndex) {
        int output = -1;
        int len = words.length;
        for (int distance = 0; distance <= len / 2; distance++) {
            int leftIndex = startIndex - distance;
            int rightIndex = startIndex + distance;
            if (leftIndex < 0) {
                leftIndex += len;
            }
            if (rightIndex >= len) {
                rightIndex -= len;
            }
            if (target.equals(words[leftIndex])
                    || target.equals(words[rightIndex])) {
                output = distance;
                break;
            }
        }
        return output;
    }
}
