package leetcode.p1100_1199.p1185_day_of_the_week;

public interface DayOfTheWeek {
    /**
     * Given a date, return the corresponding day of the week for that
     * date.
     * The input is given as three integers representing the day, month
     * and year respectively.
     * Return the answer as one of the following value
     * {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
     *  "Friday", "Saturday"}.
     *
     * @param day 1 - 31
     * @param month 1 - 12
     * @param year 1971 - 2100
     * @return day of week string.
     */
    String dayOfTheWeek(int day, int month, int year);
}
