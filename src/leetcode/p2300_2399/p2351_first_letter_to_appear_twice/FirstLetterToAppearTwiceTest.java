package leetcode.p2300_2399.p2351_first_letter_to_appear_twice;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FirstLetterToAppearTwiceTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("abccbaacz", 'c'),
                arguments("abcdd", 'd')
        );
    }

    @ParameterizedTest(name = "Set {index}")
    @MethodSource("dataProvider")
    public void testSet(String s, char expected) {
        FirstLetterToAppearTwice set = new FirstLetterToAppearTwiceSet();
        assertEquals(expected, set.repeatedCharacter(s));
    }
}
