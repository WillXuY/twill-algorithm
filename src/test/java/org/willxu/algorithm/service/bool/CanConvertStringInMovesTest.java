package org.willxu.algorithm.service.bool;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.CanConvertStringInMovesCount;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CanConvertStringInMovesTest {
    static Stream<Arguments> dataProvider() {
		return Stream.of(
				arguments("input", "ouput", 9, true),
				arguments("abc", "bcd", 10, false),
				arguments("aab", "bbb", 27, true)
		);
	}
    
    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String s, String t, int k, boolean excepted) {
    	CanConvertStringInMoves count = new CanConvertStringInMovesCount();
    	assertEquals(excepted, count.canConvertString(s, t, k));
    }
}
