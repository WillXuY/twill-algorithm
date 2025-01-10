package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.LargestOddNumberInStringIndex;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LargestOddNumberInStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("52", "5"),
                arguments("4206", ""),
                arguments("35427", "35427")
        );
    }

    @ParameterizedTest(name = "Index {index}")
    @MethodSource("dataProvider")
    public void testIndex(String num, String excepted) {
        LargestOddNumberInString index = new LargestOddNumberInStringIndex();
        assertEquals(excepted, index.largestOddNumber(num));
    }
}
