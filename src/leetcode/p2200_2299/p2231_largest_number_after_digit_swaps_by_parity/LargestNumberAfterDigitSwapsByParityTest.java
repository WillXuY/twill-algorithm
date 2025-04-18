package leetcode.p2200_2299.p2231_largest_number_after_digit_swaps_by_parity;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LargestNumberAfterDigitSwapsByParityTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(1234, 3412),
                arguments(65875, 87655)
        );
    }

    @ParameterizedTest(name = "Order {index}")
    @MethodSource("dataProvider")
    public void testOrder(int num, int expected) {
        LargestNumberAfterDigitSwapsByParity order =
                new LargestNumberAfterDigitSwapsByParityOrder();
        assertEquals(expected, order.largestInteger(num));
    }
}
