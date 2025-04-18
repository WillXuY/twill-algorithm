package leetcode.p0200_0299.p0290_word_pattern;

public interface WordPattern {
    /**
     * Given a pattern and a string s, find if s follows the same
     * pattern.
     * Here follow means a full match, such that there is a bijection
     * between a letter in pattern and a non-empty word in s.
     *
     * @param pattern 1 <= pattern.length <= 300
     *                contains only lower-case English letters.
     * @param s 1 <= s.length <= 3000
     *          contains only lower-case English letters and spaces ' '.
     *          does not contain any leading or trailing spaces.
     *          All the words in s are separated by a single space.
     * @return is the s follows the pattern.
     */
    boolean wordPattern(String pattern, String s);
}
