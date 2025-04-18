package org.willxu.algorithm.service.impl.strlist;

import org.willxu.algorithm.service.strlist.PrintWordsVertically;

import java.util.ArrayList;
import java.util.List;

public class PrintWordsVerticallyLoop implements PrintWordsVertically {
    @Override
    public List<String> printVertically(String s) {
        String[] words = s.split(" ");
        List<String> result = new ArrayList<>();
        int index = 0;
        while (index < s.length()) {
            StringBuilder sb = new StringBuilder();
            for (String word : words) {
                if (index < word.length()) {
                    sb.append(word.charAt(index));
                } else {
                    sb.append(" ");
                }
            }
            String r = sb.toString().replaceFirst(" *$", "");
            if (r.isEmpty()) {
                break;
            }
            result.add(r);
            index++;
        }
        return result;
    }
}
