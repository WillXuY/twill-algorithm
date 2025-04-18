/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0000_0099.p0028_implement_str_str;

public interface ImplementStrStr {
    /**
     * Implement strStr().
     *
     * Return the index of the first occurrence of needle in haystack,
     * or -1 if needle is not part of haystack.
     *
     * Clarification:
     *
     * What should we return when needle is an empty string? This is a
     * great Question to ask during an interview.
     *
     * For the purpose of this problem, we will return 0 when needle is
     * an empty string. This is consistent to C's strstr() and Java's
     * indexOf()
     *
     * @param haystack 0 <= haystack.length <= 5 * 10^4
     *                 consist of only lower-case English characters.
     * @param needle 0 <= needle.length <= 5 * 10^4
     *                 consist of only lower-case English characters.
     * @return index of substring
     */
    int strStr(String haystack, String needle);
}
