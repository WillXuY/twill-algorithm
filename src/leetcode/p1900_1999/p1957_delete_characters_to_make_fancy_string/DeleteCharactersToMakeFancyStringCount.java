package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.DeleteCharactersToMakeFancyString;

public class DeleteCharactersToMakeFancyStringCount
        implements DeleteCharactersToMakeFancyString {
    @Override
    public String makeFancyString(String s) {
        StringBuilder output = new StringBuilder();
        int count = 0;
        char lastChar = 0;
        for (char c: s.toCharArray()) {
            if (c == lastChar) {
                count++;
            } else {
                lastChar = c;
                count = 1;
            }
            if (count < 3) {
                output.append(c);
            }
        }
        return output.toString();
    }
}
