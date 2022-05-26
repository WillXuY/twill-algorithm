package org.willxu.algorithm.domain.other;

/**
 * Design a parking system for a parking lot. The parking lot has three
 * kinds of parking spaces: big, medium, and small, with a fixed number
 * of slots for each size.
 *
 * Implement the ParkingSystem class:
 */
public abstract class AbstractDesignParkingSystem {
    protected final int TYPE_BIG = 1;
    protected final int TYPE_MEDIUM = 2;
    protected final int TYPE_SMALL = 3;

    /**
     * ParkingSystem(int big, int medium, int small) Initializes object
     * of the ParkingSystem class. The number of slots for each parking
     * space are given as part of the constructor.
     *
     * @param big,medium,small 0 <= big, medium, small <= 1000
     */
    public AbstractDesignParkingSystem(int big, int medium, int small) {}

    /**
     * bool addCar(int carType) Checks whether there is a parking space
     * of carType for the car that wants to get into the parking lot.
     * carType can be of three kinds: big, medium, or small, which are
     * represented by 1, 2, and 3 respectively. A car can only park in a
     * parking space of its carType. If there is no space available,
     * return false, else park the car in that size space and return
     * true.
     *
     * @param carType is 1, 2, or 3
     */
    public abstract boolean addCar(int carType);
}
