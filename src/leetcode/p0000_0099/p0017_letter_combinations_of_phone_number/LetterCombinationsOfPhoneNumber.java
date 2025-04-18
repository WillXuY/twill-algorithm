package org.willxu.algorithm.service.strlist;

import java.util.List;

public interface LetterCombinationsOfPhoneNumber {
    /**
     * Given a string containing digits from 2-9 inclusive, return all
     * possible letter combinations that the number could represent.
     * Return the answer in any order.
     * <p>
     * A mapping of digits to letters (just like on the telephone
     * buttons) is given below. Note that 1 does not map to any letters.
     *
     * @param digits 0 <= digits.length <= 4
     *               digits[i] is a digit in the range ['2', '9'].
     */
    List<String> letterCombinations(String digits);
}
