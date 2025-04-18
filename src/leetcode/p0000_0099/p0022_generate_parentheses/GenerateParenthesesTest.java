package leetcode.p0000_0099.p0022_generate_parentheses;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class GenerateParenthesesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        4,
                        Stream.of(new String[] {
                                "(((())))","((()()))","((())())","((()))()",
                                "(()(()))","(()()())","(()())()","(())(())",
                                "(())()()","()((()))","()(()())","()(())()",
                                "()()(())","()()()()"
                        }).collect(Collectors.toList())
                ),
                arguments(
                        3,
                        Stream.of(new String[] {
                                "((()))", "(()())", "(())()", "()(())", "()()()"
                        }).collect(Collectors.toList())
                ),
                arguments(
                        2,
                        Stream.of(new String[] {
                                "(())", "()()"
                        }).collect(Collectors.toList())
                ),
                arguments(1, Stream.of("()").collect(Collectors.toList()))
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(int n, List<String> expected) {
        GenerateParentheses recursive = new GenerateParenthesesRecursive();
        assertEquals(new HashSet<>(expected),
                new HashSet<>(recursive.generateParenthesis(n)));
    }
}
