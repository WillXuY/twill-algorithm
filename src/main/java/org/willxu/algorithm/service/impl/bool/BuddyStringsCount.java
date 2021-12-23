/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.BuddyStrings;

import java.util.HashSet;
import java.util.Set;

public class BuddyStringsCount implements BuddyStrings {
    /**
     * 1. length must be same, and length > 1.
     * 2. loop by index, save the diff index, and count diff,
     *    if count > 2 return false.
     * 3. if countDiff == 1, return false.
     * 4. if countDiff == 2, compare two letters.
     * 5. if countDiff == 0, if there are two same letters in one string.
     */
    @Override
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        } else if (s.length() <= 1) {
            return false;
        }
        char[] charsS = s.toCharArray();
        char[] charsGoal = goal.toCharArray();
        int firstDiff = -1;
        int secondDiff = -1;
        int countDiff = 0;
        Set<Character> charSetS = new HashSet<>();
        boolean containsTwoSameLetters = false;
        for (int i = 0; i < charsS.length; i++) {
            if (charsS[i] != charsGoal[i]) {
                switch (countDiff) {
                    case 0:
                        firstDiff = i;
                        countDiff++;
                        break;
                    case 1:
                        secondDiff = i;
                        countDiff++;
                        break;
                    default:
                        return false;
                }
            } else {
                if (containsTwoSameLetters) {
                    continue;
                }
                if (charSetS.contains(charsS[i])) {
                    containsTwoSameLetters = true;
                    charSetS.clear();
                } else {
                    charSetS.add(charsS[i]);
                }
            }

        }
        return switch (countDiff) {
            case 0 -> containsTwoSameLetters;
            case 2 -> charsS[firstDiff] == charsGoal[secondDiff]
                    && charsS[secondDiff] == charsGoal[firstDiff];
            default -> false;
        };
    }
}
