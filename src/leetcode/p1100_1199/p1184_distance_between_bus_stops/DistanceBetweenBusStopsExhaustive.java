package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.DistanceBetweenBusStops;

public class DistanceBetweenBusStopsExhaustive
        implements DistanceBetweenBusStops {
    @Override
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int orderSum = 0;
        int reverseSum = 0;
        for (int i = 0; i < distance.length; i++) {
            if (start > destination) {
                if (i >= start || i < destination) {
                    orderSum += distance[i];
                } else {
                    reverseSum += distance[i];
                }
            } else {
                if (i >= start && i < destination) {
                    orderSum += distance[i];
                } else {
                    reverseSum += distance[i];
                }
            }
        }
        return Math.min(orderSum, reverseSum);
    }
}
