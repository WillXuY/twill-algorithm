/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0800_0899.p0824_goat_latin;

public interface GoatLatin {
    /**
     * You are given a string sentence that consist of words separated
     * by spaces. Each word consists of lowercase and uppercase letters
     * only.
     * We would like to convert the sentence to "Goat Latin" (a made-up
     * language similar to Pig Latin.) The rules of Goat Latin are as
     * follows:
     * - If a word begins with a vowel('a', 'e', 'i', 'o', or 'u'),
     *   append "ma" to the end of the word.
     *   - For example, the word "apple" becomes "applema".
     * - If a word begins with a consonant (i.e., not a vowel), remove
     *   the first letter and append it to the end, ten add "ma".
     *   - For example, the word "goat" becomes "oatgma".
     * - Add one letter 'a' to the end of each word per its word index
     *   in the sentence, starting with 1.
     *   - For example, the first word gets "a" added to the end, the
     *     second word gets "aa" added to the end, and so on.
     * Return the final sentence representing the conversion from
     * sentence to Goat Latin.
     *
     * @param sentence 1 <= sentence.length <= 150
     *                 consists of English letters and spaces.
     *                 has no leading or trailing spaces.
     *                 All the words in sentence are separated by a
     *                 single space.
     * @return the Goat Latin sentence.
     */
    String toGoatLatin(String sentence);
}
