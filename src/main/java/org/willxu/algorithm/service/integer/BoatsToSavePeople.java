package org.willxu.algorithm.service.integer;

public interface BoatsToSavePeople {
    /**
     * You are given an array people where people[i] is the weight of
     * the i^th person, and an infinite number of boats where each boat
     * can carry a maximum weight of limit. Each boat carries at most
     * two people at the same time, provided the sum of the weight of
     * those people is at most limit.
     * <p>
     * Return the minimum number of boats to carry every given person.
     *
     * @param people 1 <= people.length <= 5 * 10^4
     * @param limit 1 <= people[i] <= limit <= 3 * 10^4
     */
    int numRescueBoats(int[] people, int limit);
}
