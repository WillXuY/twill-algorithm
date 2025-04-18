package leetcode.p1800_1899.p1805_number_of_different_integers_in_string;

import java.util.HashSet;
import java.util.Set;

public class NumberOfDifferentIntegersInStringSet
        implements NumberOfDifferentIntegersInString {
    @Override
    public int numDifferentIntegers(String word) {
        Set<String> digitsSet = new HashSet<>();
        StringBuilder digitBuilder = new StringBuilder();
        for (char c: word.toCharArray()) {
            if (c >= '0' && c <= '9') {
                if (digitBuilder.length() == 1
                        && digitBuilder.charAt(0) == '0' ) {
                    digitBuilder.deleteCharAt(0);
                }
                digitBuilder.append(c);
            } else if (digitBuilder.length() > 0) {
                digitsSet.add(digitBuilder.toString());
                digitBuilder = new StringBuilder();
            }
        }
        if (digitBuilder.length() > 0) {
            digitsSet.add(digitBuilder.toString());
        }
        return digitsSet.size();
    }
}
