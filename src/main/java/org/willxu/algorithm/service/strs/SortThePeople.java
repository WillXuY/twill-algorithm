package org.willxu.algorithm.service.strs;

public interface SortThePeople {
    /**
     * You are given an array of strings names, and an array heights
     * that consists of distinct positive integers. Both arrays are of
     * length n.
     * <p>
     * For each index i, names[i] and heights[i] denote the name and
     * height of the ith person.
     * <p>
     * Return names sorted in descending order by the people's heights.
     *
     * @param names n == names.length == heights.length
     *              1 <= n <= 103
     *              1 <= names[i].length <= 20
     *              names[i] consists of lower and upper case English
     *              letters.
     * @param heights 1 <= heights[i] <= 105
     *                All the values of heights are distinct.
     */
    String[] sortPeople(String[] names, int[] heights);
}
