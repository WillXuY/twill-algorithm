package org.willxu.algorithm.service.integer;

public interface TheEmployeeThatWorkedOnTheLongestTask {
    /**
     * There are n employees, each with a unique id from 0 to n - 1.
     * <p>
     * You are given a 2D integer array logs where logs[i] =
     * [id_i, leaveTime_i] where:
     * <p>
     * - id_i is the id of the employee that worked on the ith task, and
     * - leaveTime_i is the time at which the employee finished the ith
     *   task. All the values leaveTime_i are unique.
     * Note that the ith task starts the moment right after the
     * (i - 1)th task ends, and the 0th task starts at time 0.
     * <p>
     * Return the id of the employee that worked the task with the
     * longest time. If there is a tie between two or more employees,
     * return the smallest id among them.
     *
     * @param n 2 <= n <= 500
     *          0 <= id_i <= n - 1
     *          1 <= leaveTime_i <= 500
     *          id_i != id_i+1
     *          leaveTime_i are sorted in a strictly increasing order.
     * @param logs 1 <= logs.length <= 500
     *             logs[i].length == 2
     */
    int hardestWorker(int n, int[][] logs);
}
