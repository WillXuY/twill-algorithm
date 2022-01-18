package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.VerifyingAnAlienDictionary;

public class VerifyingAndAlienDictionaryLoop
        implements VerifyingAnAlienDictionary {
    /**
     * 1. Compare two followed words's order.
     *
     * @param words 1 <= words.length <= 100
     *              1 <= words[i].length <= 20
     * @param order order.length = 26
     *              All characters in words[i] and order are English
     *              lowercase letters.
     * @return is sorted words.
     */
    @Override
    public boolean isAlienSorted(String[] words, String order) {
        for (int i = 1; i < words.length; i++) {
            boolean sorted = compareTwoWords(words[i - 1], words[i], order);
            if (!sorted) {
                return false;
            }
        }
        return true;
    }

    /**
     * 1. Compare two words' order.
     * 2. Previous word < latter word.
     * 3. Compare every char in two word,
     *    find first charP <= charL ('' < /./).
     *
     * @param previous check char in previous > latter.
     * @param latter latter word.
     * @param order chars' order.
     * @return is char in previous > char in latter.
     */
    private boolean compareTwoWords(
            String previous, String latter, String order) {
        char[] charP = previous.toCharArray();
        char[] charL = latter.toCharArray();
        for (int i = 0; i < charP.length && i < charL.length; i++) {
            int indexP = order.indexOf(charP[i]);
            int indexL = order.indexOf(charL[i]);
            if (indexP > indexL) {
                return false;
            } else if (indexP < indexL) {
                return true;
            }
        }
        return previous.length() <= latter.length();
    }
}
