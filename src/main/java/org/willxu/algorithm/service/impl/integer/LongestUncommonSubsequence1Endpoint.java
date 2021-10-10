package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.LongestUncommonSubsequence1;

public class LongestUncommonSubsequence1Endpoint
        implements LongestUncommonSubsequence1 {
    @Override
    public int findLUSlength(String a, String b) {
        if (a.length() > b.length()) {
            return a.length();
        } else if (a.length() < b.length()) {
            return b.length();
        }
        // a.length = b.length
        int length = a.length();
        int startPoint = 0;
        int endpoint = length - 1;
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        while (startPoint < endpoint) {
            boolean startSame = charsA[startPoint] == charsB[startPoint];
            boolean endSame = charsA[endpoint] == charsB[endpoint];
            if (startSame && endSame) {
                startPoint++;
                endpoint--;
                length -= 2;
            } else {
                return length;
            }
        }
        return -1;
    }
}
