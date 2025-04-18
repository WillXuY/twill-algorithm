package leetcode.p0400_0499.p0434_number_of_segments_ina_string;

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
