package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.CountCommonWordsWithOneOccurrence;

import java.util.HashSet;
import java.util.Set;

public class CountCommonWordsWithOneOccurrenceRetain
        implements CountCommonWordsWithOneOccurrence {
    @Override
    public int countWords(String[] words1, String[] words2) {
        Set<String> set1 = getOneOccurrenceWord(words1);
        Set<String> set2 = getOneOccurrenceWord(words2);
        Set<String> output = new HashSet<>(set1);
        output.retainAll(set2);
        return output.size();
    }

    private Set<String> getOneOccurrenceWord(String[] words) {
        Set<String> output = new HashSet<>();
        Set<String> exist = new HashSet<>();
        for (String w: words) {
            if (exist.contains(w)) {
                output.remove(w);
            } else {
                output.add(w);
                exist.add(w);
            }
        }
        return output;
    }
}
