package leetcode.p1500_1599.p1560_most_visited_sector_in_circular_track;

import java.util.List;

public interface MostVisitedSectorInCircularTrack {
    /**
     * Given an integer n and an integer array rounds. We have a
     * circular track which consists of n sectors labeled from 1 to n.
     * A marathon will be held on this track, the marathon consists of m
     * rounds. The ith round starts at sector rounds[i - 1] and ends at
     * sector rounds[i]. For example, round 1 starts at sector rounds[0]
     * and ends at sector rounds[1]
     *
     * Return an array of the most visited sectors sorted in ascending
     * order.
     *
     * Notice that you circulate the track in ascending order of sector
     * numbers in the counter-clockwise direction
     * (See the first example).
     *
     * @param n 2 <= n <= 100
     * @param rounds 1 <= m <= 100
     *               rounds.length == m + 1
     *               1 <= rounds[i] <= n
     *               rounds[i] != rounds[i + 1] for 0 <= i < m
     */
    List<Integer> mostVisited(int n, int[] rounds);
}
