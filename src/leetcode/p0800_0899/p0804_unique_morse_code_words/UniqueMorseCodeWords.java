/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0800_0899.p0804_unique_morse_code_words;

public interface UniqueMorseCodeWords {
    /**
     * International Morse Code defines a standard encoding where each
     * letter is mapped to a series of dots and dashes, as follows:
     * - 'a' maps to ".-",
     * - 'b' maps to "-...",
     * - 'c' maps to "-.-.", and so on.
     * For convenience, the full table for the 26 letters of the English
     * alphabet is given below:
     * [".-","-...","-.-.","-..",".","..-.","--.",
     * "....","..",".---","-.-",".-..","--","-.",
     * "---",".--.","--.-",".-.","...","-",
     * "..-","...-",".--","-..-","-.--","--.."]
     * Given an array of strings words where each word can be written as
     * a concatenation of the Morse code of each letter.
     * - For example, "cab" can be written as "-.-..--...", which is the
     *   concatenation of "-.-.", ".-", and "-...". We will call such a
     *   concatenation the transformation of a word.
     * Return the number of different transformations among all words we
     * have.
     *
     * @param words 1 <= words.length <= 100
     *              1 <= words[i].length <= 12
     *              consists of lowercase English letters.
     * @return the number of different transformations among all words.
     */
    int uniqueMorseRepresentations(String[] words);
}
