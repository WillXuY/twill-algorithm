package leetcode.p2100_2199.p2154_keep_multiplying_found_values_by_two;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class KeepMultiplyingFoundValuesByTwoTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {5, 3, 6, 1, 12}, 3, 24),
                arguments(new int[] {2, 7, 9}, 4, 4)
        );
    }

    @ParameterizedTest(name = "Set {index}")
    @MethodSource("dataProvider")
    public void testSet(int[] nums, int original, int expected) {
        KeepMultiplyingFoundValuesByTwo set =
                new KeepMultiplyingFoundValuesByTwoSet();
        assertEquals(expected, set.findFinalValue(nums, original));
    }
}
