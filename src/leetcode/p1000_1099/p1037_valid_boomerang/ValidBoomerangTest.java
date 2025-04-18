package leetcode.p1000_1099.p1037_valid_boomerang;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ValidBoomerangTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[][] {
                                {1, 1},
                                {2, 3},
                                {3, 2}
                        },
                        true
                ),
                arguments(
                        new int[][] {
                                {1, 1},
                                {2, 2},
                                {3, 3}
                        },
                        false
                )
        );
    }

    @ParameterizedTest(name = "Calculate {index}")
    @MethodSource("dataProvider")
    public void testCalculate(int[][] points, boolean expected) {
        ValidBoomerang calculate = new ValidBoomerangCalculate();
        assertEquals(expected, calculate.isBoomerang(points));
    }
}
