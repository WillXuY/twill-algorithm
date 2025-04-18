package leetcode.p2200_2299.p2236_root_equals_sum_of_children;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.TreeNode;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RootEqualsSumOfChildrenTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                10, 4, 6
                        ).collect(Collectors.toList())),
                        true
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                5, 3, 1
                        ).collect(Collectors.toList())),
                        false
                )
        );
    }

    @ParameterizedTest(name = "Add {index}")
    @MethodSource("dataProvider")
    public void testAdd(TreeNode root, boolean expected) {
        RootEqualsSumOfChildren add = new RootEqualsSumOfChildrenAdd();
        assertEquals(expected, add.checkTree(root));
    }
}
