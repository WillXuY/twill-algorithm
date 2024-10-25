package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface GroupThePeopleGivenTheGroupSizeTheyBelongTo {
    /**
     * There are n people that are split into some unknown number of
     * groups. Each person is labeled with a unique ID from 0 to n - 1.
     * <p>
     * You are given an integer array groupSizes, where groupSizes[i] is
     * the size of the group that person i is in. For example, if
     * groupSizes[1] = 3, then person 1 must be in a group of size 3.
     * <p>
     * Return a list of groups such that each person i is in a group of
     * size groupSizes[i].
     * <p>
     * Each person should appear in exactly one group, and every person
     * must be in a group. If there are multiple answers, return any of
     * them. It is guaranteed that there will be at least one valid
     * solution for the given input.
     *
     * @param groupSizes groupSizes.length == n
     *                   1 <= n <= 500
     *                   1 <= groupSizes[i] <= n
     */
    List<List<Integer>> groupThePeople(int[] groupSizes);
}
