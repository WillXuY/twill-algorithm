package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.CheckIfBinaryStringHasAtMostOneSegmentOfOnes;

public class CheckIfBinaryStringHasAtMostOneSegmentOfOnesLoop
        implements CheckIfBinaryStringHasAtMostOneSegmentOfOnes {
    @Override
    public boolean checkOnesSegment(String s) {
        char[] chars = s.toCharArray();
        boolean lastIsOne = false;
        boolean oneAppeared = false;
        for (char c: chars) {
            if (c == '1') {
                if (oneAppeared) {
                    return false;
                }
                lastIsOne = true;
            } else {
                if (lastIsOne) {
                    oneAppeared = true;
                }
                lastIsOne = false;
            }
        }
        return true;
    }
}
