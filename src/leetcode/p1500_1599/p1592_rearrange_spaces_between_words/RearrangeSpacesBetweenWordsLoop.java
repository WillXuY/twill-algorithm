package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.RearrangeSpacesBetweenWords;

import java.util.ArrayList;
import java.util.List;

public class RearrangeSpacesBetweenWordsLoop
        implements RearrangeSpacesBetweenWords {
    @Override
    public String reorderSpaces(String text) {
        List<String> words = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        int countSpaces = 0;
        for (char c: text.toCharArray()) {
            if (c == ' ') {
                countSpaces++;
                if (stringBuilder.length() > 0) {
                    words.add(stringBuilder.toString());
                    stringBuilder = new StringBuilder();
                }
            } else {
                stringBuilder.append(c);
            }
        }
        if (stringBuilder.length() > 0) {
            words.add(stringBuilder.toString());
            stringBuilder = new StringBuilder();
        }
        if (words.size() == 1) {
            stringBuilder.append(words.get(0));
            stringBuilder.append(" ".repeat(Math.max(0, countSpaces)));
            return stringBuilder.toString();
        }
        int countBetween = countSpaces / (words.size() - 1);
        int countRemain = countSpaces % (words.size() - 1);
        String between = " ".repeat(Math.max(0, countBetween));
        for (int i = 0; i < words.size() - 1; i++) {
            stringBuilder.append(words.get(i)).append(between);
        }
        stringBuilder.append(words.get(words.size() - 1));
        stringBuilder.append(" ".repeat(Math.max(0, countRemain)));
        return stringBuilder.toString();
    }
}
