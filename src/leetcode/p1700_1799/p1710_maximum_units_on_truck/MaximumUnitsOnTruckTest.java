package leetcode.p1700_1799.p1710_maximum_units_on_truck;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaximumUnitsOnTruckTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[][] {{1, 3}, {2, 2}, {3, 1}}, 4, 8),
                arguments(new int[][] {{5, 10}, {2, 5}, {4, 7}, {3, 9}}, 10, 91)
        );
    }

    @ParameterizedTest(name = "Sort {index}")
    @MethodSource("dataProvider")
    public void testSort(int[][] boxTypes, int truckSize, int expected) {
        MaximumUnitsOnTruck sort = new MaximumUnitsOnTruckSort();
        assertEquals(expected, sort.maximumUnits(boxTypes, truckSize));
    }
}
