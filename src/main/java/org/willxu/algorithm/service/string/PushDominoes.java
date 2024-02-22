package org.willxu.algorithm.service.string;

public interface PushDominoes {
    /**
     * There are n dominoes in a line, and we place each domino
     * vertically upright. In the beginning, we simultaneously push some
     * of the dominoes either to the left or to the right.
     * <p>
     * After each second, each domino that is falling to the left pushes
     * the adjacent domino on the left. Similarly, the dominoes falling
     * to the right push their adjacent dominoes standing on the right.
     * <p>
     * When a vertical domino has dominoes falling on it from both
     * sides, it stays still due to the balance of the forces.
     * <p>
     * For the purposes of this question, we will consider that a
     * falling domino expends no additional force to a falling or
     * already fallen domino.
     * <p>
     * You are given a string dominoes representing the initial state
     * where:
     * <p>
     * - dominoes[i] = 'L', if the ith domino has been pushed to the
     *   left,
     * - dominoes[i] = 'R', if the ith domino has been pushed to the
     *   right, and
     * - dominoes[i] = '.', if the ith domino has not been pushed.
     * <p>
     * Return a string representing the final state.
     *
     * @param dominoes n == dominoes.length
     *                 1 <= n <= 10^5
     *                 dominoes[i] is either 'L', 'R', or '.'.
     */
    String pushDominoes(String dominoes);
}
