package leetcode.p0700_0799.p0784_letter_case_permutation;

import java.util.List;

public interface LetterCasePermutation {
    /**
     * Given a string s, you can transform every letter individually to
     * be lowercase or uppercase to create another string.
     * <p>
     * Return a list of all possible strings we could create. Return the
     * output in any order.
     *
     * @param s 1 <= s.length <= 12
     *          consists of lowercase English letters, uppercase English
     *          letters, and digits.
     */
    List<String> letterCasePermutation(String s);
}
