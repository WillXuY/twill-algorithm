package org.willxu.algorithm.service.integer;

public interface FriendsOfAppropriateAges {
    /**
     * There are n persons on a social media website. You are given an
     * integer array ages where ages[i] is the age of the i^th person.
     * <p>
     * A Person x will not send a friend request to a person y (x != y)
     * if any of the following conditions is true:
     * <p>
     * - age[y] <= 0.5 * age[x] + 7
     * - age[y] > age[x]
     * - age[y] > 100 && age[x] < 100
     * <p>
     * Otherwise, x will send a friend request to y.
     * <p>
     * Note that if x sends a request to y, y will not necessarily send
     * a request to x. Also, a person will not send a friend request to
     * themself.
     * <p>
     * Return the total number of friend requests made.
     *
     * @param ages n == ages.length
     *             1 <= n <= 2 * 10^4
     *             1 <= ages[i] <= 120
     */
    int numFriendRequests(int[] ages);
}
