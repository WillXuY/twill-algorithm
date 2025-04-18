package leetcode.p1000_1099.p1002_find_common_characters;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindCommonCharactersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new String[] {"bella", "label", "roller"},
                        Stream.of(
                                "e", "l", "l"
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new String[] {"cool", "lock", "cook"},
                        Stream.of(
                                "c", "o"
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Compare {index}")
    @MethodSource("dataProvider")
    public void testCompare(String[] words, List<String> expected) {
        FindCommonCharacters compare = new FindCommonCharactersCompare();
        assertArrayEquals(expected.toArray(),
                compare.commonChars(words).toArray());
    }
}
