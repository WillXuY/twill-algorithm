package org.willxu.algorithm.service.impl.character;

import org.willxu.algorithm.service.character.FirstLetterToAppearTwice;

import java.util.HashSet;
import java.util.Set;

public class FirstLetterToAppearTwiceSet
        implements FirstLetterToAppearTwice {
    @Override
    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        for (char c: s.toCharArray()) {
            if (set.contains(c)) {
                return c;
            } else {
                set.add(c);
            }
        }
        return 0;
    }
}
