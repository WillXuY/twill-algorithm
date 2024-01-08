package org.willxu.algorithm.service.integer;

public interface RabbitsInForest {
    /**
     * There is a forest with an unknown number of rabbits. We asked n
     * rabbits "How many rabbits have the same color as you?" and
     * collected the answers in an integer array answers where
     * answers[i] is the answer of the i^th rabbit.
     * <p>
     * Given the array answers, return the minimum number of rabbits
     * that could be in the forest.
     *
     * @param answers 1 <= answers.length <= 1000
     *                0 <= answers[i] < 1000
     */
    int numRabbits(int[] answers);
}
