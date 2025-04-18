package leetcode.p1900_1999.p1941_check_if_all_characters_have_equal_number_of_occurrences;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrencesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("abacbc", true),
                arguments("aaabb", false)
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(String s, boolean expected) {
        CheckIfAllCharactersHaveEqualNumberOfOccurrences map =
                new CheckIfAllCharactersHaveEqualNumberOfOccurrencesMap();
        assertEquals(expected, map.areOccurrencesEqual(s));
    }
}
