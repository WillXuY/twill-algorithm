package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.NumberOfStudentsDoingHomeworkAtGivenTime;

public class NumberOfStudentsDoingHomeworkAtGivenTimeLoop
        implements NumberOfStudentsDoingHomeworkAtGivenTime {
    @Override
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int output = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                output++;
            }
        }
        return output;
    }
}
