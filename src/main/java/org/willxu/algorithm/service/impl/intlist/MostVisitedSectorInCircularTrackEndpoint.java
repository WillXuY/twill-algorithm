package org.willxu.algorithm.service.impl.intlist;

import org.willxu.algorithm.service.intlist.MostVisitedSectorInCircularTrack;

import java.util.ArrayList;
import java.util.List;

public class MostVisitedSectorInCircularTrackEndpoint
        implements MostVisitedSectorInCircularTrack {
    @Override
    public List<Integer> mostVisited(int n, int[] rounds) {
        int start = rounds[0];
        int end = rounds[rounds.length - 1];
        List<Integer> output = new ArrayList<>();
        if (start <= end) {
            for (int i = start; i <= end; i++) {
                output.add(i);
            }
        } else {
            for (int i = 1; i <= end; i++) {
                output.add(i);
            }
            for (int i = start; i <= n; i++) {
                output.add(i);
            }
        }
        return output;
    }
}
