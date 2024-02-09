package org.willxu.algorithm.service.integer;

public interface MostProfitAssigningWork {
    /**
     * You have n jobs and m workers. You are given three arrays:
     * difficulty, profit, and worker where:
     * <p>
     * - difficulty[i] and profit[i] are the difficulty and the profit
     *   of the i^th job, and
     * - worker[j] is the ability of j^th worker (i.e., the j^th worker
     *   can only complete a job with difficulty at most worker[j]).
     * - Every worker can be assigned at most one job, but one job can
     *   be completed multiple times.
     * <p>
     * - For example, if three workers attempt the same job that pays $1,
     *   then the total profit will be $3. If a worker cannot complete
     *   any job, their profit is $0.
     * <p>
     * Return the maximum profit we can achieve after assigning the
     * workers to the jobs.
     *
     * @param difficulty n == difficulty.length
     *                   1 <= difficulty[i] <= 10^5
     * @param profit n == profit.length
     *               1 <= profit[i] <= 10^5
     * @param worker m == worker.length
     *               1 <= n, m <= 10^4
     *               1 <= worker[i] <= 10^5
     */
    int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker);
}
