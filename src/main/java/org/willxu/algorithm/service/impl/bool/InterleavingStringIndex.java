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
        Set<int[]> possibleIndex = new HashSet<>();
        int[] start = new int[] {-1, -1};
        possibleIndex.add(start);
        for (char c: s3.toCharArray()) {
            Set<int[]> newPossibleIndex = new HashSet<>();
            for (int[] possible: possibleIndex) {
                int index1 = possible[0] + 1;
                if (index1 < s1.length()) {
                    char c1 = s1.charAt(index1);
                    if (c1 == c) {
                        newPossibleIndex.add(new int[] {index1, possible[1]});
                    }
                }
                int index2 = possible[1] + 1;
                if (index2 < s2.length()) {
                    char c2 = s2.charAt(index2);
                    if (c2 == c) {
                        newPossibleIndex.add(new int[] {possible[0], index2});
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
