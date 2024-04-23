package org.willxu.algorithm.service.bool;

public interface ValidateStackSequences {
    /**
     * Given two integer arrays pushed and popped each with distinct
     * values, return true if this could have been the result of a
     * sequence of push and pop operations on an initially empty stack,
     * or false otherwise.
     *
     * @param pushed 1 <= pushed.length <= 1000
     *               0 <= pushed[i] <= 1000
     *               All the elements of pushed are unique.
     * @param popped popped.length == pushed.length
     *               popped is a permutation of pushed.
     */
    boolean validateStackSequences(int[] pushed, int[] popped);
}
