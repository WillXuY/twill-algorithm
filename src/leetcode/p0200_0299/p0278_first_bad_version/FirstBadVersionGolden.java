package org.willxu.algorithm.service.impl.extend;

import org.willxu.algorithm.service.extend.FirstBadVersion;

public class FirstBadVersionGolden extends FirstBadVersion {
    @Override
    public int firstBadVersion(int n) {
        int min = 1;
        int max = n;
        float golden = 0.618F;
        while (max > min) {
            int add = (int) ((max - min) * golden);
            if (add == 0) {
                if (isBadVersion(min)) {
                    return min;
                }
                return max;
            }
            int middle = min + add;
            // if is bad means >= bad
            if (isBadVersion(middle)) {
                max = middle;
            } else {
                min = middle;
            }
        }
        return 1;
    }
}
