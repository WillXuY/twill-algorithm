package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.MergeStringsAlternately;

public class MergeStringsAlternatelyLoop implements MergeStringsAlternately {
    @Override
    public String mergeAlternately(String word1, String word2) {
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        boolean word1Short = true;
        int shortLength = word1.length();
        if (chars1.length > chars2.length) {
            word1Short = false;
            shortLength = word2.length();
        }
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < shortLength; i++) {
            output.append(chars1[i]).append(chars2[i]);
        }
        if (word1Short) {
            output.append(word2.substring(shortLength));
        } else {
            output.append(word1.substring(shortLength));
        }
        return output.toString();
    }
}
