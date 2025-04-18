package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.CheckIfOneStringSwapCanMakeStringsEqual;

public class CheckIfOneStringSwapCanMakeStringsEqualLoop
        implements CheckIfOneStringSwapCanMakeStringsEqual {
    @Override
    public boolean areAlmostEqual(String s1, String s2) {
        int diffIndex1 = -1, diffIndex2 = -1;
        int diffLength1 = 0, diffLength2 = 0;
        boolean diffEnd1 = false, diffEnd2 = false;
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] == chars2[i]) {
                if (diffLength2 != 0) {
                    diffEnd2 = true;
                } else if (diffLength1 != 0) {
                    diffEnd1 = true;
                }
            } else {
                // There are 3 different strings.
                if (diffEnd2) {
                    return false;
                }
                if (diffEnd1) {
                    if (diffLength2 == 0) {
                        diffIndex2 = i;
                        diffLength2 = 1;
                    } else {
                        diffLength2++;
                    }
                } else {
                    if (diffLength1 == 0) {
                        diffIndex1 = i;
                        diffLength1 = 1;
                    } else {
                        diffLength1++;
                    }
                }
            }
        }
        boolean output = true;
        if (diffIndex2 == -1) {
            if ((diffLength1 & 1) == 1) {
                return false;
            }
            // Half of different string 1.
            int halfLength = diffLength1 / 2;
            int halfIndex = diffIndex1 + halfLength;
            for (int i = 0; i < halfLength; i++) {
                if (chars1[diffIndex1 + i] != chars2[halfIndex + i]
                        || chars1[halfIndex + i] != chars2[diffIndex1 + i]) {
                    output = false;
                    break;
                }
            }
        } else {
            if (diffLength1 != diffLength2) {
                return false;
            }
            for (int i = 0; i < diffLength1; i++) {
                if (chars1[diffIndex1 + i] != chars2[diffIndex2 + i]
                        || chars1[diffIndex2 + i] != chars2[diffIndex1 + i]) {
                    output = false;
                    break;
                }
            }
        }
        return output;
    }
}
