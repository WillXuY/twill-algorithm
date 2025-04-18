package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.FindWordsThatCanBeFormedByCharacters;

import java.util.HashMap;
import java.util.Map;

public class FindWordsThatCanBeFormedByCharactersMap
        implements FindWordsThatCanBeFormedByCharacters {
    @Override
    public int countCharacters(String[] words, String chars) {
        int output = 0;
        Map<Character, Integer> test = getMapOfStringChars(chars);
        for (String s: words) {
            Map<Character, Integer> m = getMapOfStringChars(s);
            if (test.keySet().containsAll(m.keySet())) {
                boolean hasEnoughValue = true;
                for (Character c: m.keySet()) {
                    if (m.get(c) > test.get(c)) {
                        hasEnoughValue = false;
                        break;
                    }
                }
                if (hasEnoughValue) {
                    output += s.length();
                }
            }
        }
        return output;
    }

    public Map<Character, Integer> getMapOfStringChars(String string) {
        Map<Character, Integer> output = new HashMap<>();
        for (char c: string.toCharArray()) {
            if (output.containsKey(c)) {
                output.put(c, output.get(c) + 1);
            } else {
                output.put(c, 1);
            }
        }
        return output;
    }
}
