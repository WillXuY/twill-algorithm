package org.willxu.algorithm.service.impl.strs;

import org.willxu.algorithm.service.strs.UncommonWordsFromTwoSentences;

import java.util.HashSet;
import java.util.Set;

public class UncommonWordsFromTwoSentencesSet
        implements UncommonWordsFromTwoSentences {
    /**
     * Define sets save unique and all words of s1 and s2.
     *
     * @param s1 1 <= s1.length <= 200
     *           consist of lowercase English letters and spaces.
     *           do not have leading or trailing spaces.
     *           All the words in s1 are separated by a single space.
     * @param s2 1 <= s2.length <= 200
     *           consist of lowercase English letters and spaces.
     *           do not have leading or trailing spaces.
     *           All the words in s2 are separated by a single space.
     * @return unique set words.
     */
    @Override
    public String[] uncommonFromSentences(String s1, String s2) {
        Set<String> exitWordSet = new HashSet<>();
        Set<String> uniqueSet = new HashSet<>();
        for (String s: s1.split(" ")) {
            if (exitWordSet.contains(s)) {
                uniqueSet.remove(s);
            } else {
                uniqueSet.add(s);
            }
            exitWordSet.add(s);
        }
        for (String s: s2.split(" ")) {
            if (exitWordSet.contains(s)) {
                uniqueSet.remove(s);
            } else {
                uniqueSet.add(s);
            }
            exitWordSet.add(s);
        }
        return uniqueSet.toArray(new String[0]);
    }
}
