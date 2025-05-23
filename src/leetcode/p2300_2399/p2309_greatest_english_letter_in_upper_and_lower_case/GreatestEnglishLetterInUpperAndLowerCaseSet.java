package leetcode.p2300_2399.p2309_greatest_english_letter_in_upper_and_lower_case;

import java.util.HashSet;
import java.util.Set;

public class GreatestEnglishLetterInUpperAndLowerCaseSet
        implements GreatestEnglishLetterInUpperAndLowerCase {
    @Override
    public String greatestLetter(String s) {
        int asciiDiff = 32;
        char output = '-';
        Set<Character> exist = new HashSet<>();
        for (char c: s.toCharArray()) {
            if (c >= 'a') {
                char upper = (char) (c - asciiDiff);
                if (exist.contains(upper) && upper > output) {
                    output = upper;
                }
            } else {
                char lower = (char) (c + asciiDiff);
                if (exist.contains(lower) && c > output) {
                    output = c;
                }
            }
            exist.add(c);
        }
        if ('-' == output) {
            return "";
        } else {
            return String.valueOf(output);
        }
    }
}
