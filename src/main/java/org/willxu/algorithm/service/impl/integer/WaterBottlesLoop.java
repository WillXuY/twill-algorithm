package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.WaterBottles;

public class WaterBottlesLoop implements WaterBottles {
    @Override
    public int numWaterBottles(int numBottles, int numExchange) {
        int output = numBottles;
        while (numBottles >= numExchange) {
            int exchange = numBottles / numExchange;
            output += exchange;
            numBottles = numBottles % numExchange + exchange;
        }
        return output;
    }
}
