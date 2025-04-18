package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.DetermineIfStringHalvesAreAlike;

public class DetermineIfStringHalvesAreAlikeCount
        implements DetermineIfStringHalvesAreAlike {
    @Override
    public boolean halvesAreAlike(String s) {
        int halfLength = s.length() / 2;
        char[] chars = s.toCharArray();
        int countFirstHalf = 0;
        int countSecondHalf = 0;
        for (int i = 0; i < halfLength; i++) {
            int secondIndex = chars.length - i - 1;
            if (isVowel(chars[i])) {
                countFirstHalf++;
            }
            if (isVowel(chars[secondIndex])) {
                countSecondHalf++;
            }
        }
        return countFirstHalf == countSecondHalf;
    }

    public boolean isVowel(char c) {
        return switch (c) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true;
            default -> false;
        };
    }
}
