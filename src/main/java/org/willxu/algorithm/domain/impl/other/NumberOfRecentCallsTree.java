package org.willxu.algorithm.domain.impl.other;

import org.willxu.algorithm.domain.other.AbstractNumberOfRecentCalls;

import java.util.Iterator;
import java.util.TreeSet;

public class NumberOfRecentCallsTree extends AbstractNumberOfRecentCalls {
    private final TreeSet<Integer> timeSet;

    public NumberOfRecentCallsTree() {
        super();
        timeSet = new TreeSet<>();
    }

    @Override
    public int ping(int t) {
        timeSet.add(t);
        Iterator<Integer> iterator = timeSet.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < t - 3000) {
                iterator.remove();
            } else {
                break;
            }
        }
        return timeSet.size();
    }
}
