package leetcode.p1600_1699.p1646_get_maximum_in_generated_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class GetMaximumInGeneratedArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(4, 2),
                // 0, 1, 1, 2, 1, 3, 2, 3
                arguments(7, 3),
                arguments(2, 1),
                arguments(3, 2)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int n, int expected) {
        GetMaximumInGeneratedArray loop = new GetMaximumInGeneratedArrayLoop();
        assertEquals(expected, loop.getMaximumGenerated(n));
    }
}
