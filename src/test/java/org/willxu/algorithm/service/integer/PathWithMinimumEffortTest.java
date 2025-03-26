package org.willxu.algorithm.service.integer;

import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;

import org.junit.jupiter.params.provider.Arguments;

public class PathWithMinimumEffortTest {
	static Stream<Arguments> dataProvider() {
		return Stream.of(
				arguments(
						new int[][] {
							{1, 2, 2},
							{3, 8, 2},
							{5, 3, 5}
						},
						2
				),
				arguments(
						new int[][] {
							{1, 2, 3},
							{3, 8, 4},
							{5, 3, 5}
						},
						1
				),
				arguments(
						new int[][] {
							{1, 2, 1, 1, 1},
							{1, 2, 1, 2, 1},
							{1, 2, 1, 2, 1},
							{1, 2, 1, 2, 1},
							{1, 1, 1, 2, 1}
						},
						0
				)
		);
	}

}
