package org.willxu.algorithm.service.integer;

public interface WaterBottles {
    /**
     * There are numBottles water bottles that are initially full of
     * water. You can exchange numExchange empty water bottles from the
     * market with one full water bottle.
     *
     * The operation of drinking a full water bottle turns it into an
     * empty bottle.
     *
     * Given the two integers numBottles and numExchange, return the
     * maximum number of water bottles you can drink.
     *
     * @param numBottles 1 <= numBottles <= 100
     * @param numExchange 2 <= numExchange <= 100
     */
    int numWaterBottles(int numBottles, int numExchange);
}
