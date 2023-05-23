package org.willxu.algorithm.service.bool;

public interface CourseSchedule {
    /**
     * There are a total of numCourses courses you have to take, labeled
     * from 0 to numCourses - 1. You are given an array prerequisites
     * where prerequisites[i] = [a_i, b_i] indicates that you must take
     * course bi first if you want to take course a_i.
     * <p>
     * - For example, the pair [0, 1], indicates that to take course 0
     *   you have to first take course 1.
     * <p>
     * Return true if you can finish all courses. Otherwise, return
     * false.
     *
     * @param numCourses 1 <= numCourses <= 2000
     *                   0 <= ai, bi < numCourses
     * @param prerequisites 0 <= prerequisites.length <= 5000
     *                      prerequisites[i].length == 2
     *                      All the pairs prerequisites[i] are unique.
     */
    boolean canFinish(int numCourses, int[][] prerequisites);
}
