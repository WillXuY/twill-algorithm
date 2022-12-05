package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.DetermineIfTwoEventsHaveConflict;

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
