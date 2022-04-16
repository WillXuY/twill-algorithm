package org.willxu.algorithm.service.strlist;

import java.util.List;

public interface BinaryWatch {
    /**
     * A binary watch has 4 LEDs on top which represent the hours
     * (0-11), and the 6 LEDs on the bottom represent the minutes
     * (0-59). Each LED represents a zero or one, with the least
     * significant bit on the right.
     *
     * - For example, the below binary watch reads "4:51".
     *   H 8 [4] 2 1 PM
     *   M [32] [16] 8 4 [2] [1]
     *
     * Given an integer turnedOn with represents the number of LEDs that
     * are currently on, return all possible times the watch could
     * represent. You may return the answer in any order.
     *
     *
     * @param turnedOn 0 <= turnedOn <= 10
     * @return all the possible times the watch could represent.
     *         The hour must not contain a leading zero.
     *         - For example, "01:00" is not valid. It should be "1:00".
     *         The minute must be consist of two digits and may contain
     *         a leading zero.
     *         - For example, "10:2" is not valid. It should be "10:02".
     */
    List<String> readBinaryWatch(int turnedOn);
}
