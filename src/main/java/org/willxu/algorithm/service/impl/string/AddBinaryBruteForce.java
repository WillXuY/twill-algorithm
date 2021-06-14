package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.AddBinary;

public class AddBinaryBruteForce implements AddBinary {
    @Override
    public String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            return addBinarySort(a, b);
        } else {
            return addBinarySort(b, a);
        }
    }

    /**
     * s.length <= l.length
     * @param shortString short one
     * @param longString long one
     * @return sum of s and l
     */
    private String addBinarySort(String shortString, String longString) {
        int add = 0;
        char[] s = shortString.toCharArray();
        char[] l = longString.toCharArray();
        for (int i = 1; i <= s.length; i++) {
            int sum = s[s.length - i] - '0' + l[l.length - i] - '0' + add;
            if (sum == 3) {
                add = 1;
                l[l.length - i] = '1';
            } else if (sum == 2) {
                add = 1;
                l[l.length - i] = '0';
            } else if (sum == 1) {
                add = 0;
                l[l.length - i] = '1';
            } else {
                add = 0;
                l[l.length - i] = '0';
            }
        }
        if (add == 0) {
            return new String(l);
        }
        for (int i = s.length + 1; i <= l.length; i++) {
            int sum = l[l.length - i] - '0' + add;
            if (sum == 2) {
                l[l.length - i] = '0';
            } else if (sum == 1) {
                l[l.length - i] = '1';
                return new String(l);
            }
        }
        return "1" + new String(l);
    }
}
