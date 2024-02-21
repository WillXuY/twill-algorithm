package org.willxu.algorithm.service.doublepoint;

public interface New21Game {
    /**
     * Alice plays the following game, loosely based on the card game
     * "21".
     * <p>
     * Alice starts with 0 points and draws numbers while she has less
     * than k points. During each draw, she gains an integer number of
     * points randomly from the range [1, maxPts], where maxPts is an
     * integer. Each draw is independent and the outcomes have equal
     * probabilities.
     * <p>
     * Alice stops drawing numbers when she gets k or more points.
     * <p>
     * Return the probability that Alice has n or fewer points.
     * <p>
     * Answers within 10-5 of the actual answer are considered accepted.
     *
     * @param n,k 0 <= k <= n <= 10^4
     * @param maxPts 1 <= maxPts <= 10^4
     */
    double new21Game(int n, int k, int maxPts);
}
