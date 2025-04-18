package leetcode.p1500_1599.p1518_water_bottles;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class WaterBottlesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(9, 3, 13),
                arguments(15, 4, 19)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int numBottles, int numExchange, int expected) {
        WaterBottles loop = new WaterBottlesLoop();
        assertEquals(expected, loop.numWaterBottles(numBottles, numExchange));
    }
}
