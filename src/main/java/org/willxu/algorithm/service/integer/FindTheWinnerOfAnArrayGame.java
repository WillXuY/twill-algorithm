package org.willxu.algorithm.service.integer;

public interface FindTheWinnerOfAnArrayGame {
	/**
	 * Given an integer array arr of distinct integers and an integer k.
	 * <p>
	 * A game will be played between the first two elements of the
	 * array (i.e. arr[0] and arr[1]). In each round of the game, we
	 * compare arr[0] with arr[1], the larger integer wins and remains
	 * at position 0, and the smaller integer moves to the end of the
	 * array. The game ends when an integer wins k consecutive rounds.
	 * <p>
	 * Return the integer which will win the game.
	 * <p>
	 * It is guaranteed that there will be a winner of the game.
	 * 
	 * @param arr 2 <= arr.length <= 10^5
	 *                      1 <= arr[i] <= 10^6
	 *                      arr contains distinct integers.
	 * @param k 1 <= k <= 10^9
	 */
	int getWinner(int[] arr, int k);
}
