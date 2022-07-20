package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.TruncateSentence;

public class TruncateSentenceCount implements TruncateSentence {
    @Override
    public String truncateSentence(String s, int k) {
        StringBuilder output = new StringBuilder();
        int countWords = 1;
        for (char c: s.toCharArray()) {
            if (c == ' ') {
                countWords++;
                if (countWords > k) {
                    break;
                }
            }
            output.append(c);
        }
        return output.toString();
    }
}
