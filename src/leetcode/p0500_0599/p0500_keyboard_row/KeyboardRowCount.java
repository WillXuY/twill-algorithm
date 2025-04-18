package org.willxu.algorithm.service.impl.strlist;

import org.willxu.algorithm.service.strlist.KeyboardRow;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KeyboardRowCount implements KeyboardRow {
    @Override
    public String[] findWords(String[] words) {
        Set<Character> set1 = Stream.of(
                'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p',
                'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P'
        ).collect(Collectors.toSet());
        Set<Character> set2 = Stream.of(
                'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l',
                'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L'
        ).collect(Collectors.toSet());
        Set<Character> set3 = Stream.of(
                'z', 'x', 'c', 'v', 'b', 'n', 'm',
                'Z', 'X', 'C', 'V', 'B', 'N', 'M'
        ).collect(Collectors.toSet());
        List<String> result = new ArrayList<>();
        for (String s: words) {
            int contains = 0;
            for (char c: s.toCharArray()) {
                if (set1.contains(c) && (contains & 1) != 1) {
                    contains += 1;
                } else if (set2.contains(c) && (contains & 2) != 2) {
                    contains += 2;
                } else if (set3.contains(c) && (contains & 4) != 4) {
                    contains += 4;
                }
                if (contains != 1 && contains != 2 && contains != 4) {
                    break;
                }
            }
            if (contains == 1 || contains == 2 || contains == 4) {
                result.add(s);
            }
        }
        String[] output = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            output[i] = result.get(i);
        }
        return output;
    }
}
