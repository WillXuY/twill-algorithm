package org.example.example.service.impl.integer;

import org.example.example.service.integer.LengthOfLastWord;

public class LengthOfLastWordBruteForce implements LengthOfLastWord {
    @Override
    public int lengthOfLastWord(String s) {
        String[] split = s.split(" ");
        return split.length == 0 ? 0 : split[split.length - 1].length();
    }
}
