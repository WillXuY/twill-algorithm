package leetcode.p1600_1699.p1672_richest_customer_wealth;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RichestCustomerWealthTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[][] {{1, 2, 3}, {3, 2, 1}}, 6),
                arguments(new int[][] {{1, 5}, {7, 3}, {3, 5}}, 10),
                arguments(new int[][] {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}}, 17)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int[][] accounts, int expected) {
        RichestCustomerWealth count = new RichestCustomerWealthCount();
        assertEquals(expected, count.maximumWealth(accounts));
    }
}
