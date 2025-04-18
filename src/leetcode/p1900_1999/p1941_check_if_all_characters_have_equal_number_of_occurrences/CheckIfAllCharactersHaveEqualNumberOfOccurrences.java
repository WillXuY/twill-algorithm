package leetcode.p1900_1999.p1941_check_if_all_characters_have_equal_number_of_occurrences;

public interface CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    /**
     * Given a string s, return true if s is a good string, or false
     * otherwise.
     * <p>
     * A string s is good if all the characters that appear in s have
     * the same number of occurrences (i.e., the same frequency).
     *
     * @param s 1 <= s.length <= 1000
     *          s consists of lowercase English letters.
     */
    boolean areOccurrencesEqual(String s);
}
