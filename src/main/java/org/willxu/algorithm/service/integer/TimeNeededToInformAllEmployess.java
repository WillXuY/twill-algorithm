package org.willxu.algorithm.service.integer;

public interface TimeNeededToInformAllEmployess {
    /**
     * A company has n employees with a unique ID for each employee from
     * 0 to n - 1. The head of the company is the one with headID.
     * <p>
     * Each employee has one direct manager given in the manager array
     * where manager[i] is the direct manager of the i-th employee,
     * manager[headID] = -1. Also, it is guaranteed that the
     * subordination relationships have a tree structure.
     * <p>
     * The head of the company wants to inform all the company employees
     * of an urgent piece of news. He will inform his direct
     * subordinates, and they will inform their subordinates, and so on
     * until all employees know about the urgent news.
     * <p>
     * The i-th employee needs informTime[i] minutes to inform all of
     * his direct subordinates (i.e., After informTime[i] minutes, all
     * his direct subordinates can start spreading the news).
     * <p>
     * Return the number of minutes needed to inform all the employees
     * about the urgent news.
     * <p>
     * It is guaranteed that all the employees can be informed.
     *
     * @param n 1 <= n <= 10^5
     * @param headID 0 <= headID < n
     * @param manager manager.length == n
     *                0 <= manager[i] < n
     *                manager[headID] == -1
     * @param informTime informTime.length == n
     *                   0 <= informTime[i] <= 1000
     *                   informTime[i] == 0 if employee i has no
     *                   subordinates.
     */
    int numOfMinutes(int n, int headID, int[] manager, int[] informTime);
}
