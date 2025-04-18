package leetcode.p2200_2299.p2224_minimum_number_of_operations_to_convert_time;

public interface MinimumNumberOfOperationsToConvertTime {
    /**
     * You are given two strings current and correct representing two
     * 24-hour times.
     * <p>
     * 24-hour times are formatted as "HH:MM", where HH is between 00
     * and 23, and MM is between 00 and 59. The earliest 24-hour time is
     * 00:00, and the latest is 23:59.
     * <p>
     * In one operation you can increase the time current by 1, 5, 15,
     * or 60 minutes. You can perform this operation any number of
     * times.
     * <p>
     * Return the minimum number of operations needed to convert current
     * to correct.
     *
     * @param current,correct are in the format "HH:MM"
     *                        current <= correct
     */
    int convertTime(String current, String correct);
}
