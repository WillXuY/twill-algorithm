package leetcode.p0000_0099.p0017_letter_combinations_of_phone_number;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LetterCombinationsOfPhoneNumberArray
        implements LetterCombinationsOfPhoneNumber {
    @Override
    public List<String> letterCombinations(String digits) {
        if ("".equals(digits) || digits == null) {
            return Collections.emptyList();
        }
        char[][] mapArray = new char[][] {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'},
                {'j', 'k', 'l'},
                {'m', 'n', 'o'},
                {'p', 'q', 'r', 's'},
                {'t', 'u', 'v'},
                {'w', 'x', 'y', 'z'}
        };
        List<String> output = new ArrayList<>();
        output.add("");
        for (char c: digits.toCharArray()) {
            char[] array = mapArray[c - '2'];
            List<String> next = new ArrayList<>();
            for (String o: output) {
                for (char a: array) {
                    next.add(o + a);
                }
            }
            output = next;
        }
        return output;
    }
}
