package leetcode.p1400_1499.p1441_build_an_array_with_stack_operations;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BuildAnArrayWithStackOperationsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {2, 3, 4}, 4,
                        Stream.of(
                                "Push", "Pop", "Push", "Push", "Push"
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new int[] {1, 3}, 3,
                        Stream.of(
                                "Push", "Push", "Pop", "Push"
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new int[] {1, 2, 3}, 3,
                        Stream.of(
                                "Push", "Push", "Push"
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new int[] {1, 2}, 4,
                        Stream.of(
                                "Push", "Push"
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] target, int n, List<String> expected) {
        BuildAnArrayWithStackOperations loop =
                new BuildAnArrayWithStackOperationsLoop();
        assertArrayEquals(expected.toArray(),
                loop.buildArray(target, n).toArray());
    }
}
