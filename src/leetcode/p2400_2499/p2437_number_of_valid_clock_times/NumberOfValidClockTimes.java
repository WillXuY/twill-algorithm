package leetcode.p2400_2499.p2437_number_of_valid_clock_times;

public interface NumberOfValidClockTimes {
    /**
     * You are given a string of length 5 called time, representing the
     * current time on a digital clock in the format "hh:mm". The
     * earliest possible time is "00:00" and the latest possible time is
     * "23:59".
     * <p>
     * In the string time, the digits represented by the ? symbol are
     * unknown, and must be replaced with a digit from 0 to 9.
     * <p>
     * Return an integer answer, the number of valid clock times that
     * can be created by replacing every ? with a digit from 0 to 9.
     *
     * @param time time is a valid string of length 5 in the format
     *             "hh:mm".
     *             "00" <= hh <= "23"
     *             "00" <= mm <= "59"
     *             Some of the digits might be replaced with '?' and
     *             need to be replaced with digits from 0 to 9.
     */
    int countTime(String time);
}
