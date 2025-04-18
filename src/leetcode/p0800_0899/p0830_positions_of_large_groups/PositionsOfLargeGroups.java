/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.matrix;

import java.util.List;

public interface PositionsOfLargeGroups {
    /**
     * In a string s of lowercase letters, these letters form
     * consecutive groups of the same character.
     * For example, a string like s = "abbxxxxzyy" has the groups "a",
     * "bb", "xxxx", "z", and "yy".
     * A group is identified by an interval [start, end], where start
     * and end denote the start and end indices (inclusive) of the
     * group. In the above example, "xxxx" has the interval [3, 6].
     * A group is considered large if it has 3 or more characters.
     * Return the intervals of every large group sorted in increasing
     * order by start index.
     *
     * @param s 1 <= s.length <= 1000
     *          contains lower-case English letters only.
     * @return the list of large groups' start and end index.
     */
    List<List<Integer>> largeGroupPositions(String s);
}
