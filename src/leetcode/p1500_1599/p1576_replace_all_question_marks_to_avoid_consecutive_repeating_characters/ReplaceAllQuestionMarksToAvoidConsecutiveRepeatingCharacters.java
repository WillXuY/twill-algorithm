package leetcode.p1500_1599.p1576_replace_all_question_marks_to_avoid_consecutive_repeating_characters;

public interface ReplaceAllQuestionMarksToAvoidConsecutiveRepeatingCharacters {
    /**
     * Given a string s containing only lowercase English letters and
     * the '?' character, convert all the '?' characters into lowercase
     * letters such that the final string does not contain any
     * consecutive repeating characters. You cannot modify the non '?'
     * characters.
     *
     * It is guaranteed that there are no consecutive repeating
     * characters in the given string except for '?'.
     *
     * Return the final string after all the conversions (possibly zero)
     * have been made. If there is more than one solution, return any of
     * them. It can be shown that an answer is always possible with the
     * given constraints.
     *
     * @param s 1 <= s.length <= 100
     *          s consist of lowercase English letters and '?'.
     */
    String modifyString(String s);
}
