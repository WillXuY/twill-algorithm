/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.string;

public interface ShortestCompletingWord {
    /**
     * Given a string license Plate and an array of strings words, find
     * the shortest completing word in words.
     * A completing word is a word that contains all the letters in
     * licensePlate. Ignore numbers and spaces in licensePlate, and
     * treat letters as case insensitive. If a letter appears more than
     * once in licensePlate, then it must appear in the word the same
     * number of times or more.
     * For example, if licensePlate = "aBc 12c", then it contains
     * letters 'a', 'b'(ignoring case), and 'c' twice. Possible
     * completing words are "abccdef", "caaacab", and "cbca".
     * Return the shortest completing word in words. It is guaranteed an
     * answer exists. If there are multiple shortest completing words,
     * return the first one that occurs in words.
     *
     * @param licensePlate 1 <= licensePlate.length <= 7
     *                     licensePlate contains digits, letters
     *                     (uppercase or lowercase), or space ' '.
     * @param words 1 <= words.length <= 1000
     *              1 <= words[i].length <= 15
     *              words[i] consists of lower case English letters.
     * @return the shortest completing word.
     */
    String shortestCompletingWord(String licensePlate, String[] words);
}
