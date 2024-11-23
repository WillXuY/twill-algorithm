package org.willxu.algorithm.service.doublepoint;

public interface AngleBetweenHandsOfClock {
    /**
     * Given two numbers, hour and minutes, return the smaller angle (in
     * degrees) formed between the hour and the minute hand.
     * <p>
     * Answers within 10-5 of the actual value will be accepted as
     * correct.
     *
     * @param hour 1 <= hour <= 12
     * @param minutes 0 <= minutes <= 59
     */
    double angleClock(int hour, int minutes);
}
