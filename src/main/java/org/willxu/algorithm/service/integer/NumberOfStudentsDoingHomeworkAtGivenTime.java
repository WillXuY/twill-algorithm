package org.willxu.algorithm.service.integer;

public interface NumberOfStudentsDoingHomeworkAtGivenTime {
    /**
     * Given two integer arrays startTime and endTime and given an
     * integer queryTime.
     * The ith student started doing their homework at the time
     * startTime[i] and finished it at time endTime[i].
     * Return the number of students doing their homework at time
     * queryTime. More formally, return the number of students where
     * queryTime lays in the interval [startTime[i], endTime[i]]
     * inclusive.
     *
     * @param startTime startTime.length == endTime.length
     *                  1 <= startTime.length <= 100
     * @param endTime 1 <= startTime[i] <= endTime[i] <= 1000
     * @param queryTime 1 <= queryTime <= 1000
     * @return number of students who is busy at query time.
     */
    int busyStudent(int[] startTime, int[] endTime, int queryTime);
}
