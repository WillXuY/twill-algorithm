package leetcode.p1000_1099.p1018_binary_prefix_divisible_by5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BinaryPrefixDivisibleBy5Test {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 1. Bit will be too long.
                arguments(
                        new int[] {
                                1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1,
                                1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1,
                                1, 0, 1, 0, 0, 0, 1
                        },
                        Stream.of(
                                false, false, false, false, false, false, false,
                                false, false, false, false, false, false, false,
                                false, false, false, false, false, false, false,
                                false, false, false, false, false, false, false,
                                false, false, false, true, false, false, true,
                                true, true, true, false
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new int[] {0, 1, 1, 1, 1, 1},
                        Stream.of(
                                true, false, false, false, true, false
                        ).collect(Collectors.toList())
                ),
                arguments(
                        // 0,  01, 011
                        new int[] {0, 1, 1},
                        Stream.of(
                                true, false, false
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new int[] {1, 1, 1},
                        Stream.of(
                                false, false, false
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, List<Boolean> expected) {
        BinaryPrefixDivisibleBy5 loop = new BinaryPrefixDivisibleBy5Loop();
        assertArrayEquals(expected.toArray(),
                loop.prefixesDivBy5(nums).toArray());
    }
}
