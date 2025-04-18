package leetcode.p0400_0499.p0434_number_of_segments_ina_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class NumberOfSegmentsInaStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Misleading description
                Arguments.arguments("           ", 0),
                Arguments.arguments("Hello, my name is John", 5),
                Arguments.arguments("Hello", 1),
                Arguments.arguments("love live! mu'sic forever", 4),
                Arguments.arguments("", 0)
        );
    }

    @ParameterizedTest(name = "Space {index}")
    @MethodSource("dataProvider")
    public void testSpace(String input, int expected) {
        NumberOfSegmentsInaString space = new NumberOfSegmentsInaStringSpace();
        Assertions.assertEquals(expected, space.countSegments(input));
    }
}
