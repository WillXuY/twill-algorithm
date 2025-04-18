package leetcode.p1600_1699.p1609_even_odd_tree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.TreeNode;

public class EvenOddTreeTest {
	static Stream<Arguments> dataProvider() {
		return Stream.of(
				arguments(
						TreeNode.initByListLevel(Stream.of(
								2,
								12, 8,
								5, 9, null, null,
								18, 16
						).toList()),
						false
				),
				arguments(
						TreeNode.initByListLevel(Stream.of(
								1, 10, 4, 3, null, 7, 9, 12, 8, 6, null, null, 2
						).toList()),
						true
				),
				arguments(
						TreeNode.initByListLevel(Stream.of(
								5, 4, 2, 3, 3, 7
						).toList()),
						false
				),
				arguments(
						TreeNode.initByListLevel(Stream.of(
								5, 9, 1, 3, 5, 7
						).toList()),
						false
				)
		);
	}

	/**
	 * Time out exceeded.
	 */
	@ParameterizedTest(name = "Recursive {index}")
	@MethodSource("dataProvider")
	public void testRecursive(TreeNode root, boolean expected) {
		EvenOddTree recursive = new EvenOddTreeRecursive();
		assertEquals(expected, recursive.isEvenOddTree(root));
	}
}
