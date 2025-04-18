package leetcode.p1300_1399.p1370_increasing_decreasing_string;

public interface IncreasingDecreasingString {
    /**
     * You are given a string s. Recorder the string using the following
     * algorithm:
     * 1. Pick the smallest character from s and append it to the
     *    result.
     * 2. Pick the smallest character from s which is grater than the
     *    last appended character to the result and append it.
     * 3. Repeat step 2 until you cannot pick more characters.
     * 4. Pick the largest character from s and append it to the result.
     * 5. Pick the largest character from s which is smaller than the
     *    last appended character to the result and append it.
     * 6. Repeat step 5 until you cannot pick more characters.
     * 7. Repeat the steps from 1 to 6 until you pick all characters
     *    from s.
     * In each step, If the smallest or the largest character appears
     * more than once you can choose any occurrence and append it to the
     * result.
     * Return the result string after sorting s with this algorithm.
     *
     * @param s 1 <= s.length <= 500
     *          consists of only lowercase English letters.
     * @return sorted string of s.
     */
    String sortString(String s);
}
