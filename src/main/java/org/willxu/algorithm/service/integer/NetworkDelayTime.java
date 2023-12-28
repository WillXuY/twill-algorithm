package org.willxu.algorithm.service.integer;

public interface NetworkDelayTime {
    /**
     * You are given a network of n nodes, labeled from 1 to n. You are
     * also given times, a list of travel times as directed edges
     * times[i] = (u_i, v_i, w_i), where u_i is the source node, v_i is
     * the target node, and wi is the time it takes for a signal to
     * travel from source to target.
     * <p>
     * We will send a signal from a given node k. Return the minimum
     * time it takes for all the n nodes to receive the signal. If it is
     * impossible for all the n nodes to receive the signal, return -1.
     *
     * @param times 1 <= times.length <= 6000
     *              times[i].length == 3
     * @param n,k 1 <= k <= n <= 100
     *            1 <= u_i, v_i <= n
     *            u_i != v_i
     *            0 <= w_i <= 100
     *            All the pairs (u_i, v_i) are unique.
     *            (i.e., no multiple edges.)
     */
    int networkDelayTime(int[][] times, int n, int k);
}
