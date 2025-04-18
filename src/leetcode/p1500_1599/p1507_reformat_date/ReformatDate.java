package leetcode.p1500_1599.p1507_reformat_date;

public interface ReformatDate {
    /**
     * Given a date string in the form Day Month Year, where:
     *
     * - Day is in the set {"1st", "2nd", "3rd", "4th", ..., "30th",
     *   "31st"}.
     * - Month is in the set {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
     *   "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}.
     * - Year is in the range [1900, 2100].
     *
     * Convert the date string to the format YYYY-MM-DD, where:
     *
     * - YYYY denotes the 4 digit year.
     * - MM denotes the 2 digit month.
     * - DD denotes the 2 digit day.
     *
     * @param date The given dates are guaranteed to be valid, so no
     *             error handling is necessary.
     */
    String reformatDate(String date);
}
