package leetcode.p0800_0899.p0826_most_profit_assigning_work;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MostProfitAssigningWorkTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        new int[] {68, 35, 52, 47, 86},
                        new int[] {67, 17, 1, 81, 3},
                        new int[] {92, 10, 85, 84, 82},
                        324
                ),
                Arguments.arguments(
                        new int[] {2, 4, 6, 8, 10},
                        new int[] {10, 20, 30, 40, 50},
                        new int[] {4, 5, 6, 7},
                        100
                ),
                Arguments.arguments(
                        new int[] {85, 47, 57},
                        new int[] {24, 66, 99},
                        new int[] {40, 25, 25},
                        0
                )
        );
    }

    @ParameterizedTest(name = "Array {index}")
    @MethodSource("dataProvider")
    public void testArray(int[] difficulty, int[] profit,
                          int[] worker, int expected) {
        MostProfitAssigningWork array = new MostProfitAssigningWorkArray();
        assertEquals(expected,
                array.maxProfitAssignment(difficulty, profit, worker));
    }
}
