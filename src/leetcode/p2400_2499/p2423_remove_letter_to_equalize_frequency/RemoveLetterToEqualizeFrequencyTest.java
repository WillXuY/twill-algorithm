package leetcode.p2400_2499.p2423_remove_letter_to_equalize_frequency;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RemoveLetterToEqualizeFrequencyTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("zz", true),
                arguments("aabcbb", false),
                arguments("babbdd", false),
                arguments("aca", true),
                arguments("cbccca", false),
                arguments("ddaccb", false),
                arguments("abbcc", true),
                arguments("bac", true),
                arguments("abcc", true),
                arguments("aazz", false)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String word, boolean expected) {
        RemoveLetterToEqualizeFrequency count =
                new RemoveLetterToEqualizeFrequencyCount();
        assertEquals(expected, count.equalFrequency(word));
    }
}
