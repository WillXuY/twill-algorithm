package leetcode.p1500_1599.p1518_water_bottles;

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
