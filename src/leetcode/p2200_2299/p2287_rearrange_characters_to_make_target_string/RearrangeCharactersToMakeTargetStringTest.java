package leetcode.p2200_2299.p2287_rearrange_characters_to_make_target_string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RearrangeCharactersToMakeTargetStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("ilovecodingonleetcode", "code", 2),
                arguments("abcba", "abc", 1),
                arguments("abbaccaddaeea", "aaaaa", 1)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String s, String target, int expected) {
        RearrangeCharactersToMakeTargetString count =
                new RearrangeCharactersToMakeTargetStringCount();
        assertEquals(expected, count.rearrangeCharacters(s, target));
    }
}
