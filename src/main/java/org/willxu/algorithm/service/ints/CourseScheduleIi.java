package org.willxu.algorithm.service.ints;

public interface CourseScheduleIi {
    /**
     * There are a total of numCourses courses you have to take, labeled
     * from 0 to numCourses - 1. You are given an array prerequisites
     * where prerequisites[i] = [a_i, b_i] indicates that you must take
     * course b_i first if you want to take course a_i.
     * <p>
     * - For example, the pair [0, 1], indicates that to take course 0
     *   you have to first take course 1.
     * <p>
     * Return the ordering of courses you should take to finish all
     * courses. If there are many valid answers, return any of them. If
     * it is impossible to finish all courses, return an empty array.
     *
     * @param numCourses 1 <= numCourses <= 2000
     *                   0 <= prerequisites.length
     *                   <= numCourses * (numCourses - 1)
     * @param prerequisites prerequisites[i].length == 2
     *                      0 <= a_i, b_i < numCourses
     *                      a_i != b_i
     *                      All the pairs [a_i, b_i] are distinct.
     */
    int[] findOrder(int numCourses, int[][] prerequisites);
}
