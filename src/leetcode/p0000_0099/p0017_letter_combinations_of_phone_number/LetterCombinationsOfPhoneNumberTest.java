package leetcode.p0000_0099.p0017_letter_combinations_of_phone_number;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LetterCombinationsOfPhoneNumberTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        "23",
                        Stream.of(
                                "ad","ae","af","bd","be","bf","cd","ce","cf"
                        ).collect(Collectors.toList())
                ),
                arguments("", Collections.emptyList()),
                arguments(
                        "2",
                        Stream.of(
                                "a", "b", "c"
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Array {index}")
    @MethodSource("dataProvider")
    public void testArray(String digits, List<String> expected) {
        LetterCombinationsOfPhoneNumber array =
                new LetterCombinationsOfPhoneNumberArray();
        assertEquals(expected, array.letterCombinations(digits));
    }
}
