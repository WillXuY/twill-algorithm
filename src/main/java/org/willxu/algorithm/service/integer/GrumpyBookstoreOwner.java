package org.willxu.algorithm.service.integer;

public interface GrumpyBookstoreOwner {
    /**
     * There is a bookstore owner that has a store open for n minutes.
     * Every minute, some number of customers enter the store. You are
     * given an integer array customers of length n where customers[i]
     * is the number of the customer that enters the store at the start
     * of the i^th minute and all those customers leave after the end of
     * that minute.
     * <p>
     * On some minutes, the bookstore owner is grumpy. You are given a
     * binary array grumpy where grumpy[i] is 1 if the bookstore owner
     * is grumpy during the i^th minute, and is 0 otherwise.
     * <p>
     * When the bookstore owner is grumpy, the customers of that minute
     * are not satisfied, otherwise, they are satisfied.
     * <p>
     * The bookstore owner knows a secret technique to keep themselves
     * not grumpy for minutes consecutive minutes, but can only use it
     * once.
     * <p>
     * Return the maximum number of customers that can be satisfied
     * throughout the day.
     *
     * @param customers n == customers.length == grumpy.length
     *                  0 <= customers[i] <= 1000
     * @param grumpy grumpy[i] is either 0 or 1.
     * @param minutes 1 <= minutes <= n <= 2 * 10^4
     */
    int maxSatisfied(int[] customers, int[] grumpy, int minutes);
}
