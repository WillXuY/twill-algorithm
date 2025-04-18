/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0800_0899.p0819_most_common_word;

public interface MostCommonWord {
    /**
     * Given a string paragraph and a string array of the banned words
     * banned, return the most frequent word that is not banned. It is
     * guaranteed there is at least one word that is not banned, and
     * that the answer is unique.
     * The words in paragraph are case-insensitive and the answer should
     * be returned int lowercase.
     *
     * @param paragraph 1 <= paragraph.length <= 1000
     *                  consists of English letters, space ' ', or one
     *                  of the symbols: "!?',:.".
     * @param banned 0 <= banned.length <= 100
     *               1 <= banned[i].length <= 10
     *               banned[i] consists of only lowercase English letters
     * @return most common lowercase word banned the banned words.
     */
    String mostCommonWord(String paragraph, String[] banned);
}
