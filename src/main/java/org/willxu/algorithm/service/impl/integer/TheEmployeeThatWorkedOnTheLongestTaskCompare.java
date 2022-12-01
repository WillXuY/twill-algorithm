package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.TheEmployeeThatWorkedOnTheLongestTask;

public class TheEmployeeThatWorkedOnTheLongestTaskCompare
        implements TheEmployeeThatWorkedOnTheLongestTask {
    @Override
    public int hardestWorker(int n, int[][] logs) {
        int output = logs[0][0];
        int maxTime = logs[0][1];
        for (int i = 1; i < logs.length; i++) {
            int k = logs[i][0];
            int time = logs[i][1] - logs[i - 1][1];
            if (time > maxTime) {
                output = k;
                maxTime = time;
            } else if (time == maxTime && k < output) {
                output = k;
            }
        }
        return output;
    }
}
