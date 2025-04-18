package leetcode.p0700_0799.p0731_my_calendar_ii;

/**
 * You are implementing a program to use as your calendar. We can
 * add a new event if adding the event will not cause a triple
 * booking.
 * <p>
 * A triple booking happens when three events have some non-empty
 * intersection (i.e., some moment is common to all the three
 * events.).
 * <p>
 * The event can be represented as a pair of integers start and end
 * that represents a booking on the half-open interval [start, end),
 * the range of real numbers x such that start <= x < end.
 * <p>
 * Implement the MyCalendarTwo class:
 * <p>
 * - MyCalendarTwo() Initializes the calendar object.
 */
public interface MyCalendarIi {
    /**
     * @param start,end 0 <= start < end <= 10^9
     *                  At most 1000 calls will be made to book.
     * @return true if the event can be added to the calendar
     *         successfully without causing a triple booking. Otherwise,
     *         return false and do not add the event to the calendar.
     */
    boolean book(int start, int end);
}
