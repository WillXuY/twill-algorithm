package leetcode.p0900_0999.p0942_di_string_match;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DiStringMatchTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /*
                Count I | Count D | output
                0         0         0
                1         0         4
                1         1         1
                2         1         3
                2         2         2
                 */
                arguments("IDID", new int[] {0, 3, 1, 4, 2}),
                arguments("III", new int[] {0, 1, 2, 3}),
                arguments("DDI", new int[] {3, 1, 0, 2})
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String s, int[] expected) {
        DiStringMatch loop = new DiStringMatchLoop();
        assertArrayEquals(expected, loop.diStringMatch(s));
    }
}
