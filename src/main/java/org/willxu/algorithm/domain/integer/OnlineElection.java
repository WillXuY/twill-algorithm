package org.willxu.algorithm.domain.integer;

/**
 * You are given two integer arrays persons and times. In an election,
 * the i^th vote was cast for persons[i] at time times[i].
 * <p>
 * For each query at a time t, find the person that was leading the
 * election at time t. Votes cast at time t will count towards our
 * query. In the case of a tie, the most recent vote (among tied
 * candidates) wins.
 * <p>
 * Implement the TopVotedCandidate class:
 * <p>
 * 1 <= persons.length <= 5000
 * times.length == persons.length
 * 0 <= persons[i] < persons.length
 * 0 <= times[i] <= 10^9
 * times is sorted in a strictly increasing order.
 * At most 10^4 calls will be made to q.
 * - TopVotedCandidate(int[] persons, int[] times) Initializes the
 *   object with the persons and times arrays.
 */
public interface OnlineElection {
    /**
     * @param t times[0] <= t <= 10^9
     * @return the number of the person that was leading the election at
     *         time t according to the mentioned rules.
     */
    int q(int t);
}
