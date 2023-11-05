package org.willxu.algorithm.service.integer;

public interface TaskScheduler {
    /**
     * Given a characters array tasks, representing the tasks a CPU
     * needs to do, where each letter represents a different task. Tasks
     * could be done in any order. Each task is done in one unit of time.
     * For each unit of time, the CPU could complete either one task or
     * just be idle.
     * <p>
     * However, there is a non-negative integer n that represents the
     * cooldown period between two same tasks (the same letter in the
     * array), that is that there must be at least n units of time
     * between any two same tasks.
     * <p>
     * Return the least number of units of times that the CPU will take
     * to finish all the given tasks.
     *
     * @param tasks 1 <= task.length <= 10^4
     *              tasks[i] is upper-case English letter.
     * @param n is in the range [0, 100].
     */
    int leastInterval(char[] tasks, int n);
}
