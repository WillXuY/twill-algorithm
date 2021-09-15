package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.NumberOfSegmentsInaString;

public class NumberOfSegmentsInaStringSpace
        implements NumberOfSegmentsInaString {
    @Override
    public int countSegments(String s) {
        char space = ' ';
        if (s.length() == 0) {
            return 0;
        }
        int count = 0;
        boolean lastSpace = true;
        for (char c: s.toCharArray()) {
            if (c == space) {
                lastSpace = true;
            } else {
                if (lastSpace) {
                    count++;
                }
                lastSpace = false;
            }
        }
        return count;
    }
}
