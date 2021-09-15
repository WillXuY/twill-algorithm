package org.willxu.algorithm.service.integer;

public interface NumberOfSegmentsInaString {
    /**
     * You are given a string s, return the number of segments in the
     * string.
     * A segment is defined to be a contiguous sequence of non-space
     * characters.
     *
     * @param s 0 <= s.length <= 300
     *          consists of lower-case and upper-case English letters,
     *          digits or one of the following characters
     *          "!@#$%^&*()_-+=',.:".
     *          The only space character in s is ' '.
     * @return count of segments.
     */
    int countSegments(String s);
}
