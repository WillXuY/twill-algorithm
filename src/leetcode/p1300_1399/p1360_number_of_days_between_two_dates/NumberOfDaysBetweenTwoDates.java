package leetcode.p1300_1399.p1360_number_of_days_between_two_dates;

public interface NumberOfDaysBetweenTwoDates {
    /**
     * Write a program to count the number of days between two dates.
     * The two dates are given as strings, their format is YYYY-MM-DD as
     * shown in the examples.
     * Constraints:
     * The given dates are valid dates between the years 1971 and 2100.
     *
     * @param date1 YYYY-MM-DD
     * @param date2 YYYY-MM-DD
     * @return date1 - date2
     */
    int daysBetweenDates(String date1, String date2);
}
