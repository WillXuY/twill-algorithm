package leetcode.p0900_0999.p0917_reverse_only_letters;

public interface ReverseOnlyLetters {
    /**
     * Given a string s, reverse the string according to the following
     * rules:
     * - All the characters that are not English letters remain in the
     *   same position.
     * - All the English letters (lowercase or uppercase) should be
     *   reversed.
     * Return s after reversing it.
     *
     * @param s 1 <= s.length <= 100
     *          consists of characters with ASCII values in the range
     *          [33, 122].
     *          does not contain '\"' or '\\'.
     * @return reverse only letters in s.
     */
    String reverseOnlyLetters(String s);
}
