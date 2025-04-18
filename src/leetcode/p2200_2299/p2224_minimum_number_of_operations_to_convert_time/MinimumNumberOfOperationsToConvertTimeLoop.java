package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MinimumNumberOfOperationsToConvertTime;

public class MinimumNumberOfOperationsToConvertTimeLoop
        implements MinimumNumberOfOperationsToConvertTime {
    @Override
    public int convertTime(String current, String correct) {
        String[] timeCurrent = current.split(":");
        String[] timeCorrect = correct.split(":");
        int output = Integer.parseInt(timeCorrect[0])
                - Integer.parseInt(timeCurrent[0]);
        int minutesDiff = Integer.parseInt(timeCorrect[1])
                - Integer.parseInt(timeCurrent[1]);
        if (minutesDiff < 0) {
            minutesDiff += 60;
            output--;
        }
        output += minutesDiff / 15;
        minutesDiff = minutesDiff % 15;
        output += minutesDiff / 5;
        minutesDiff = minutesDiff % 5;
        output += minutesDiff;
        return output;
    }
}
