package org.willxu.algorithm.service.matrix;

public interface QueueReconstructionByHeight {
    /**
     * You are given an array of people, people, which are the
     * attributes of some people in a queue (not necessarily in order).
     * Each people[i] = [h_i, k_i] represents the i^th person of height
     * h_i with exactly k_i other people in front who have a height
     * greater than or equal to h_i.
     * <p>
     * Reconstruct and return the queue that is represented by the input
     * array people. The returned queue should be formatted as an array
     * queue, where queue[j] = [h_j, k_j] is the attributes of the j_th
     * person in the queue (queue[0] is the person at the front of the
     * queue).
     *
     * @param people 1 <= people.length <= 2000
     *               0 <= h_i <= 10^6
     *               0 <= k_i < people.length
     *               It is guaranteed that the queue can be
     *               reconstructed.
     */
    int[][] reconstructQueue(int[][] people);
}
