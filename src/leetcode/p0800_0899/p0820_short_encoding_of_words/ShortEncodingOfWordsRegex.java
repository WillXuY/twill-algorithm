package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.ShortEncodingOfWords;

import java.util.HashSet;
import java.util.Set;

public class ShortEncodingOfWordsRegex implements ShortEncodingOfWords {
    @Override
    public int minimumLengthEncoding(String[] words) {
        Set<String> notMatchSet = new HashSet<>();
        Set<String> includedSet = new HashSet<>();
        for (String w: words) {
            if (includedSet.contains(w)) {
                continue;
            }
            notMatchSet.add(w);
            includedSet.add(w);
            for (int i = 1; i < w.length(); i++) {
                String include = w.substring(i);
                includedSet.add(include);
                notMatchSet.remove(include);
            }
        }
        int result = 0;
        for (String n: notMatchSet) {
            result += n.length() + 1;
        }
        return result;
    }
}
