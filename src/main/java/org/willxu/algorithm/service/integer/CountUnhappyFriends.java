package org.willxu.algorithm.service.integer;

public interface CountUnhappyFriends {
	/**
	 * You are given a list of preferences for n friends, where n is
	 * always even.
	 * <p>
	 * For each person i, preferences[i] contains a list of friends
	 * sorted in the order of preference. In other words, a friend
	 * earlier in the list is more preferred than a friend later in the
	 * list. Friends in each list are denoted by integers from 0 to n-1.
	 * <p>
	 * All the friends are divided into pairs. The pairings are given in
	 * a list pairs, where pairs[i] = [x_i, y_i] denotes x_i is paired
	 * with y_i and y_i is paired with x_i.
	 * <p>
	 * However, this pairing may cause some of the friends to be
	 * unhappy. A friend x is unhappy if x is paired with y and there
	 * exists a friend u who is paired with v but:
	 * <p>
	 * - x prefers u over y, and
	 * - u prefers x over v.
	 * <p>
	 * Return the number of unhappy friends.
	 * 
	 * @param n 2 <= n <= 500
	 *          n is even.
	 * @param preferences preferences.length == n
	 *                    preferences[i].length == n - 1
	 *                    0 <= preferences[i][j] <= n - 1
	 *                    preferences[i] does not contain i.
	 *                    All values in preferences[i] are unique.
	 * @param pairs pairs.length == n/2
	 *              pairs[i].length == 2
	 *              x_i != y_i
	 *              0 <= x_i, y_i <= n - 1
	 *              Each person is contained in exactly one pair.
	 */
	int unhappyFriends(int n, int[][] preferences, int[][] pairs);
}
