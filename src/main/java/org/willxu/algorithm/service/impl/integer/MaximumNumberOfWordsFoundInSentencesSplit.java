package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MaximumNumberOfWordsFoundInSentences;

public class MaximumNumberOfWordsFoundInSentencesSplit
        implements MaximumNumberOfWordsFoundInSentences {
    @Override
    public int mostWordsFound(String[] sentences) {
        int output = 0;
        for (String sentence: sentences) {
            String[] sub = sentence.split(" ");
            int count = 0;
            for (String s: sub) {
                if (!"".equals(s)) {
                    count++;
                }
            }
            if (count > output) {
                output = count;
            }
        }
        return output;
    }
}
