package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.CompareVersionNumbers;

public class CompareVersionNumbersSplit implements CompareVersionNumbers {
    @Override
    public int compareVersion(String version1, String version2) {
        String[] numbers1 = version1.split("\\.");
        String[] numbers2 = version2.split("\\.");
        int len = Math.max(numbers1.length, numbers2.length);
        for (int i = 0; i < len; i++) {
            int n1 = 0, n2 = 0;
            if (i < numbers1.length) {
                n1 = Integer.parseInt(numbers1[i]);
            }
            if (i < numbers2.length) {
                n2 = Integer.parseInt(numbers2[i]);
            }
            if (n1 > n2) {
                return 1;
            } else if (n1 < n2) {
                return -1;
            }
        }
        return 0;
    }
}
