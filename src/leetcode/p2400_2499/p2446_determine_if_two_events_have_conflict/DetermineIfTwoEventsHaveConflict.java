package leetcode.p2400_2499.p2446_determine_if_two_events_have_conflict;

public interface DetermineIfTwoEventsHaveConflict {
    /**
     * You are given two arrays of strings that represent two inclusive
     * events that happened on the same day, event1 and event2, where:
     * <p>
     * - event1 = [startTime1, endTime1] and
     * - event2 = [startTime2, endTime2].
     * <p>
     * Event times are valid 24 hours format in the form of HH:MM.
     * <p>
     * A conflict happens when two events have some non-empty
     * intersection (i.e., some moment is common to both events).
     * <p>
     * Return true if there is a conflict between two events. Otherwise,
     * return false.
     *
     * @param event1,event2 evnet1.length == event2.length == 2.
     *                      event1[i].length == event2[i].length == 5
     *                      startTime1 <= endTime1
     *                      startTime2 <= endTime2
     *                      All the event times follow the HH:MM format.
     */
    boolean haveConflict(String[] event1, String[] event2);
}
