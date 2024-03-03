package org.willxu.algorithm.service.integer;

public interface CarFleet {
    /**
     * There are n cars going to the same destination along a one-lane
     * road. The destination is target miles away.
     * <p>
     * You are given two integer array position and speed, both of
     * length n, where position[i] is the position of the i^th car and
     * speed[i] is the speed of the i^th car (in miles per hour).
     * <p>
     * A car can never pass another car ahead of it, but it can catch up
     * to it and drive bumper to bumper at the same speed. The faster
     * car will slow down to match the slower car's speed. The distance
     * between these two cars is ignored (i.e., they are assumed to have
     * the same position).
     * <p>
     * A car fleet is some non-empty set of cars driving at the same
     * position and same speed. Note that a single car is also a car
     * fleet.
     * <p>
     * If a car catches up to a car fleet right at the destination
     * point, it will still be considered as one car fleet.
     * <p>
     * Return the number of car fleets that will arrive at the
     * destination.
     *
     * @param target 0 < target <= 10^6
     * @param position n == position.length == speed.length
     *                 1 <= n <= 10^5
     *                 0 <= position[i] < target
     *                 All the values of position are unique.
     * @param speed 0 < speed[i] <= 10^6
     */
    int carFleet(int target, int[] position, int[] speed);
}
