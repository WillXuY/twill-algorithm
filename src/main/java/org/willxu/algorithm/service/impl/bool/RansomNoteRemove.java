package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.RansomNote;

import java.util.HashMap;

public class RansomNoteRemove implements RansomNote {
    @Override
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineSet = new HashMap<>();
        for (Character c: magazine.toCharArray()) {
            if (magazineSet.containsKey(c)) {
                magazineSet.put(c, magazineSet.get(c) + 1);
            } else {
                magazineSet.put(c, 1);
            }
        }
        for (Character c: ransomNote.toCharArray()) {
            if (!magazineSet.containsKey(c)) {
                return false;
            }
            int number = magazineSet.get(c);
            if (number == 0) {
                return false;
            }
            magazineSet.put(c, number - 1);
        }
        return true;
    }
}
