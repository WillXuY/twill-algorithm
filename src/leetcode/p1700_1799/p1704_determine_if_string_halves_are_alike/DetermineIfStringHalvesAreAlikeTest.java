package leetcode.p1700_1799.p1704_determine_if_string_halves_are_alike;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DetermineIfStringHalvesAreAlikeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("book", true),
                arguments("textbook", false)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String s, boolean expected) {
        DetermineIfStringHalvesAreAlike count =
                new DetermineIfStringHalvesAreAlikeCount();
        assertEquals(expected, count.halvesAreAlike(s));
    }
}
