package leetcode.p0400_0499.p0459_repeated_substring_pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RepeatedSubstringPatternPointer implements RepeatedSubstringPattern {
    /**
     * string: abc abc abc abc
     * repeated start: 0
     * repeated end: 2, 5 (list)
     * index now: i (loop)
     *
     * @param s 1 <= s.length <= 10^4
     *          consists of lowercase English letters.
     * @return is substring repeated.
     */
    @Override
    public boolean repeatedSubstringPattern(String s) {
        if (s.length() < 2) {
            return false;
        }
        char[] chars = s.toCharArray();
        char start = chars[0];
        List<Integer> endList = new ArrayList<>();
        boolean possibleSubstring = true;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == start && possibleSubstring) {
                endList.add(i - 1);
                continue;
            }
            Iterator<Integer> iterator = endList.iterator();
            while (iterator.hasNext()) {
                int end = iterator.next();
                // size of the substring (index 0~end).
                int size = end + 1;
                int offset = i % size;
                if (chars[i] != chars[offset]) {
                    iterator.remove();
                }
            }
            if (i > chars.length / 2) {
                possibleSubstring = false;
                if (endList.size() == 0) {
                    return false;
                }
            }
        }
        // Check the substring can repeated to string.
        Iterator<Integer> iteratorLast = endList.iterator();
        while (iteratorLast.hasNext()) {
            int size = iteratorLast.next() + 1;
            if ((chars.length) % size != 0) {
                iteratorLast.remove();
            }
        }
        return endList.size() != 0;
    }
}
