package leetcode.p1600_1699.p1684_count_the_number_of_consistent_strings;

import java.util.HashSet;
import java.util.Set;

public class CountTheNumberOfConsistentStringsSet
        implements CountTheNumberOfConsistentStrings {
    @Override
    public int countConsistentStrings(String allowed, String[] words) {
        int output = 0;
        Set<Character> set = new HashSet<>();
        for (char c: allowed.toCharArray()) {
            set.add(c);
        }
        for (String w: words) {
            boolean consistentString = true;
            for (char c: w.toCharArray()) {
                if (!set.contains(c)) {
                    consistentString = false;
                    break;
                }
            }
            if (consistentString) {
                output++;
            }
        }
        return output;
    }
}
