package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.InterleavingString;

import java.util.HashSet;
import java.util.Set;

public class InterleavingStringIndex implements InterleavingString {
    @Override
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        Set<String> possibleIndex = new HashSet<>();
        possibleIndex.add("-1,-1");
        for (char c: s3.toCharArray()) {
            Set<String> newPossibleIndex = new HashSet<>();
            for (String possible: possibleIndex) {
                String[] p = possible.split(",");
                int lastIndex1 = Integer.parseInt(p[0]);
                int lastIndex2 = Integer.parseInt(p[1]);
                int index1 = lastIndex1 + 1;
                if (index1 < s1.length()) {
                    char c1 = s1.charAt(index1);
                    if (c1 == c) {
                        newPossibleIndex.add(index1 + "," + lastIndex2);
                    }
                }
                int index2 = lastIndex2 + 1;
                if (index2 < s2.length()) {
                    char c2 = s2.charAt(index2);
                    if (c2 == c) {
                        newPossibleIndex.add(lastIndex1 + "," + index2);
                    }
                }
            }
            possibleIndex = newPossibleIndex;
            if (possibleIndex.size() == 0) {
                break;
            }
        }
        return possibleIndex.size() > 0;
    }
}
