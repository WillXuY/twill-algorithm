package leetcode.p1300_1399.p1399_count_largest_group;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountLargestGroupTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(13, 4),
                arguments(2, 2),
                arguments(264, 2)
        );
    }

    @ParameterizedTest(name = "Calculate {index}")
    @MethodSource("dataProvider")
    public void testCalculate(int n, int expected) {
        CountLargestGroup calculate = new CountLargestGroupCalculate();
        assertEquals(expected, calculate.countLargestGroup(n));
    }
}
