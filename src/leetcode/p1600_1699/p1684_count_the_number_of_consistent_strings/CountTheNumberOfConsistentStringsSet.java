package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.CountTheNumberOfConsistentStrings;

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
