package leetcode.p1600_1699.p1641_count_sorted_vowel_strings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CountSortedVowelStringsTest {
	static Stream<Arguments> dataProvider() {
		return Stream.of(
				arguments(1, 5),
				arguments(2, 15),
				arguments(33, 66045)
		);
	}
	
	@ParameterizedTest(name = "Count {index}")
	@MethodSource("dataProvider")
	public void testCount(int n, int expected) {
		CountSortedVowelStrings count = new CountSortedVowelStringsCount();
		assertEquals(expected, count.countVowelStrings(n));
	}

}
