package leetcode.p1100_1199.p1184_distance_between_bus_stops;

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
