package org.willxu.algorithm.service.bool;

public interface CheckArrayFormationThroughConcatenation {
    /**
     * You are given an array of distinct integers arr and an array of
     * integer arrays pieces, where the integers in pieces are distinct.
     * Your goal is to form arr by concatenating the arrays in pieces in
     * any order. However, you are not allowed to reorder the integers
     * in each array pieces[i].
     *
     * Return true if it is possible to form the array arr from pieces.
     * Otherwise, return false.
     *
     * @param arr 1 <= arr[i], pieces[i][j] <= 100
     *            The integers in arr are distinct.
     * @param pieces 1 <= pieces.length <= arr.length <= 100
     *               sum(pieces[i].length) == arr.length
     *               1 <= pieces[i].length <= arr.length
     *               The integers in pieces are distinct (i.e., If we
     *               flatten pieces in a 1D array, all the integers in
     *               this array are distinct).
     */
    boolean canFormArray(int[] arr, int[][] pieces);
}
