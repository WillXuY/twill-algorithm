/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0500_0599.p0599_minimum_index_sum_of_two_lists;

public interface MinimumIndexSumOfTwoLists {
    /**
     * Suppose Andy and Doris want to choose a restaurant for dinner,
     * and they both have a list of favorite restaurants represented by
     * strings.
     * You need to help them find out their common interest with the
     * least list index sum. If there is a choice tie between answers,
     * output all of them with no order requirement. You could assume
     * there always exists an answer.
     *
     * @param list1 1 <= list1.length <= 1000
     *              1 <= list1[i].length <= 30
     *              consist of spaces ' ' and English letters.
     *              All the strings of list1 are unique.
     * @param list2 1 <= list2.length <= 1000
     *              1 <= list2[i].length <= 30
     *              consist of spaces ' ' and English letters.
     *              All the strings of list2 are unique.
     * @return words has minimum index sum of two lists.
     */
    String[] findRestaurant(String[] list1, String[] list2);
}
