package org.willxu.algorithm.service.impl.strlist;

import org.willxu.algorithm.service.strlist.FindCommonCharacters;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindCommonCharactersCompare implements FindCommonCharacters {
    /**
     * 1. Get first word's char list.
     * 2. Compare all the other words.
     *
     * @param words 1 <= words.length <= 100
     *              1 <= words[i].length <= 100
     *              consists of lowercase English letters.
     * @return the remains char list.
     */
    @Override
    public List<String> commonChars(String[] words) {
        List<Character> charList = new ArrayList<>();
        for (char c: words[0].toCharArray()) {
            charList.add(c);
        }
        for (String w: words) {
            Iterator<Character> iterator = charList.iterator();
            while (iterator.hasNext()) {
                char c = iterator.next();
                int index = w.indexOf(c);
                if (index == -1) {
                    iterator.remove();
                } else {
                    w = w.replaceFirst(String.valueOf(c), "");
                }
            }
        }
        List<String> output = new ArrayList<>();
        for (char c: charList) {
            output.add(String.valueOf(c));
        }
        return output;
    }
}
