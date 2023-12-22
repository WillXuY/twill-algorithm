package org.willxu.algorithm.domain.other;

public interface MyCalendarI {
    /**
     * You are implementing a program to use as your calendar. We can
     * add a new event if adding the event will not cause a double
     * booking.
     * <p>
     * A double booking happens when two events have some non-empty
     * intersection (i.e., some moment is common to both events.).
     * <p>
     * The event can be represented as a pair of integers start and end
     * that represents a booking on the half-open interval [start, end),
     * the range of real numbers x such that start <= x < end.
     * <p>
     * Implement the MyCalendar class:
     * <p>
     * - MyCalendar() Initializes the calendar object.
     * - boolean book(int start, int end) Returns true if the event can
     *   be added to the calendar successfully without causing a double
     *   booking. Otherwise, return false and do not add the event to
     *   the calendar.
     *
     * @param start,end 0 <= start < end <= 10^9
     *                  At most 1000 calls will be made to book.
     */
    boolean book(int start, int end);
}
