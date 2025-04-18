package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.NumberOfValidWordsInSentence;

public class NumberOfValidWordsInSentenceLoop
        implements NumberOfValidWordsInSentence {
    @Override
    public int countValidWords(String sentence) {
        int output = 0;
        String[] words = sentence.split(" ");
        for (String w: words) {
            if ("".equals(w)) {
                continue;
            }
            boolean valid = true;
            char[] chars = w.toCharArray();
            int countHyphen = 0;
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if ('0' <= c && c <= '9') {
                    valid = false;
                    break;
                } else if (c == '-') {
                    if (countHyphen > 0 || i == 0 || i == chars.length - 1) {
                        valid = false;
                        break;
                    } else {
                        if ('a' <= chars[i + 1] && chars[i + 1] <= 'z') {
                            countHyphen = 1;
                        } else {
                            valid = false;
                            break;
                        }
                    }
                } else if (c == '!' || c == '.' || c == ',') {
                    if (i != chars.length - 1) {
                        valid = false;
                        break;
                    }
                }
            }
            if (valid) {
                output++;
            }
        }
        return output;
    }
}
