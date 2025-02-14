package org.willxu.algorithm.service.character;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.character.FindKthBitInNthBinaryStringRecursive;

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
	public void testRecursive(int n, int k, char excepted) {
		FindKthBitInNthBinaryString recursive = new FindKthBitInNthBinaryStringRecursive();
		assertEquals(excepted, recursive.findKthBit(n, k));
	}
}
