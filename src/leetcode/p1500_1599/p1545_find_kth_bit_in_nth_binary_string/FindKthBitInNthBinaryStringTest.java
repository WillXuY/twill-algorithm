package leetcode.p1500_1599.p1545_find_kth_bit_in_nth_binary_string;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindKthBitInNthBinaryStringTest {
	static Stream<Arguments> dataProvider() {
		return Stream.of(
				arguments(3, 1, '0'),
				arguments(4, 11, '1'),
				arguments(3, 2, '1')
		);
	}
	
	@ParameterizedTest(name = "Recursive {index}")
	@MethodSource("dataProvider")
	public void testRecursive(int n, int k, char expected) {
		FindKthBitInNthBinaryString recursive = new FindKthBitInNthBinaryStringRecursive();
		assertEquals(expected, recursive.findKthBit(n, k));
	}
}
