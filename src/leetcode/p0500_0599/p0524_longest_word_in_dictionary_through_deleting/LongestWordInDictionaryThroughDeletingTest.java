package leetcode.p0500_0599.p0524_longest_word_in_dictionary_through_deleting;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestWordInDictionaryThroughDeletingTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        "abpcplea",
                        Stream.of(
                                "ale", "apple", "monkey", "plea"
                        ).collect(Collectors.toList()),
                        "apple"
                ),
                Arguments.arguments(
                        "abpcplea",
                        Stream.of(
                                "a", "b", "c"
                        ).collect(Collectors.toList()),
                        "a"
                )
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(String s, List<String> dictionary, String expected) {
        LongestWordInDictionaryThroughDeleting map =
                new LongestWordInDictionaryThroughDeletingMap();
        assertEquals(expected, map.findLongestWord(s, dictionary));
    }
}
