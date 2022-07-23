package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.CheckIfTheSentenceIsPangram;

public class CheckIfTheSentenceIsPangramArray
        implements CheckIfTheSentenceIsPangram {
    @Override
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        boolean[] containsAscii = new boolean[26];
        for (char s: sentence.toCharArray()) {
            int index = s - 'a';
            containsAscii[index] = true;
        }
        for (boolean c: containsAscii) {
            if (!c) {
                return false;
            }
        }
        return true;
    }
}
