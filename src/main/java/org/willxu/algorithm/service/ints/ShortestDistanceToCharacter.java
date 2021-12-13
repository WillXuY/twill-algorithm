/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.ints;

public interface ShortestDistanceToCharacter {
    /**
     * Given a string s and character c that occurs in s, return an
     * array of integers answer where answer.length == s.length and
     * answer[i] is the distance from index i to the closest occurrence
     * of character c in s.
     * The distance between two indices i and j is abs(i - j), where abs
     * is the absolute value function.
     *
     * @param s 1 <= s.length <= 10^4
     *          s[i] is lowercase English letter.
     *          It is guaranteed that c occurs at least onece in s.
     * @param c is lowercase English letter.
     *          It is guaranteed that c occurs at least onece in s.
     * @return the shortest length to c.
     */
    int[] shortestToChar(String s, char c);
}
