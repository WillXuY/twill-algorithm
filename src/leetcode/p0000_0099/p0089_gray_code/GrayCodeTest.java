package leetcode.p0000_0099.p0089_gray_code;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class GrayCodeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(2,
                        Stream.of(0, 1, 3, 2).collect(Collectors.toList())
                ),
                arguments(1,
                        Stream.of(0, 1).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(int n, List<Integer> expected) {
        GrayCode recursive = new GrayCodeRecursive();
        assertEquals(expected, recursive.grayCode(n));
    }
}
