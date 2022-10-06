package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.CountingWordsWithGivenPrefix;

public class CountingWordsWithGivenPrefixRegex
        implements CountingWordsWithGivenPrefix {
    @Override
    public int prefixCount(String[] words, String pref) {
        String regex = "^" + pref;
        int output = 0;
        for (String w: words) {
            if (!w.equals(w.replaceAll(regex, ""))) {
                output++;
            }
        }
        return output;
    }
}
