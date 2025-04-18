package org.willxu.algorithm.service.string;

public interface LatestTimeByReplacingHiddenDigits {
    /**
     * You are given a string time in the form of hh:mm, where some of
     * the digits in the string are hidden (represented by ?).
     *
     * The valid times are those inclusively between 00:00 and 23:59.
     *
     * Return the latest valid time you can get from time by replacing
     * the hidden digits.
     *
     * @param time is in the format hh:mm.
     *             It is guaranteed that you can produce a valid time
     *             from the given string.
     */
    String maximumTime(String time);
}
