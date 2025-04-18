package leetcode.p1100_1199.p1154_day_of_the_year;

public interface DayOfTheYear {
    /**
     * Given a string date representing a Gregorian calendar date
     * formatted as YYYY-MM-DD, return the day number of the year.
     *
     * @param date date.length == 10
     *             date[4] == date[7] == '-', and all other date[i]'s
     *             are digits
     *             date represents a calendar date between Jan 1^st,
     *             1900 and Dec 31^th, 2019.
     * @return the day of year.
     */
    int dayOfYear(String date);
}
