package leetcode.p2400_2499.p2446_determine_if_two_events_have_conflict;

public class DetermineIfTwoEventsHaveConflictCompare
        implements DetermineIfTwoEventsHaveConflict {
    @Override
    public boolean haveConflict(String[] event1, String[] event2) {
        String start = event1[0];
        if (start.compareTo(event2[0]) < 0) {
            start = event2[0];
        }
        String end = event1[1];
        if (end.compareTo(event2[1]) > 0) {
            end = event2[1];
        }
        return start.compareTo(end) <= 0;
    }
}
