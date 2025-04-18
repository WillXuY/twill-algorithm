package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.CountPrefixesOfGivenString;

public class CountPrefixesOfGivenStringRegex
        implements CountPrefixesOfGivenString {
    @Override
    public int countPrefixes(String[] words, String s) {
        int output = 0;
        for (String w: words) {
            String regex = "^" + w + ".*";
            if ("".equals(s.replaceAll(regex, ""))) {
                output++;
            }
        }
        return output;
    }
}
