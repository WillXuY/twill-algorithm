package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.CapitalizeTheTitle;

public class CapitalizeTheTitleLoop implements CapitalizeTheTitle {
    @Override
    public String capitalizeTitle(String title) {
        boolean lastSpace = true;
        char[] chars = title.toCharArray();
        int length = chars.length;
        char[] output = new char[length];
        int diff = 'a' - 'A';
        int wordLength = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] == ' ') {
                char upperChar = output[i - wordLength];
                if (wordLength <= 2 && upperChar <= 'Z') {
                    output[i - wordLength] = (char) (upperChar + diff);
                }
                output[i] = ' ';
                lastSpace = true;
                wordLength = 0;
            } else if (lastSpace) {
                if (chars[i] >= 'a') {
                    output[i] = (char) (chars[i] - diff);
                } else {
                    output[i] = chars[i];
                }
                wordLength++;
                lastSpace = false;
            } else {
                if (chars[i] <= 'Z') {
                    output[i] = (char) (chars[i] + diff);
                } else {
                    output[i] = chars[i];
                }
                wordLength++;
            }
        }
        char upperChar = output[length - wordLength];
        if (wordLength <= 2 && upperChar <= 'Z') {
            output[length - wordLength] = (char) (upperChar + diff);
        }
        return new String(output);
    }
}
