package org.willxu.algorithm.service.boolist;

import java.util.List;

public interface CourseScheduleIv {
    /**
     * There are a total of numCourses courses you have to take, labeled
     * from 0 to numCourses - 1. You are given an array prerequisites
     * where prerequisites[i] = [a_i, b_i] indicates that you must take
     * course a_i first if you want to take course b_i.
     * <p>
     * - For example, the pair [0, 1] indicates that you have to take
     *   course 0 before you can take course 1.
     * <p>
     * Prerequisites can also be indirect. If course a is a prerequisite
     * of course b, and course b is a prerequisite of course c, then
     * course a is a prerequisite of course c.
     * <p>
     * You are also given an array queries where queries[j] = [u_j, v_j].
     * For the j^th query, you should answer whether course u_j is a
     * prerequisite of course v_j or not.
     * <p>
     * Return a boolean array answer, where answer[j] is the answer to
     * the jth query.
     *
     * @param numCourses 2 <= numCourses <= 100
     * @param prerequisites 0 <= prerequisites.length <= (numCourses * (numCourses - 1) / 2)
     *                      prerequisites[i].length == 2
     *                      0 <= a_i, b_i <= numCourses - 1
     *                      a_i != b_i
     *                      All the pairs [a_i, b_i] are unique.
     *                      The prerequisites graph has no cycles.
     * @param queries 1 <= queries.length <= 10^4
     *                0 <= u_i, v_i <= numCourses - 1
     *                u_i != v_i
     * @return
     */
    List<Boolean> checkIfPrerequisite(int numCourses,
                                      int[][] prerequisites, int[][] queries);
}
