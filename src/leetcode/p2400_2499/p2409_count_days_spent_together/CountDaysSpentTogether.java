package org.willxu.algorithm.service.integer;

public interface CountDaysSpentTogether {
    /**
     * Alice and Bob are traveling to Rome for separate business
     * meetings.
     * <p>
     * You are given 4 strings arriveAlice, leaveAlice, arriveBob, and
     * leaveBob. Alice will be in the city from the dates arriveAlice to
     * leaveAlice (inclusive), while Bob will be in the city from the
     * dates arriveBob to leaveBob (inclusive). Each will be a
     * 5-character string in the format "MM-DD", corresponding to the
     * month and day of the date.
     * <p>
     * Return the total number of days that Alice and Bob are in Rome
     * together.
     * <p>
     * You can assume that all dates occur in the same calendar year,
     * which is not a leap year. Note that the number of days per month
     * can be represented as: [31, 28, 31, 30, 31, 30, 31, 31, 30, 31,
     * 30, 31].
     * <p>
     * - All dates are provided in the format "MM-DD".
     * - Alice and Bob's arrival dates are earlier than or equal to
     *   their leaving dates.
     * - The given dates are valid dates of a non-leap year.
     */
    int countDaysTogether(String arriveAlice, String leaveAlice,
                          String arriveBob, String leaveBob);
}
